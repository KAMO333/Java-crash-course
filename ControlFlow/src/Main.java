import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


//        int age = 17;
//
//        if(age >= 18) {
//            System.out.println("You can vote");
//            System.out.println("Please put X in ballot");
//        } else {
//            if (18 - age == 1) {
//                System.out.println("You can't vote");
//                System.out.println("Please come back in " + (18 - age) + " year");
//            } else {
//                System.out.println("You can't vote");
//                System.out.println("Please come back in " + (18 - age) + " years");
//            }
//
//        }

//        int year = 2022;
//
//        if (year == 2019) {
//            System.out.println("the year is " + year);
//        } else if (year == 2020) {
//            System.out.println("the year is " + year);
//        } else if ( year == 2022) {
//            System.out.println("the year is " + year);
//        } else {
//            System.out.println("all conditions failed");
//        }

//        boolean isActive = false;
//        int score = 100;
//
//        if (!(number < 20)) {
//            System.out.println("Active user");
//        } else {
//            System.out.println("User not active");
//        }

//        if (score >= 100 && isActive == true) {
//            System.out.println("You opened the next level");
//        } else {
//            System.out.println("same level");
//        }
//     int num1 = -1;
//     int num2 = 0;
//
//     if (num1 > 0 || num2 > 0) {
//         System.out.println("True condition");
//     } else {
//         System.out.println("False conditions");
//     }
        System.out.println("Enter time: ");
        int time = scanner.nextInt();

        switch (time) {
            case 10:
                System.out.println("time is " + time);
                break;
            case 12:
                System.out.println("timme is " + time);
                break;
            default:
                System.out.println("time is " + time);
                break;
        }
    }
}