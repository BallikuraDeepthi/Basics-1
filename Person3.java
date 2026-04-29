package basics;

public class Person3 {

	public static void main(String[] args) {
		Student3 s2=new Student3();
		s2.setSid(1);
		s2.setName("deep");
		s2.setTotalfee(28000);
		s2.setPaidfee(25000);
		System.out.println("balance has to be paid");
		System.out.println( s2.getTotalfee()-s2.getPaidfee());
		System.out.println("name:"+s2.getName());
		System.out.println("sid:"+s2.getSid());
		System.out.println("total:"+s2.getTotalfee());
		System.out.println("paid:"+s2.getPaidfee());
	
		

	}

}
