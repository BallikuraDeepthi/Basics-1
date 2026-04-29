package basics;

public class Book {
	int bookid;
	String title;
	String author;
	double price;
	double discountper;
	double discount;
	
   double finalAmount;
	public static void main(String[] args) {
		System.out.println("book1 details");
		Book b1=new Book();
		b1.bookid=1234;
		b1. title="thank you";
		b1. author="deepthy";
		b1. price=400;
		b1.discountper=0.10;
         b1. discount=b1.discountper*b1.price;	
         b1.finalAmount=b1.price-b1.discount;
         
		
		
		System.out.println("bookid:"+b1.bookid);
		System.out.println("tile:"+b1.title);
		System.out.println("author:"+b1.author);
		System.out.println("price:"+b1.price);
		System.out.println("discount price:"+b1.discountper);
         System.out.println(b1.discount);
		System.out.println("finalprice:"+b1.finalAmount);
	

	}

}
