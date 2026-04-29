package basics;

public class Calculator {
	
	int add(int a,int b) {
		int sum=a+b;
		return sum;
		//System.out.println("add:"+(sum));
	}
	
	int sub(int a,int b) {
		int sub=a-b;
		return sub;
	}
	int div(int a,int b) {
		int div=a/b;
		return div;
	}
	int mul(int a,int b) {
		int mul=a*b;
		return mul;
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Calculator c1=new Calculator();
		System.out.println("sum:"+c1.add(10,20));
		System.out.println("sub:"+c1.sub(2, 0));
		System.out.println("div:"+c1.div(40,10));
		System.out.println("mul:"+c1.mul(6,9));
		
	}

}
