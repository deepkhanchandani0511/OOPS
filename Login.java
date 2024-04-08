import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton,exitbutton;

    public Login() {
        setTitle("Crop Suggestion Portal");
        setSize(1500, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

      
        ImageIcon bigImageIcon = new ImageIcon("agri.jpg");
        JLabel bigImageLabel = new JLabel(bigImageIcon);
        bigImageLabel.setBounds(50,60, 450, 600); 
        panel.add(bigImageLabel);

        JLabel titleLabel = new JLabel("Crop Suggestion Portal");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setBounds(500, 50, 500, 50);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(titleLabel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        usernameLabel.setBounds(640, 250, 100, 30);
        panel.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(750, 250, 200, 30);
        usernameField.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        panel.add(usernameField);


        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 16));
        passwordLabel.setBounds(640, 300, 100, 30);
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(750, 300, 200, 30);
        passwordField.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(750, 350, 100, 30);
        loginButton.addActionListener(this);
        loginButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel.add(loginButton);

        exitbutton = new JButton("Exit");
        exitbutton.setBounds(870, 350, 100, 30);
        exitbutton.addActionListener(this);
        exitbutton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel.add(exitbutton);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("Deep") && password.equals("Deep@123")) {
                JOptionPane.showMessageDialog(this, "Login successful!");
                 new CropSuggestionPortal();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials. Please try again.");
            }
        }
        if(e.getSource()==exitbutton)
        {
            System.exit(0);
        }
    }
}
