package basics;

public class Mobile {
	String brand;
	float price;
	String colour;
	Mobile(){
		
		brand="iphone";
		price=124400f;
		colour="sea blue";
		
		System.out.println("no arg called");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("colour:"+colour);
	}
	Mobile(String brand,float price){
		
		this.brand=brand;
		this.price=price;
		System.out.println("one arg called");
		System.out.println("brand:"+brand);
		System.out.println("price:"+price);
		System.out.println("colour:"+colour);

	}
		Mobile(String brand,float price,String colour){
			this.brand=brand;
			this.price=price;
			this.colour=colour;
			System.out.println("brand:"+brand);
			System.out.println("price:"+price);
			System.out.println("colour:"+colour);
		}
		
	
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		Mobile m1=new Mobile("oppo",12345f,"blue");
		Mobile m2=new Mobile("vivo",12345f);
		
		Mobile m3=new Mobile();
		
		
	}

}
