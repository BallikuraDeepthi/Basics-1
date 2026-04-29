package basics;

import java.util.Scanner;

public class Nestedswitch1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month number (1–12): ");
        int month = sc.nextInt();

        System.out.print("Enter your choice: 1 for Days, 2 for Season: ");
        int choice = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                switch (choice) {
                    case 1:
                        System.out.println("31 days");
                        break;
                    case 2:
                        System.out.println("Winter");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;

            case 2:
                System.out.println("February");
                switch (choice) {
                    case 1:
                        System.out.println("28/29 days");
                        break;
                    case 2:
                        System.out.println("Winter");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;

            case 3:
                System.out.println("March");
                switch (choice) {
                    case 1:
                        System.out.println("31 days");
                        break;
                    case 2:
                        System.out.println("Spring");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;

            case 4:
                System.out.println("April");
                switch (choice) {
                    case 1:
                        System.out.println("30 days");
                        break;
                    case 2:
                        System.out.println("Spring");
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
                break;

            default:
                System.out.println("Invalid month number");
        }

        
        sc.close();
    }
}
