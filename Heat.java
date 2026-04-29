package basics;

public class Heat {
	
	static int C=80;
	static double F;
	

	
	
	public static void main(String[] args) {
		F=(C*9/5)+32;
		double k=(int)(F-32)*5/9;
		System.out.println("c to F heat:"+F);
		System.out.println("f to c degree:"+k);
		
		
	}

}
