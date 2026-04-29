package basics;

public class Marks {
	 static float avg;
	
	
	
    static {
	System.out.println("marks of the students");
	
	
}
	public static void main(String[] args) {
		 int mysql=22;
		 int english=33;
		int chemistry=99;
		int dbms=67;
		int java=67;
		 int add;
		
		float result =avg;
		Marks S1= new Marks();
		float f=(float)mysql;
		float f1=(float)english;
		float f2=(float)chemistry;
		float f3=(float)dbms;
		float f4=(float)java;
		

		 add=(mysql+english+chemistry+dbms+java);
	 avg=add/2;
		System.out.println("student 1 details");
		System.out.println("mysql:"+ f);
		System.out.println("english:"+f1);
		System.out.println("chemistry:"+f2);
		System.out.println("dbms:"+f3);
		System.out.println("java:"+f4);
		System.out.println(avg);
		System.out.println(f);
	
		
		
		
		
    

	}

}
