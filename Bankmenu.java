package basics;

import java.util.Scanner;

public class Bankmenu {

	public static void main(String[] args) {
		System.out.println("banking menu");
		System.out.println("choose option");
		System.out.println("1.check balance");
		System.out.println("2.deposit money");
		System.out.println("3.withdraw ammount");
		System.out.println("4.exit");
		System.out.println("enter your option:");
		double bal=5000;
		Scanner sc= new Scanner(System.in);

		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("ur balance:"+bal);
			break;

	case 2:
		System.out.println("enter your deposit");
		double deposit=sc.nextDouble();
		bal=bal+deposit;
		System.out.println("updated balance:"+bal);
		break;
	case 3:
		System.out.println("enter your withdraw ammount");
		double withdraw=sc.nextDouble();
		System.out.println("withdraw ammount:"+withdraw);
		if(withdraw<=bal) {
			System.out.println("sucessfully withdraw");
		}
			else {
				System.out.println("insufficient funds");
				break;
			}
			case 4:
				System.out.println("exit");
				System.out.println("thank you");
				break;
				default:
					System.out.println("invaild ");
				
			}
		}
		
			
		}
		
		


