package basics;

public class Constructor1 {
	int x;
	String name;

	Constructor1(int x) {
		System.out.println("one arg constructor called:");
		this.x = x;

	}

	Constructor1(int x, String name) {
		this.x = x;
		this.name = name;

		System.out.println("two args constructor called");
	}
	Constructor1(Constructor1 v){
		this.x = v.x;
		this.name = v.name;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Constructor1 m = new Constructor1(20);
		Constructor1 r = new Constructor1(10, "deepthy");
		System.out.println("x value:" + r.x);
		System.out.println("name:" + r.name);
		System.out.println("x value:" + m.x);
		Constructor1 r1 = new Constructor1(r);
		System.out.println("x value:" + r1.x);
		System.out.println("name:" + r1.name);
	}
}
