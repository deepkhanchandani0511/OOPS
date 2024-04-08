import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class CropSuggestionPortal extends JFrame implements ActionListener {

    private JButton homeButton,Next, aboutButton, exitButton;
    public String District;
    public String Season;
    public String Temp;
    public String Water;
    public String Land;

    public CropSuggestionPortal()
    {

        ImageIcon x = new ImageIcon("photo.jpg");
        Image y = x.getImage();
        Image z = y.getScaledInstance(1400, 750, Image.SCALE_SMOOTH);
        ImageIcon vaishnavi = new ImageIcon(z);
        JLabel aniket= new JLabel(vaishnavi);




        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(1, 4, 0, 5));


        homeButton = new JButton("Home");
        homeButton.setPreferredSize(new Dimension(100, 40));
        homeButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        homeButton.addActionListener(this);
        menuPanel.add(homeButton);


        Next=new JButton("NEXT-->");
        Next.setPreferredSize(new Dimension(100, 40));
        Next.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        Next.addActionListener(this);
        menuPanel.add(Next);

        aboutButton = new JButton("About Us");
        aboutButton.setPreferredSize(new Dimension(100, 40));
        aboutButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        aboutButton.addActionListener(this);
        menuPanel.add(aboutButton);

        exitButton = new JButton("Log Out");
        exitButton.setPreferredSize(new Dimension(100, 40));
        exitButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        exitButton.addActionListener(this);
        menuPanel.add(exitButton);




        JFrame frame = new JFrame("Crop Suggestion Portal");
        frame.setSize(1500,800);
        frame.setResizable(false);
        frame.setVisible(true);


        frame.add(menuPanel,BorderLayout.SOUTH);
        frame.add(aniket);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource() == homeButton)
        {

            new CropSuggestionPortal();
        }


        else if (e.getSource() == Next)
        {


            JFrame frame = new JFrame("Crop Suggestion Portal");

            frame.setSize(1500, 800);
            frame.setResizable(false);
            frame.setVisible(true);


            ImageIcon p = new ImageIcon("agri.jpg");
            Image q = p.getImage();
            Image r = q.getScaledInstance(500,600, Image.SCALE_SMOOTH);
            ImageIcon kv = new ImageIcon(r);
            JLabel yash = new JLabel(kv);
            yash.setBounds(0, 50,500,600);

            JLabel heading = new JLabel("Crop Suggestion Portal", JLabel.CENTER);
            Font font = new Font(heading.getFont().getName(), Font.BOLD, 34);


            heading.setFont(font);




            JLabel districtLabel = new JLabel("Select District:");



            String[] districtOptions = {"select District","Ahemednagar", "Nashik", "Pune", "Solapur", "Aurgabad", "Jalgoan", "Beed", "Satara", "Osmanabad", "Sangli"};
            JComboBox<String> districtComboBox = new JComboBox<>(districtOptions);
            districtComboBox.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

            districtComboBox.addActionListener(new ActionListener(){


                @Override
                public void actionPerformed(ActionEvent e) {
                    District = (String) districtComboBox.getSelectedItem();

                }
            });

            districtComboBox.setBackground(Color.yellow);

            JLabel seasonLabel = new JLabel("Season Name:");

            String[] seasonOptions = {"Select Season", "Kharif", "Rabbi", "Zaid"};
            JComboBox<String> seasonComboBox = new JComboBox<>(seasonOptions);
            seasonComboBox.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
            seasonComboBox.addActionListener(new ActionListener(){


                @Override
                public void actionPerformed(ActionEvent e)
                {

                    Season = (String) seasonComboBox.getSelectedItem();

                }
            });
            seasonComboBox.setBackground(Color.yellow);



            JLabel temperatureLabel = new JLabel("Temperature :");
            String[] temperatureOptions = {"Select Temperature", "10_to_15","15_to_20", "20_to_25", "25_to_30", "30_to_35", "35_to_40", "Above_40"};
            JComboBox<String> temperatureComboBox = new JComboBox<>(temperatureOptions);
            temperatureComboBox.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

            temperatureComboBox.addActionListener(new ActionListener(){


                @Override
                public void actionPerformed(ActionEvent e) {
                    Temp = (String) temperatureComboBox.getSelectedItem();

                }
            });
            temperatureComboBox.setBackground(Color.yellow);


            JLabel waterLabel = new JLabel("Water depdencye:");
            String[] waterOptions = {"Select Water depdencye", "Water_High", "Water_Medium", "Water_Low"};
            JComboBox<String> waterComboBox = new JComboBox<>(waterOptions);
            waterComboBox.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

            waterComboBox.addActionListener(new ActionListener(){


                @Override
                public void actionPerformed(ActionEvent e) {
                    Water = (String) waterComboBox.getSelectedItem();

                }
            });
            waterComboBox.setBackground(Color.yellow);



            JLabel areaLabel = new JLabel("Area of Land (Acre):");
            String[] areaOptions = {"Select Area of Land", "Land_High", "Land_Medium", "Land_Low"};
            JComboBox<String> areaComboBox = new JComboBox<String>(areaOptions);
            areaComboBox.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
            areaComboBox.addActionListener(new ActionListener(){


                @Override
                public void actionPerformed(ActionEvent e)
                {
                    Land = (String) areaComboBox.getSelectedItem();

                }
            });
            areaComboBox.setBackground(Color.yellow);
            JButton suggestButton = new JButton("Suggest");
            JButton exitbutton = new JButton("Log Out");
            JButton hmButton = new JButton("Home");

            suggestButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            exitbutton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            hmButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));


