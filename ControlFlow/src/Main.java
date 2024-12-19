public class Main {
    public static void main(String[] args) {

        int age = 17;

        if(age >= 18) {
            System.out.println("You can vote");
            System.out.println("Please put X in ballot");
        } else {
            if (18 - age == 1) {
                System.out.println("You can't vote");
                System.out.println("Please come back in " + (18 - age) + " year");
            } else {
                System.out.println("You can't vote");
                System.out.println("Please come back in " + (18 - age) + " years");
            }

        }

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

//        boolean isActive = true;
//        int number = 10;
//
//        if (!(number < 20)) {
//            System.out.println("Active user");
//        } else {
//            System.out.println("User not active");
//        }

    }
}