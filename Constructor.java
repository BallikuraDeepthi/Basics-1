package basics;

import java.io.PrintStream;

public class Constructor {
	int id;
	String course;
	double mobile;
	Constructor(){
		System.out.println("no arg constructed");
	}
	public void constructor1(int id) {
		this.id=123;
		this.course="jfs";
		System.out.println("one arg called");
	}
	public void constructor2(int id,String course) {
		this.id=234;
		this.course="db";
		this.mobile=9705304544d;
		System.out.println("two arg called");
	}
	public void Constructor3(int id,String course,double mobile) {
		System.out.println("three arg called");
	}
	   void method2() {
		System.out.println("method called");
		this.id=345;
		this.course="phy";
		this.mobile=9705304544d;
		System.out.println("id:"+id);
		System.out.println("course:"+course);
		System.out.println("mobile:"+mobile);
		
		
	}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		

		Constructor c1=new Constructor();
		c1.method2();
		c1.id=25;
		Constructor c2=new Constructor();
		c2.course="jfs";
		Constructor c3=new Constructor();
		c3.mobile=3457888d;
				
			
		}
		
		
	}


