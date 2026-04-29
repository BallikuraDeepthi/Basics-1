package basics;

public class Libraryclass {

	public static void main(String[] args) {
	Studentmember s1=new Studentmember();
	s1.setName("harrypotter");
	s1.setBarrowedbooks(2);
	Premiumnumber p1=new Premiumnumber();
	p1.setName("hima book");
	p1.setBarrowedbooks(1);
	System.out.println("studentfee:"+s1.calculateFee());
	System.out.println("premium fee:"+ p1.calculateFee());

	}
}
