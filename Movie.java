package basics;

public class Movie {
	String title;
	String director;
	float rating;

	Movie() {
		this("dude");
		System.out.println("no arg constructor");

	}

	public Movie(String title) {
		this(title, "puri");
		this.title=title;

	}

	public Movie(String title, String director) {
		this(title, director,3.0f);
		this.director="puri";


		System.out.println("one arg constructor");
	}

	public Movie(String title, String director, float rating) {
		System.out.println("two arg constructor");
		this.rating= 3.0f;


	}

	void show() {
		System.out.println("title:" + title);
		System.out.println("director:" + director);
		System.out.println("rating:" + rating);
		
	}

	public static void main(String[] args) {
		Movie m1 = new Movie();
		m1.show();

	}

}
