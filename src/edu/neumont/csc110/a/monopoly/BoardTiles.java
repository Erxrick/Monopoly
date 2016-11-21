package edu.neumont.csc110.a.monopoly;

import edu.neumont.csc110.a.utilities.PropertyType;

public class BoardTiles {
	PropertyCards Mediterranean_Avenue = new PropertyCards();
	PropertyCards Baltic_Avenue = new PropertyCards();
	PropertyCards Oriental_Avenue = new PropertyCards();
	PropertyCards Vermont_Avenue = new PropertyCards();
	PropertyCards Connecticut_Avenue = new PropertyCards();
	PropertyCards StCharles_Place = new PropertyCards();
	PropertyCards States_Avenue = new PropertyCards();
	PropertyCards Virginia_Avenue = new PropertyCards();
	PropertyCards StJames_Place = new PropertyCards();
	PropertyCards Tennessee_Avenue = new PropertyCards();
	PropertyCards New_York_Avenue = new PropertyCards();
	PropertyCards Kentucky_Avenue = new PropertyCards();
	PropertyCards Indiana_Avenue = new PropertyCards();
	PropertyCards Illinois_Avenue = new PropertyCards();
	PropertyCards Atlantic_Avenue = new PropertyCards();
	PropertyCards Ventor_Avenue = new PropertyCards();
	PropertyCards Marvin_Gardens = new PropertyCards();
	PropertyCards Pacific_Avenue = new PropertyCards();
	PropertyCards North_Carolina_Avenue = new PropertyCards();
	PropertyCards Pennslvania_Avenue = new PropertyCards();
	PropertyCards Park_Place = new PropertyCards();
	PropertyCards Boardwalk = new PropertyCards();
	PropertyCards Reading_Railroad = new PropertyCards();
	PropertyCards Pennsylvania_Railroad = new PropertyCards();
	PropertyCards BO_Railroad = new PropertyCards();
	PropertyCards Short_Line = new PropertyCards();
	PropertyCards Electric_Company = new PropertyCards();
	PropertyCards Water_Works = new PropertyCards();
	//TODO Replace Com Chest and Chance right now just a placeholder
	PropertyCards Community_Chest = new PropertyCards();
	PropertyCards Chance = new PropertyCards();
	PropertyCards Income_Tax = new PropertyCards();
	PropertyCards Jail = new PropertyCards();
	PropertyCards Free_Parking = new PropertyCards();
	PropertyCards Go_To_Jail = new PropertyCards();
	PropertyCards Luxury_Tax = new PropertyCards();
	PropertyCards GO = new PropertyCards();
	//TODO Ends
	PropertyCards[] PropCards = { 
		GO,
		//1
		Mediterranean_Avenue,
		//2
		Community_Chest,
		//3
		Baltic_Avenue, 
		//4
		Income_Tax, 
		//5
		Reading_Railroad, 
		//6
		Oriental_Avenue,
		//7
		Chance,
		//8
		Vermont_Avenue,
		//9
		Connecticut_Avenue,
		//10
		Jail,
		//11
		StCharles_Place,
		//12
		Electric_Company, 
		//13
		States_Avenue,
		//14
		Virginia_Avenue,
		//15
		Pennsylvania_Railroad,
		//16
		StJames_Place,
		//17
		Community_Chest,
		//18
		Tennessee_Avenue,
		//19
		New_York_Avenue,
		//20
		Free_Parking,
		//21
		Kentucky_Avenue,
		//22
		Chance,
		//23
		Indiana_Avenue,
		//24
		Illinois_Avenue,
		//25
		BO_Railroad,
		//26
		Atlantic_Avenue,
		//27
		Ventor_Avenue,
		//28
		Water_Works,
		//29
		Marvin_Gardens,
		//30
		Go_To_Jail,
		//31
		Pacific_Avenue,
		//32
		North_Carolina_Avenue,
		//33
		Community_Chest,
		//34
		Pennslvania_Avenue,
		//35
		Short_Line,
		//36
		Chance,
		//37
		Park_Place,
		//38
		Luxury_Tax,
		//39
		Boardwalk,
	
	
	};
	public void init() {
		
		//ArrayList<PropertyCards> bankerProperty = new ArrayList<PropertyCards>();
		//1 Mediterranean_Avenue
		
		
		Mediterranean_Avenue.setName("Mediterranean Avenue");
		Mediterranean_Avenue.setColor(PropertyType.brown);
		Mediterranean_Avenue.setPrice(60);
		Mediterranean_Avenue.setHouse(0);
		Mediterranean_Avenue.setRent(2);
		Mediterranean_Avenue.setRentH1(10);
		Mediterranean_Avenue.setRentH2(30);
		Mediterranean_Avenue.setRentH3(90);
		Mediterranean_Avenue.setRentH4(160);
		Mediterranean_Avenue.setRentH5(250);
		Mediterranean_Avenue.setHouseCost(50);
		Mediterranean_Avenue.setMortgage(30);
		Mediterranean_Avenue.setUnMortgage(33);
		Mediterranean_Avenue.setIsmortgaged(false);
		Mediterranean_Avenue.setBought(false);
		Mediterranean_Avenue.setcardAscii(asciiArt.Mediterranean_Avenue_Ascii);
		//2 Baltic_Avenue
	
		Baltic_Avenue.setName("Baltic Avenue");
		Baltic_Avenue.setColor(PropertyType.brown);
		Baltic_Avenue.setPrice(60);
		Baltic_Avenue.setHouse(0);
		Baltic_Avenue.setRent(4);
		Baltic_Avenue.setRentH1(20);
		Baltic_Avenue.setRentH2(60);
		Baltic_Avenue.setRentH3(180);
		Baltic_Avenue.setRentH4(320);
		Baltic_Avenue.setRentH5(450);
		Baltic_Avenue.setHouseCost(50);
		Baltic_Avenue.setMortgage(30);
		Baltic_Avenue.setUnMortgage(33);
		Baltic_Avenue.setIsmortgaged(false);
		Baltic_Avenue.setBought(false);
		Baltic_Avenue.setcardAscii(asciiArt.Baltic_Avenue_Ascii);
		//3 Oriental_Avenue
		
		Oriental_Avenue.setName("Oriental Avenue");
		Oriental_Avenue.setColor(PropertyType.babyblue);
		Oriental_Avenue.setPrice(100);
		Oriental_Avenue.setHouse(0);
		Oriental_Avenue.setRent(6);
		Oriental_Avenue.setRentH1(30);
		Oriental_Avenue.setRentH2(90);
		Oriental_Avenue.setRentH3(270);
		Oriental_Avenue.setRentH4(400);
		Oriental_Avenue.setRentH5(550);
		Oriental_Avenue.setHouseCost(50);
		Oriental_Avenue.setMortgage(50);
		Oriental_Avenue.setUnMortgage(55);
		Oriental_Avenue.setIsmortgaged(false);
		Oriental_Avenue.setBought(false);
		Oriental_Avenue.setcardAscii(asciiArt.Oriental_Avenue_Ascii);
		//4 Vermont_Avenue
		
		Vermont_Avenue.setName("Vermont Avenue");
		Vermont_Avenue.setColor(PropertyType.babyblue);
		Vermont_Avenue.setPrice(100);
		Vermont_Avenue.setHouse(0);
		Vermont_Avenue.setRent(6);
		Vermont_Avenue.setRentH1(30);
		Vermont_Avenue.setRentH2(90);
		Vermont_Avenue.setRentH3(270);
		Vermont_Avenue.setRentH4(400);
		Vermont_Avenue.setRentH5(550);
		Vermont_Avenue.setHouseCost(50);
		Vermont_Avenue.setMortgage(50);
		Vermont_Avenue.setUnMortgage(55);
		Vermont_Avenue.setIsmortgaged(false);
		Vermont_Avenue.setBought(false);
		Vermont_Avenue.setcardAscii(asciiArt.Oriental_Avenue_Ascii);
		
		//5 Connecticut_Avenue
		
		Connecticut_Avenue.setName("Connecticut Avenue");
		Connecticut_Avenue.setColor(PropertyType.babyblue);
		Connecticut_Avenue.setPrice(120);
		Connecticut_Avenue.setHouse(0);
		Connecticut_Avenue.setRent(8);
		Connecticut_Avenue.setRentH1(40);
		Connecticut_Avenue.setRentH2(100);
		Connecticut_Avenue.setRentH3(300);
		Connecticut_Avenue.setRentH4(450);
		Connecticut_Avenue.setRentH5(600);
		Connecticut_Avenue.setHouseCost(50);
		Connecticut_Avenue.setMortgage(60);
		Connecticut_Avenue.setUnMortgage(66);
		Connecticut_Avenue.setIsmortgaged(false);
		Connecticut_Avenue.setBought(false);
		Connecticut_Avenue.setcardAscii(asciiArt.Connecticut_Avenue_Ascii);
		//6 StCharles_Place
	
		StCharles_Place.setName("St. Charles Place");
		StCharles_Place.setColor(PropertyType.pink);
		StCharles_Place.setPrice(140);
		StCharles_Place.setHouse(100);
		StCharles_Place.setRent(10);
		StCharles_Place.setRentH1(50);
		StCharles_Place.setRentH2(150);
		StCharles_Place.setRentH3(450);
		StCharles_Place.setRentH4(625);
		StCharles_Place.setRentH5(750);
		StCharles_Place.setHouseCost(100);
		StCharles_Place.setMortgage(70);
		StCharles_Place.setUnMortgage(77);
		StCharles_Place.setIsmortgaged(false);
		StCharles_Place.setBought(false);
		StCharles_Place.setcardAscii(asciiArt.StCharles_Place_Ascii);
		//7 States_Avenue
		
		States_Avenue.setName("States Avenue");
		States_Avenue.setColor(PropertyType.pink);
		States_Avenue.setPrice(140);
		States_Avenue.setHouse(0);
		States_Avenue.setRent(10);
		States_Avenue.setRentH1(50);
		States_Avenue.setRentH2(150);
		States_Avenue.setRentH3(450);
		States_Avenue.setRentH4(625);
		States_Avenue.setRentH5(750);
		States_Avenue.setHouseCost(100);
		States_Avenue.setMortgage(70);
		States_Avenue.setUnMortgage(77);
		States_Avenue.setIsmortgaged(false);
		States_Avenue.setBought(false);
		States_Avenue.setcardAscii(asciiArt.States_Avenue_Ascii);
		//8 Virginia_Avenue
		
		Virginia_Avenue.setName("Virginia Avenue");
		Virginia_Avenue.setColor(PropertyType.pink);
		Virginia_Avenue.setPrice(160);
		Virginia_Avenue.setHouse(0);
		Virginia_Avenue.setRent(12);
		Virginia_Avenue.setRentH1(60);
		Virginia_Avenue.setRentH2(180);
		Virginia_Avenue.setRentH3(500);
		Virginia_Avenue.setRentH4(700);
		Virginia_Avenue.setRentH5(900);
		Virginia_Avenue.setHouseCost(100);
		Virginia_Avenue.setMortgage(80);
		Virginia_Avenue.setUnMortgage(88);
		Virginia_Avenue.setIsmortgaged(false);
		Virginia_Avenue.setBought(false);
		Virginia_Avenue.setcardAscii(asciiArt.Virginia_Avenue_Ascii);
		//9 StJames_Place
		
		StJames_Place.setName("St. James Place");
		StJames_Place.setColor(PropertyType.orange);
		StJames_Place.setPrice(180);
		StJames_Place.setHouse(0);
		StJames_Place.setRent(14);
		StJames_Place.setRentH1(70);
		StJames_Place.setRentH2(200);
		StJames_Place.setRentH3(550);
		StJames_Place.setRentH4(750);
		StJames_Place.setRentH5(950);
		StJames_Place.setHouseCost(100);
		StJames_Place.setMortgage(90);
		StJames_Place.setUnMortgage(99);
		StJames_Place.setIsmortgaged(false);
		StJames_Place.setBought(false);
		StJames_Place.setcardAscii(asciiArt.StJames_Place_Ascii);
		//10 Tennessee_Avenue
	
		Tennessee_Avenue.setName("Tennessee Avenue");
		Tennessee_Avenue.setColor(PropertyType.orange);
		Tennessee_Avenue.setPrice(180);
		Tennessee_Avenue.setHouse(0);
		Tennessee_Avenue.setRent(14);
		Tennessee_Avenue.setRentH1(70);
		Tennessee_Avenue.setRentH2(200);
		Tennessee_Avenue.setRentH3(550);
		Tennessee_Avenue.setRentH4(750);
		Tennessee_Avenue.setRentH5(950);
		Tennessee_Avenue.setHouseCost(100);
		Tennessee_Avenue.setMortgage(90);
		Tennessee_Avenue.setUnMortgage(99);
		Tennessee_Avenue.setIsmortgaged(false);
		Tennessee_Avenue.setBought(false);
		Tennessee_Avenue.setcardAscii(asciiArt.Tennessee_Avenue_Ascii);
		//11 New_York_Avenue
	
		New_York_Avenue.setName("New York Avenue");
		New_York_Avenue.setColor(PropertyType.orange);
		New_York_Avenue.setPrice(200);
		New_York_Avenue.setHouse(0);
		New_York_Avenue.setRent(16);
		New_York_Avenue.setRentH1(80);
		New_York_Avenue.setRentH2(220);
		New_York_Avenue.setRentH3(600);
		New_York_Avenue.setRentH4(800);
		New_York_Avenue.setRentH5(1000);
		New_York_Avenue.setHouseCost(100);
		New_York_Avenue.setMortgage(100);
		New_York_Avenue.setUnMortgage(110);
		New_York_Avenue.setIsmortgaged(false);
		New_York_Avenue.setBought(false);
		New_York_Avenue.setcardAscii(asciiArt.New_York_Avenue_Ascii);
		//12 Kentucky_Avenue
		
		Kentucky_Avenue.setName("Kentucky Avenue");
		Kentucky_Avenue.setColor(PropertyType.red);
		Kentucky_Avenue.setPrice(220);
		Kentucky_Avenue.setHouse(0);
		Kentucky_Avenue.setRent(18);
		Kentucky_Avenue.setRentH1(90);
		Kentucky_Avenue.setRentH2(250);
		Kentucky_Avenue.setRentH3(700);
		Kentucky_Avenue.setRentH4(875);
		Kentucky_Avenue.setRentH5(1050);
		Kentucky_Avenue.setHouseCost(150);
		Kentucky_Avenue.setMortgage(110);
		Kentucky_Avenue.setUnMortgage(121);
		Kentucky_Avenue.setIsmortgaged(false);
		Kentucky_Avenue.setBought(false);
		Kentucky_Avenue.setcardAscii(asciiArt.Kentucky_Avenue_Ascii);
		//13 Indiana_Avenue
		
		Indiana_Avenue.setName("Indiana Avenue");
		Indiana_Avenue.setColor(PropertyType.red);
		Indiana_Avenue.setPrice(220);
		Indiana_Avenue.setHouse(0);
		Indiana_Avenue.setRent(18);
		Indiana_Avenue.setRentH1(90);
		Indiana_Avenue.setRentH2(250);
		Indiana_Avenue.setRentH3(700);
		Indiana_Avenue.setRentH4(875);
		Indiana_Avenue.setRentH5(1050);
		Indiana_Avenue.setHouseCost(150);
		Indiana_Avenue.setMortgage(110);
		Indiana_Avenue.setUnMortgage(121);
		Indiana_Avenue.setIsmortgaged(false);
		Indiana_Avenue.setBought(false);
		Indiana_Avenue.setcardAscii(asciiArt.Indiana_Avenue_Ascii);	
		//14 Illinois_Avenue
	
		Illinois_Avenue.setName("Illinois Avenue");
		Illinois_Avenue.setColor(PropertyType.red);
		Illinois_Avenue.setPrice(240);
		Illinois_Avenue.setHouse(0);
		Illinois_Avenue.setRent(20);
		Illinois_Avenue.setRentH1(100);
		Illinois_Avenue.setRentH2(300);
		Illinois_Avenue.setRentH3(750);
		Illinois_Avenue.setRentH4(925);
		Illinois_Avenue.setRentH5(1100);
		Illinois_Avenue.setHouseCost(150);
		Illinois_Avenue.setMortgage(120);
		Illinois_Avenue.setUnMortgage(122);
		Illinois_Avenue.setIsmortgaged(false);
		Illinois_Avenue.setBought(false);
		Illinois_Avenue.setcardAscii(asciiArt.Illinios_Avenue_Ascii);
		//15 Atlantic_Avenue
	 
		Atlantic_Avenue.setName("Atlantic Avenue");
		Atlantic_Avenue.setColor(PropertyType.yellow);
		Atlantic_Avenue.setPrice(260);
		Atlantic_Avenue.setHouse(0);
		Atlantic_Avenue.setRent(22);
		Atlantic_Avenue.setRentH1(110);
		Atlantic_Avenue.setRentH2(330);
		Atlantic_Avenue.setRentH3(800);
		Atlantic_Avenue.setRentH4(975);
		Atlantic_Avenue.setRentH5(1150);
		Atlantic_Avenue.setHouseCost(150);
		Atlantic_Avenue.setMortgage(130);
		Atlantic_Avenue.setUnMortgage(143);
		Atlantic_Avenue.setIsmortgaged(false);
		Atlantic_Avenue.setBought(false);
		Atlantic_Avenue.setcardAscii(asciiArt.Atlantic_Avenue_Ascii);
		//16 Ventor_Avenue
	
		Ventor_Avenue.setName("Ventor Avenue");
		Ventor_Avenue.setColor(PropertyType.yellow);
		Ventor_Avenue.setPrice(260);
		Ventor_Avenue.setHouse(0);
		Ventor_Avenue.setRent(22);
		Ventor_Avenue.setRentH1(110);
		Ventor_Avenue.setRentH2(330);
		Ventor_Avenue.setRentH3(800);
		Ventor_Avenue.setRentH4(975);
		Ventor_Avenue.setRentH5(1150);
		Ventor_Avenue.setHouseCost(150);
		Ventor_Avenue.setMortgage(130);
		Ventor_Avenue.setUnMortgage(143);
		Ventor_Avenue.setIsmortgaged(false);
		Ventor_Avenue.setBought(false);
		Ventor_Avenue.setcardAscii(asciiArt.Ventor_Avenue);
		//17 Marvin_Gardens
	
		Marvin_Gardens.setName("Marvin Gardens");
		Marvin_Gardens.setColor(PropertyType.yellow);
		Marvin_Gardens.setPrice(280);
		Marvin_Gardens.setHouse(0);
		Marvin_Gardens.setRent(24);
		Marvin_Gardens.setRentH1(120);
		Marvin_Gardens.setRentH2(360);
		Marvin_Gardens.setRentH3(850);
		Marvin_Gardens.setRentH4(1025);
		Marvin_Gardens.setRentH5(1200);
		Marvin_Gardens.setHouseCost(150);
		Marvin_Gardens.setMortgage(140);
		Marvin_Gardens.setUnMortgage(154);
		Marvin_Gardens.setIsmortgaged(false);
		Marvin_Gardens.setBought(false);
		Marvin_Gardens.setcardAscii(asciiArt.Marvin_Gardens_Ascii);
		//18 Pacific_Avenue
		
		Pacific_Avenue.setName("Pacific Avenue");
		Pacific_Avenue.setColor(PropertyType.green);
		Pacific_Avenue.setPrice(300);
		Pacific_Avenue.setHouse(0);
		Pacific_Avenue.setRent(26);
		Pacific_Avenue.setRentH1(130);
		Pacific_Avenue.setRentH2(390);
		Pacific_Avenue.setRentH3(900);
		Pacific_Avenue.setRentH4(1100);
		Pacific_Avenue.setRentH5(1275);
		Pacific_Avenue.setHouseCost(200);
		Pacific_Avenue.setMortgage(150);
		Pacific_Avenue.setUnMortgage(165);
		Pacific_Avenue.setIsmortgaged(false);
		Pacific_Avenue.setBought(false);
		Pacific_Avenue.setcardAscii(asciiArt.Pacific_Avenue_Ascii);
		//19 North_Carolina_Avenue
	
		North_Carolina_Avenue.setName("North Carolina Avenue");
		North_Carolina_Avenue.setColor(PropertyType.green);
		North_Carolina_Avenue.setPrice(300);
		North_Carolina_Avenue.setHouse(0);
		North_Carolina_Avenue.setRent(26);
		North_Carolina_Avenue.setRentH1(130);
		North_Carolina_Avenue.setRentH2(390);
		North_Carolina_Avenue.setRentH3(900);
		North_Carolina_Avenue.setRentH4(1100);
		North_Carolina_Avenue.setRentH5(1275);
		North_Carolina_Avenue.setHouseCost(200);
		North_Carolina_Avenue.setMortgage(150);
		North_Carolina_Avenue.setUnMortgage(165);
		North_Carolina_Avenue.setIsmortgaged(false);
		North_Carolina_Avenue.setBought(false);
		North_Carolina_Avenue.setcardAscii(asciiArt.North_Carolina_Avenue_Ascii);
		//20 Pennslvania_Avenue
	
		Pennslvania_Avenue.setName("Pennslvania Avenue");
		Pennslvania_Avenue.setColor(PropertyType.green);
		Pennslvania_Avenue.setPrice(320);
		Pennslvania_Avenue.setHouse(0);
		Pennslvania_Avenue.setRent(28);
		Pennslvania_Avenue.setRentH1(150);
		Pennslvania_Avenue.setRentH2(450);
		Pennslvania_Avenue.setRentH3(1000);
		Pennslvania_Avenue.setRentH4(1200);
		Pennslvania_Avenue.setRentH5(1400);
		Pennslvania_Avenue.setHouseCost(200);
		Pennslvania_Avenue.setMortgage(160);
		Pennslvania_Avenue.setUnMortgage(176);
		Pennslvania_Avenue.setIsmortgaged(false);
		Pennslvania_Avenue.setBought(false);
		Pennslvania_Avenue.setcardAscii(asciiArt.Pennsylvania_Avenue_Ascii);
		//21 Park_Place
		
		Park_Place.setName("Park Place");
		Park_Place.setColor(PropertyType.darkBlue);
		Park_Place.setPrice(350);
		Park_Place.setHouse(0);
		Park_Place.setRent(35);
		Park_Place.setRentH1(175);
		Park_Place.setRentH2(500);
		Park_Place.setRentH3(1100);
		Park_Place.setRentH4(1300);
		Park_Place.setRentH5(1500);
		Park_Place.setHouseCost(200);
		Park_Place.setMortgage(175);
		Park_Place.setUnMortgage(193);
		Park_Place.setIsmortgaged(false);
		Park_Place.setBought(false);
		Park_Place.setcardAscii(asciiArt.Park_Place_Ascii);
		//22 Boardwalk_
	
		Boardwalk.setName("Boardwalk");
		Boardwalk.setColor(PropertyType.darkBlue);
		Boardwalk.setPrice(400);
		Boardwalk.setHouse(0);
		Boardwalk.setRent(50);
		Boardwalk.setRentH1(200);
		Boardwalk.setRentH2(600);
		Boardwalk.setRentH3(1400);
		Boardwalk.setRentH4(1700);
		Boardwalk.setRentH5(2000);
		Boardwalk.setHouseCost(200);
		Boardwalk.setMortgage(200);
		Boardwalk.setUnMortgage(220);
		Boardwalk.setIsmortgaged(false);
		Boardwalk.setBought(false);
		Boardwalk.setcardAscii(asciiArt.Boardwalk_Ascii);
		//23 Reading_Railroad
	//TODO set real rent
		Reading_Railroad.setName("Reading Railroad");
		Reading_Railroad.setColor(PropertyType.railroad);
		Reading_Railroad.setPrice(200);
		Reading_Railroad.setRent(25);
		Reading_Railroad.setMortgage(100);
		Reading_Railroad.setUnMortgage(110);
		Reading_Railroad.setIsmortgaged(false);
		Reading_Railroad.setBought(false);
		Reading_Railroad.setcardAscii(asciiArt.Reading_Railroad_Ascii);
		//24 Pennsylvania_Railroad
	//TODO set real rent
		Pennsylvania_Railroad.setName("Pennsylvania Railroad");
		Pennsylvania_Railroad.setColor(PropertyType.railroad);
		Pennsylvania_Railroad.setPrice(200);
		Pennsylvania_Railroad.setRent(25);
		Pennsylvania_Railroad.setMortgage(100);		Pennsylvania_Railroad.setUnMortgage(110);		Pennsylvania_Railroad.setIsmortgaged(false);		Pennsylvania_Railroad.setBought(false);
		Pennsylvania_Railroad.setcardAscii(asciiArt.Pennsylvania_Railroad_Ascii);
		//25 BO_Railroad
	//TODO set real rent
		BO_Railroad.setName("B & O Railroad");
		BO_Railroad.setColor(PropertyType.darkBlue);
		BO_Railroad.setPrice(200);
		BO_Railroad.setRent(25);
		BO_Railroad.setMortgage(100);
		BO_Railroad.setUnMortgage(110);
		BO_Railroad.setIsmortgaged(false);
		BO_Railroad.setBought(false);
		BO_Railroad.setcardAscii(asciiArt.BO_Railroad_Ascii);
		//26 Short_Line
	//TODO set real rent
		Short_Line.setName("Short Line Railroad");
		Short_Line.setColor(PropertyType.darkBlue);
		Short_Line.setPrice(200);
		Short_Line.setRent(25);
		Short_Line.setMortgage(100);
		Short_Line.setUnMortgage(110);
		Short_Line.setIsmortgaged(false);
		Short_Line.setBought(false);
		Short_Line.setcardAscii(asciiArt.Short_Line_Ascii);
		//27 Electric_Company
	//TODO set real rent
		Electric_Company.setName("Electric Company");
		Electric_Company.setColor(PropertyType.utility);
		Electric_Company.setPrice(150);
		//if(electriccompany && WaterWorks are in the player array){
		//Electric_Company.setRent(DiceRoll * 10);
		//}
		//else{
		//Electric_Company.setRent(DiceRoll * 4)
		//}
		
		Electric_Company.setMortgage(75);
		Electric_Company.setUnMortgage(83);
		Electric_Company.setIsmortgaged(false);
		Electric_Company.setBought(false);
		Electric_Company.setcardAscii(asciiArt.Electric_Company_Ascii);
		//28 Water_Works
	
		//TODO set real rent
		Water_Works.setName("Water Works");
		Water_Works.setColor(PropertyType.utility);
		Water_Works.setPrice(150);
		//if(electriccompany && WaterWorks are in the player array){
				//Water_Works.setRent(DiceRoll * 10);
				//}
				//else{
				//Water_Works.setRent(DiceRoll * 4)
				//}
		Water_Works.setMortgage(75);
		Water_Works.setUnMortgage(83);
		Water_Works.setIsmortgaged(false);
		Water_Works.setBought(false);
		Water_Works.setcardAscii(asciiArt.Water_Works_Ascii);

	}
	
	}
