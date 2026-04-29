package basics;



public class Alphaloop {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		for(  char a='A';a<='Z';a++) {
			System.out.println(a);
		}
		for(  char a='a';a<='z';a++) {
			System.out.println(a);
		}
		int Position=0;
		for(  char a='A';a<='Z';a++) {
			Position++;
			System.out.println(a +"->" +Position);
		}
	}

}
