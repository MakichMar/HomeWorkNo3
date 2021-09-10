import java.util.Scanner;


public class HomeWork3 {
    public static void main(String[] args) {
//        Task 1
//        Scanner NumberScan = new Scanner(System.in);
//        System.out.println("Enter your first number ");
//        int number = NumberScan.nextInt();
//        System.out.println("select a symbol to define the operation 'a - add','s - subtract','m - multiply','d - divide': ");
//        String operation = NumberScan.next();
//        System.out.println("Enter second number");
//        int number2 = NumberScan.nextInt();
//        switch (operation) {
//            case "a":
//                System.out.println("Result of add is = " + (number + number2));
//                break;
//            case "b":
//                System.out.println("Result of subtract is = " + (number - number2));
//                break;
//            case "m":
//                System.out.println("Result of multiply is = " + number * number2);
//                break;
//            case "d":
//                if (number2 == 0)
//                    System.out.println("Тhe selected divide operation is incorrect, please try again");
//                else {
//                    System.out.println("Result of divide = " + number / number2);
//                }
//                break;
//            default:
//                System.out.println("Error,please try again");
//        }
// Task 2
        Scanner i = new Scanner(System.in);
        System.out.println("Select your floor");
        int floor = i.nextInt();
        if (floor > 5)
            System.out.println("Тhe house can't be higher than the 5th floor");
        else {
            switch (floor) {
                case 1:
                    System.out.println("Go to 1 floor");
                    break;
                case 2:
                    System.out.println("Go to 2 floor");
                    break;
                case 3:
                    System.out.println("Go to 3 floor");
                    break;
                case 4:
                    System.out.println("Go to 4 floor");
                    break;
                case 5:
                    System.out.println("Go to 5 floor");
                    break;
                default:
                    System.out.println("Going to parking ");
            }
        }
    }
}
