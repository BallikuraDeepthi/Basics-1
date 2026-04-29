package basics;

public class Arrayrepeatednum {

	
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		int a[] = { 1, 3, 1, 2, 5, 2, 7 };

		for (int i = 0;
				i < a.length; i++) {
			if (a[i] == 1) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					a[j] = -1;
				}
			}
			System.out.println(a[i] + " " + count + "times");

		}
	}
}
