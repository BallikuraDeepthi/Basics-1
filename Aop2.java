package basics;

public class Aop2 {
	

	public static void main(String[] args) {
		System.out.println("main method started");
		int a=9;
		int result=0;
		
		result = result + 20;
		result+=5.5;
		System.out.println("result:"+result);
		result-=5;
		System.out.println("result:"+result);
		result*=3;
		System.out.println("result:"+result);
		result/=4;
		System.out.println("result:"+result);
	}
}