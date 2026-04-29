package basics;

public class assignment5 {
	static int uniquememberid=100;
	static int maxbooks = 5;
	String name;
	int booksissued;{
		uniquememberid++;
	
	}
	
	
	static {
		System.out.println("where each student can barrow 5 books");
		maxbooks=5;
		
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("person1 details:");
		assignment5 S1= new assignment5 ();
		String name=("deepthy");
		int booksissued=3;
		System.out.println("uniquememberid:"+uniquememberid );
		System.out.println("name:"+name);
		System.out.println("books isssued:"+booksissued);
		assignment5 S2 = new assignment5();
		System.out.println("person2 details:");
		 int rb=maxbooks-booksissued;

		
		S2.name = ("bujji");
		S2.booksissued = 4;
		System.out.println("uniquememberid:"+S2.uniquememberid );
		System.out.println("name:"+S2.name);
		System.out.println("books isssued:"+S2.booksissued);
		System.out.println("person3 details:");
		assignment5 S3= new assignment5 ();
		S3.name = ("karthi");
		S3.booksissued = 2;
		System.out.println("uniquememberid:"+S3.uniquememberid );
		System.out.println("name:"+S3.name);
		System.out.println("books isssued:"+S3.booksissued);
		System.out.println("remaining books "+rb);
		
		
		
		
		
		
		
		
		
	

	}

}
