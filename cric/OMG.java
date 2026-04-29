package com.cric;

public class OMG {
	static int countryId;
	static String countryname;
	int jerseyNo;
	String name;
	
	

	public static void main(String[] args) {
	System.out.println("main method started");
	System.out.println("welcome to indian criket team");
	System.out.println("object1 information");
	OMG dh = new OMG() ; 
	
	countryId = 91 ;
	countryname = "India" ;
	
   dh.jerseyNo = 9 ;
   dh.name = "deepthy" ;
   System.out.println("CountryId:" + countryId);
   System.out.println("Country Name :" + countryname);
   System.out.println("dh.jerseyNo:" + dh.jerseyNo );
   System.out.println("dh.Name :" + dh.name);
   
   
   System.out.println("object2 information");
   OMG dh1 = new OMG() ; 
   dh1.jerseyNo = 16 ;
   dh1.name = "muni" ;
   System.out.println("CountryId:" + countryId);
   System.out.println("Country Name :" + countryname);
   System.out.println("dh1.jerseyNo:" + dh1.jerseyNo );
   System.out.println("dh1.Name :" + dh1.name);
	
	System.out.println("object3information");
	OMG dh2 = new OMG() ; 
	dh2.jerseyNo = 12;
	dh2.name = "dinesh" ;
	System.out.println("CountryId:" + countryId);
	   System.out.println("Country Name :" + countryname);
	   System.out.println("dh2.jerseyNo:" + dh2.jerseyNo );
	   System.out.println("dh2.Name :" + dh2.name);
	
   
   
   
	
	
	
		

	}

}
