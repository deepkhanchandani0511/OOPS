create database DBMSSCP;

use DBMSSCP;

create table crop(crop_id int primary key,crop_name varchar(100),Duration int not null,Ahemednagar varchar(100),
Nashik varchar(100),Pune varchar(100),Solapur varchar(100),Aurgabad varchar(100),Jalgaon varchar(100),
Beed varchar(100),Satara varchar(100),Osmanabad varchar(100),Sangli varchar(100),Kharif varchar(100),
Rabbi varchar(100),Zaid varchar(100),10_to_15 varchar(100),15_to_20 varchar(100),20_to_25 varchar(100),
25_to_30 varchar(100),30_to_35 varchar(100),35_to_40 varchar(100),40_to_45 varchar(100),Water_High varchar(100),
Water_Medium varchar(100), Water_Low varchar(100), Land_High varchar(100), Land_Medium varchar(100),
Land_Low varchar(100),F1 varchar(100), F2 varchar(100), F3 varchar(100)); 

desc crop;

insert into crop values(1,"Sugarcane",12,"Yes","No","Yes","No","No","No","No","No","No","Yes","Yes","No","No","No","No","Yes","Yes","Yes","No","No","Yes","No","No","Yes","Yes","Yes","Urea","Singlephosphate","Potash");
insert into crop values(2,"Grapes",24,"Yes","No","No","No","No","No","No","No","No","No","Yes","No","No","No","Yes","Yes","No","No","No","No","Yes","No","No","Yes","No","No","Urea","Calcium","Micronutrient");
insert into crop values(3,"Pomegranate",24,"Yes","No","No","No","No","No","No","No","No","No","Yes","No","No","No","Yes","Yes","Yes","No","No","No","Yes","No","No","Yes","Yes","Yes","Nitrogen","Potassium","Phosphorus");
insert into crop values(4,"Tomato",3,"Yes","Yes","No","No","No","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","No","No","Yes","Yes","No","No","No","Yes","Yes","No","No","Yes","Yes","Nitrogen","Potassium","Phosphorus");
insert into crop values(5,"Onion",4	,"Yes","Yes","Yes","Yes","No","Yes","No","Yes","Yes","Yes","Yes","Yes","Yes","No","Yes","Yes","No","No","No","No","Yes","Yes","No","No","Yes","Yes","Urea",	"Micronutrient","sulphur");
insert into crop values(6,"Soybean",5,"Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes,","Yes","Yes","Yes","Yes","Yes","No","No","Yes","Yes","No","No","No","Yes","Yes","No","No","Yes","Yes","Nitrogen","Potassium","Phosphorus");
insert into crop values(7,"Bajra",4,"Yes","Yes","No","Yes","No","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","No","No","Yes","Yes","Yes","No","No","Yes","Yes","No","No","Yes","Yes","Urea","Compost","Zinc");
insert into crop values(8,"Jowar",5,"Yes","Yes","Yes","No","Yes","No","No","Yes","Yes","Yes","Yes","Yes","No","No","No","No","Yes","Yes","Yes","No","Yes","Yes","No","Yes","Yes","No","NPK","Urea","Starter");
insert into crop values(9,"Wheat",4,"Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","Yes","No","Yes","No","No","Yes","Yes","No,","No","No","No","Yes","Yes","No","No","Yes","Yes","NPK","Sulphur","Urea");
insert into crop values(10,"Barley",4,"Yes","No","Yes","Yes","Yes","No","No","Yes","Yes","No","No","Yes","No","Yes","Yes","Yes","No","No","No","No","Yes","Yes","No","No","Yes","Yes","NPK","Boron","Magnesium");
insert into crop values(11,"Chickpea (Chana)",4,"Yes","Yes","Yes","No","Yes","No","Yes","Yes","Yes","No","Yes","Yes","Yes","No","No","No","Yes","Yes","No","No","Yes","Yes","No","Yes","Yes","No","MBF","Nitrogen","Urea");
insert into crop values(12,"Lentils (Masoor)",4,"Yes","Yes","Yes","Yes","No","No","No","No","Yes","Yes","No","Yes","No","Yes","Yes","Yes","No","No","No","No","Yes","Yes","No","No","Yes","Yes","Phosphrus","Micronutrient","Nitrogen");
insert into crop values(13,"Mustard",4,"Yes","Yes","No","Yes","Yes","Yes","Yes","Yes","Yes","No","No","Yes","No","Yes","Yes","Yes","No","No","No","No","Yes","Yes","No","No","Yes","Yes","Phosphrus","Micronutrient","Nitrogen");
INSERT INTO crop VALUES (14, "Sesame (Til)", 4, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "No", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "Nitrogen", "Potassium", "Phosphorus");
INSERT INTO crop VALUES (15, "Fennel (Saunf)", 4, "Yes", "No", "No", "Yes", "No", "No", "No", "No", "No", "No", "No", "Yes", "No", "Yes", "Yes", "Yes", "No", "No", "No", "No", "Yes", "Yes", "No", "No", "Yes", "No", "Nitrogen", "Potassium", "Phosphorus");
INSERT INTO crop VALUES (16, "Cumin (Jeera)", 5, "Yes", "No", "No", "No", "No", "No", "No", "No", "No", "No", "No", "Yes", "No", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "Urea", "DAP", "Sulphar");
INSERT INTO crop VALUES (17, "Coriander (Dhaniya)", 4, "Yes", "No", "No", "No", "Yes", "No", "No", "No", "No", "No", "No", "Yes", "No", "Yes", "Yes", "Yes", "No", "No", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Organiccompost", "Nitrogen", "Potassium");
INSERT INTO crop VALUES (18, "Green Gram (Moong)", 3, "Yes", "Yes", "No", "Yes", "No", "No", "No", "Yes", "Yes", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Yes", "Yes", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Vermicompost", "Micronutrient", "Calciumrich");
INSERT INTO crop VALUES (19, "Maize", 3, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "No", "Yes", "No", "No", "Yes", "Yes", "No", "No", "No", "Yes", "No", "No", "Yes", "Yes", "No", "Urea", "Zinc", "Micronutrient");
INSERT INTO crop VALUES (20, "Cotton", 6, "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Urea", "Sulphur", "Micronutrient");
INSERT INTO crop VALUES (21, "Groundnut", 4, "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Urea", "Zinc", "Superphosphate");
INSERT INTO crop VALUES (22, "Turmeric", 10, "Yes", "No", "No", "No", "No", "No", "Yes", "No", "No", "Yes", "Yes", "No", "Yes", "No", "No", "Yes", "Yes", "No", "No", "No", "Yes", "Yes", "No", "Yes", "Yes", "Yes","Compost", "Urea", "Micronutrient");
INSERT INTO crop VALUES (23, "Chillies", 3, "Yes", "No", "No", "No", "No", "No", "Yes", "No", "No", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Farymadmanure", "Phosphate", "Potassium");
INSERT INTO crop VALUES (24, "Sunflower", 4, "Yes", "No", "Yes", "Yes", "No", "Yes", "No", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "No", "No", "No", "Yes", "Yes", "Nitrogen", "Potassium", "Phosphorus");
INSERT INTO crop VALUES (25, "Paddy (Rice)", 5, "No", "Yes", "Yes", "No", "No", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "No", "No", "No", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "No", "Yes", "Yes", "No", "Farmyardmanure", "Organiccompost", "Urea");
INSERT INTO crop VALUES (26, "Pigeon(Tur)", 5, "No", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "No", "No", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Urea", "Micronutrient", "Biofertilizer");
INSERT INTO crop VALUES (27, "Blackgram(Urad)", 4, "No", "Yes", "Yes", "Yes", "No", "Yes", "No", "Yes", "Yes", "No", "Yes", "No", "No", "No", "No", "Yes", "Yes", "Yes", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Urea", "Micronutrient", "Organicmanure");
INSERT INTO crop VALUES (28, "Carrot", 4, "No", "Yes", "No", "No", "No", "No", "No", "No", "No", "Yes", "No", "Yes", "No", "No", "Yes", "No", "No", "No", "No", "No", "Yes", "No", "No", "No", "Yes", "Yes", "Nitrogeonous", "phophatic", "Micronutrient");
INSERT INTO crop VALUES (29, "Watermelon", 4, "No", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "No", "Yes", "No", "No", "Yes", "Yes", "No", "No", "No", "Yes", "Yes", "No", "No", "No", "No", "Nitrogeonous", "phophatic", "Micronutrient");
INSERT INTO crop VALUES (30, "ChilliPeper", 4, "No", "Yes", "No", "No", "No", "Yes", "No", "Yes", "No", "Yes", "No", "No", "Yes", "No", "No", "Yes", "Yes", "No", "No", "No", "Yes", "No", "No", "No", "Yes", "Yes", "Vermicompost", "Biofertilizers", "Rockphosphate");
INSERT INTO crop VALUES (31, "Cucumber", 4, "No", "Yes", "Yes", "No", "No", "Yes", "No", "Yes", "No", "Yes", "No", "No", "Yes", "No", "No", "Yes", "Yes", "No", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Gypsum", "Epsomsalt", "Calciumnitrate");
INSERT INTO crop VALUES (32, "Muskmelon", 4, "No", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "No", "Yes", "No", "Yes", "No", "No", "No", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Calciumnitrate", "Biofertilizers", "Vermicompost");
INSERT INTO crop VALUES (33, "Potato", 4, "No", "No", "Yes", "No", "No", "No", "Yes", "No", "No", "Yes", "No", "Yes", "No", "No", "Yes", "Yes", "Yes", "No", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Micronutrient", "Biostimulate", "Humicacid");
INSERT INTO crop VALUES (34, "Bittergourd(Karale)", 4, "No", "Yes", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "No", "Yes", "No", "Yes", "Yes", "Yes", "No", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Seaweed", "Urea", "Micronutrient");
INSERT INTO crop VALUES (35, "Bottlegourd(Dudhibhopla)", 4, "No", "Yes", "Yes", "No", "Yes", "No", "Yes", "Yes", "Yes", "Yes", "No", "No", "Yes", "No", "Yes", "Yes", "No", "No", "No", "No", "Yes", "Yes", "No", "Yes", "Yes", "No", "Vermicompost", "Urea", "Farmyardmanure");
INSERT INTO crop VALUES (36, "Greenbeans", 4, "No", "No", "Yes", "No", "No", "No", "Yes", "Yes", "No", "Yes", "No", "No", "Yes", "No", "Yes", "Yes", "Yes", "No", "No", "No", "Yes", "Yes", "No", "No", "Yes", "No", "Urea", "Epsomsalt", "Calciumnitrate");
INSERT INTO crop VALUES (37, "Sponggourd", 4, "No", "No", "Yes", "No", "No", "No", "Yes", "Yes", "No", "Yes", "No", "No", "Yes", "No", "Yes", "Yes", "Yes", "No", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Vermicompost", "Urea", "Micronutrient");
INSERT INTO crop VALUES (38, "Vegetables", 4, "No", "No", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "No", "Yes", "No", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Urea", "Micronutrient", "Vermicompost");
INSERT INTO crop VALUES (39, "Bhindi", 4, "No", "No", "No", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "No", "Yes", "No", "No", "Yes", "Yes", "Yes", "No", "No", "Yes", "Yes", "No", "No", "Yes", "Yes", "Micronutrient", "Compost", "Urea");
INSERT INTO crop VALUES (40, "Bringal(Vange)", 4, "No", "No", "No", "No", "Yes", "Yes", "No", "No", "No", "Yes", "Yes", "Yes", "Yes", "No", "No", "Yes", "Yes", "No", "No", "No", "Yes", "Yes", "Yes", "Yes", "Yes", "Yes", "FishEmulsion", "Vermicompost", "Seaweed")



select *from crop;


