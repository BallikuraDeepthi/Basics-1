package basics;

public class Dup {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a[] = { 1, 2, 3, 2, 1, 4 };
		boolean b[] = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			if (b[i] == true)
				continue;

			int count = 1;

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					b[j] = true;
				}
			}
			if(count>1)
			System.out.println(a[i]+" "+count);
		}
	}

}
