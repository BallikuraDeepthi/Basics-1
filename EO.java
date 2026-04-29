package basics;

public class EO {

	public static void main(String[] args) {
		int x=1;
		int result = x++ - ++x +x-- - --x +x++ -x + --x +x-- - ++x;
		System.out.println(result +" "+x);
         int a=1;
         int res= a++ - ++a -a++ + --a + a-- -a + ++a - a--;
         System.out.println(res +" "+a);
	}
	
	
} 
