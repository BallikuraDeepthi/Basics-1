package basics;

public class Bankacc {
	double accno;
	String name;
	float balance;
	Bankacc(double accno){
		this.accno=accno;
		System.out.println("one arg called");
	}
	Bankacc(double accno,String name){
		this(accno);
		this.name=name;
		System.out.println("two arg called");
		
	}
	Bankacc(double accno,String name,float balance){
		this(accno,name);
		this.balance=balance;
		System.out.println("three arg called");
	}
	void disp4() {
		System.out.println("accno:"+accno);
		System.out.println("name:"+name);
	System.out.println("balance:"+balance);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Bankacc b1=new Bankacc(123456678);
		Bankacc b2=new Bankacc(6789900544d,"deepthy");
		Bankacc b3=new Bankacc(7899544567d,"karthi",2345f);
		
		b3.disp4();
	}

}
