package basics;

public class Deepcopy {

	
		
		int x;
		Deepcopy(int x){
			this .x=x;
		}
		Deepcopy(Deepcopy obj){
			this.x=obj.x;
		}
		public static void main(String [] args) {
			Deepcopy m=new Deepcopy(10);
			Deepcopy n=new Deepcopy(m);
			n.x=20;
			
			System.out.println(m.x);
			System.out.println(n.x);
			
		}

	}