//
            frame.setLayout(null);




            heading.setBounds(550, 10, 500, 30);

            districtLabel.setBounds(600, 150, 100, 30);
            districtComboBox.setBounds(720, 150, 250, 40);

            seasonLabel.setBounds(600, 200, 100, 30);
            seasonComboBox.setBounds(720, 200, 250, 40);

            temperatureLabel.setBounds(600, 250, 100, 30);
            temperatureComboBox.setBounds(720, 250, 250, 40);

            waterLabel.setBounds(600, 300, 300, 30);
            waterComboBox.setBounds(720, 300, 250, 40);

            areaLabel.setBounds(600, 350, 350, 30);
            areaComboBox.setBounds(720, 350, 250, 40);

            suggestButton.setBounds(650, 420, 100, 30);
            exitbutton.setBounds(770, 420, 100, 30);
            hmButton.setBounds(890, 420, 100, 30);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            frame.add(heading);
            frame.add(districtLabel);
            frame.add(districtComboBox);
            frame.add(seasonLabel);
            frame.add(seasonComboBox);
            frame.add(temperatureLabel);
            frame.add(temperatureComboBox);
            frame.add(waterLabel);
            frame.add(waterComboBox);
            frame.add(areaLabel);
            frame.add(areaComboBox);
            frame.add(suggestButton);
            frame.add(exitbutton);
            frame.add(hmButton);
            frame.add(yash,BorderLayout.NORTH);
            frame.setVisible(true);

            hmButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method
                    new CropSuggestionPortal();

                }


            });

            exitbutton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new Login();
                }

            });

            suggestButton.addActionListener(new ActionListener()

            {

                public void actionPerformed(ActionEvent e)

                {

                    frame.dispose();
                    JFrame frame = new JFrame("Crop Suggestion Portal");

                    frame.setSize(1500, 800);
                    frame.setResizable(false);
                    JPanel h = new JPanel();
                    JLabel heading = new JLabel("Our Suggestions");
                    heading.setVerticalAlignment(JLabel.TOP);
                    heading.setHorizontalAlignment(JLabel.CENTER);
                    Font font = new Font(heading.getFont().getName(), Font.BOLD, 34);
                    heading.setFont(font);
                    h.add(heading);
                    frame.add(h,BorderLayout.NORTH);
                    frame.setBackground(Color.pink);
//                        lable.setBounds(500,500,100,100);
                    frame.setVisible(true);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




                    String url = "jdbc:mysql://localhost:3306/DBMSSCP";
                    String user = "root";
                    String password = "Aniket@2615";

                    try {

                        // Connect to the database
                        Connection conn = DriverManager.getConnection(url, user, password);

                        // Create a statement
                        Statement stmt = conn.createStatement();

                        // Execute a query
                        String query = "SELECT * FROM crop " +
                                "WHERE " + District + "  = 'Yes' AND "+ Season + "= 'Yes' " +
                                "AND "+ Water + " = 'Yes' AND " + Land +" = 'Yes' " +
                                "AND "+ Temp +" = 'Yes'";
                        ResultSet rs = stmt.executeQuery(query);
                        JPanel o = new JPanel();
                        o.setLayout(new GridLayout(20, 1, 0, 10));
                        Font font3 = new Font("Serif", Font.ITALIC, 30);

                        JLabel output1 = new JLabel();
                        JLabel OUTPUT1 =   new JLabel();
                        JLabel output1c =new JLabel();
                        JLabel output2 = new JLabel();
                        JLabel output2b = new JLabel();
                        JLabel output2c = new JLabel();
                        JLabel output3 = new JLabel();
                        JLabel output3b = new JLabel();
                        JLabel output3c = new JLabel();
                        JLabel space1 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        JLabel space2= new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        JLabel space3 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        JLabel space4= new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        output1.setBounds(0,100,200,200);

                        JLabel output5 = new JLabel("     ");
                        // Process the results
                        int i =0;
                        while (rs.next()) {
                            i++;
                            // Print the data from each row
                            if(i==1) {

                                output1.setText("     1.Crop Name :- "+rs.getString("crop_name"));
                                OUTPUT1.setText("     Recommended Fertilizers :- "+rs.getString("F1") + " ," + rs.getString("F2") + ", " + rs.getString("F3"));
                                output1c.setText("     Duration :- "+rs.getString("Duration")+" months");
                                output1.setFont(font3);
                                OUTPUT1.setFont(font3);
                                output1c.setFont(font3);

                            }
                            if(i==2) {

                                output2.setText("     2.Crop Name  :- "+rs.getString("crop_name"));
                                output2b.setText("     Recommended Fertilizers :- "+rs.getString("F1") + " ," + rs.getString("F2") + ", " + rs.getString("F3"));
                                output2c.setText( "     Duration :- "+rs.getString("Duration")+" months");
                                output2.setFont(font3);
                                output2b.setFont(font3);
                                output2c.setFont(font3);

                            }
                            if(i==3) {

                                output3.setText("     3.Crop Name  :- "+rs.getString("crop_name"));
                                output3b.setText("     Recommended Fertilizers :- "+rs.getString("F1") + " ," + rs.getString("F2") + ", " + rs.getString("F3"));
                                output3c.setText( "     Duration :- "+rs.getString("Duration")+" months");
                                output3.setFont(font3);
                                output3b.setFont(font3);
                                output3c.setFont(font3);

                            }


                            // output1.setBounds(750,400,100,100);
                            //frame.add(output,BorderLayout.CENTER);
                            System.out.println(rs.getString("crop_name") + " " + rs.getString("Duration") + " " + rs.getString("F1") + " " + rs.getString("F2") + " " + rs.getString("F3"));
                        }
//                        JLabel output = new JLabel( selectedOption);
                        if(i==0)
                        {
                            JLabel nooutput = new JLabel(" CHOOSE CORRECT PARAMETERS !!!");
                            nooutput.setFont(font3);
                            o.add(output5, BorderLayout.CENTER);
                            o.add(space1, BorderLayout.CENTER);
                            o.add(nooutput,BorderLayout.CENTER);

                        }

                        else {

                            o.add(output5, BorderLayout.CENTER);
                            o.add(space1, BorderLayout.CENTER);
                            o.add(output1, BorderLayout.CENTER);
                            o.add(OUTPUT1, BorderLayout.CENTER);
                            o.add(output1c, BorderLayout.CENTER);
                            o.add(space2, BorderLayout.CENTER);
                            o.add(output2, BorderLayout.CENTER);
                            o.add(output2b, BorderLayout.CENTER);
                            o.add(output2c, BorderLayout.CENTER);
                            o.add(space3, BorderLayout.CENTER);
                            o.add(output3, BorderLayout.CENTER);
                            o.add(output3b, BorderLayout.CENTER);
                            o.add(output3c, BorderLayout.CENTER);
                            o.add(space4, BorderLayout.CENTER);

                        }
                        // o.add(homeButton,BorderLayout.SOUTH);
                        frame.add(o,BorderLayout.WEST);
//                        JPanel n = new JPanel();
//                        n.add(homeButton);
//                        frame.add(n,BorderLayout.SOUTH);


                        JLabel imageLabel = new JLabel();
                        imageLabel.setBackground(Color.pink);
                        ImageIcon imageIcon = new ImageIcon("thankyou.jpg");
                        Image image = imageIcon.getImage();
                        Image newImage = image.getScaledInstance(500, 600, Image.SCALE_SMOOTH);
                        ImageIcon newImageIcon = new ImageIcon(newImage);
                        imageLabel.setIcon(newImageIcon);
                        JPanel image55 = new JPanel();
                        image55.add(imageLabel,BorderLayout.NORTH);
                        image55.add(exitButton,BorderLayout.NORTH);
                        frame.add(image55,BorderLayout.EAST);
                        //frame.pack();

                        // Close the connection
                        conn.close();
                    }

                    catch (SQLException m)
                    {

                        System.out.println("Error connecting to database: " + m.getMessage());

                    }

                    frame.add(exitButton,BorderLayout.SOUTH);
                }
            });

        }
        else if (e.getSource() == aboutButton)
        {
            JFrame frame = new JFrame("CROP Suggestion Portal");
            frame.setSize(1500, 800);
            frame.setResizable(false);
            frame.setLayout(new BorderLayout());

            JLabel head = new JLabel("Portal Credits :", JLabel.CENTER);
            Font fonts = new Font(head.getFont().getName(), Font.BOLD, 40);
            head.setFont(fonts);


            Font font = new Font("Serif", Font.PLAIN, 25);
            Font font1 = new Font("Serif", Font.BOLD, 30);

            JLabel space = new JLabel("    ");
            JLabel space2 = new JLabel("    ");
            JLabel info = new JLabel("Department of Information Technology, 2nd Year Btech Student, Vit Pune - ");
            info.setFont(font1);
            JLabel space1 = new JLabel("    ");
            JLabel space3 = new JLabel("    ");
            JLabel kothawade = new JLabel("1) Deep khanchandani , deep.khanchandani22@vit.edu");
            kothawade.setFont(font);
            JLabel space4 = new JLabel("    ");
            JLabel kondewar = new JLabel("2) Samarth Kamble , samarth.kamble22@vit.edu");
            kondewar.setFont(font);
            JLabel space5 = new JLabel("    ");
            JLabel korade = new JLabel("3) Lokesh Choudhari , lokesh.choudhari22@vit.edu");
            korade.setFont(font);
            JLabel space6 = new JLabel("    ");
            JLabel kenjale = new JLabel("4) Mandhar Mahapure , mandhar.mahapure22@vit.edu");
            kenjale.setFont(font);
            JLabel space7 = new JLabel("    ");
            JLabel khambayate = new JLabel("5) Jay kumawat , jay.kumawat22@vit.edu");
            khambayate.setFont(font);

            JPanel infor = new JPanel();
            infor.setLayout(new BoxLayout(infor, BoxLayout.Y_AXIS));
            infor.add(head);
            infor.add(space);
            infor.add(space2);
            infor.add(info);
            infor.add(space1);
            infor.add(space3);
            infor.add(kothawade);
            infor.add(space4);
            infor.add(kondewar);
            infor.add(space5);
            infor.add(korade);
            infor.add(space6);
            infor.add(kenjale);
            infor.add(space7);
            infor.add(khambayate);

            JPanel homePanel = new JPanel();
            homePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
            JButton t = new JButton("Home");
            t.setPreferredSize(new Dimension(1400, 40));
            t.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            homePanel.add(t);

            frame.add(infor, BorderLayout.CENTER);
            frame.add(homePanel, BorderLayout.SOUTH);

            t.addActionListener(new ActionListener()
            {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    new CropSuggestionPortal();
                }

            });

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);


        }
        else if (e.getSource() == exitButton)
        {

            new Login();

        }

    }
    public static void main(String[] args)
    {

        new CropSuggestionPortal();

}
}
