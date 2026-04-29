package basics;


public class cars {
	//static int insurance=500;
	//static int rentalrate=1500;
	String getname(){
		System.out.println("Name of the person");
		
		String name="deepthycars";
		return name;
		
	}
	double getdailyprice(){
		return 1500;
		
		
	}
	int getinsurance() {
		return 500;
	}
	double basecost(int days) {
		return days*getdailyprice();
	}
	double totalamount(int days) {
		return basecost(days)+getinsurance();
	}

	public static void main(String[] args) {
		cars c1 =new cars();
		System.out.println("daily prize:"+c1.getdailyprice());
		System.out.println("insurance:"+c1.getinsurance());
		System.out.println("basecost:"+c1.basecost(5));

		System.out.println("totalamount:"+c1.totalamount(5));
		
	}

}
