import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int i = 5;
//
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println(" ");
//        long x = 2;
//        do {
//            System.out.print(x + " ");
//            x+= 2;
//        } while (x <= 100);
//        System.out.println(" ");
//        do {
//            System.out.print(x + " ");
//            x -= 5;
//        } while (x >= -10);
//        do {
//            System.out.print(x + " ");
//            x *= x;
//        } while (x <= 1000000);

//
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
        String response;
        do {
            System.out.println("What number would you like to go up to? :");
            int inputNum = input.nextInt();


            System.out.println("Here is your table! : ");
            System.out.println("\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i<= inputNum; i++) {
                System.out.printf("%-6d | %-7d | %d\n", i,i*i,i*i*i);
            }

            System.out.println("Would you like to enter a new number? (y/n)");
            response = input.next();
        } while (response.equalsIgnoreCase("y"));

        do {
            System.out.println("What is your grade? (0-100) :");
            float inputNum = input.nextFloat();


            String letterGrade;

            if (inputNum >= 97 && inputNum <= 100) {
                letterGrade = "A+";
            } else if (inputNum >= 92 && inputNum < 97) {
                letterGrade = "A";
            } else if (inputNum >= 88 && inputNum < 92) {
                letterGrade = "A-";
            } else if (inputNum >= 86 && inputNum < 88) {
                letterGrade = "B+";
            } else if (inputNum >= 82 && inputNum < 86) {
                letterGrade = "B";
            } else if (inputNum >= 80 && inputNum < 82) {
                letterGrade = "B-";
            } else if (inputNum >= 77 && inputNum < 80) {
                letterGrade = "C+";
            } else if (inputNum >= 72 && inputNum < 77) {
                letterGrade = "C";
            } else if (inputNum >= 67 && inputNum < 72) {
                letterGrade = "C-";
            } else if (inputNum >= 64 && inputNum < 67) {
                letterGrade = "D+";
            } else if (inputNum >= 62 && inputNum < 64) {
                letterGrade = "D";
            } else if (inputNum >= 60 && inputNum < 62) {
                letterGrade = "D-";
            } else {
                letterGrade = "F";
            }
            System.out.printf("Your letter grade is: %s\n", letterGrade);
            System.out.println("\n");


            System.out.print("Would you like to enter a new number? (y/n)");
            response = input.next();
        } while (response.equalsIgnoreCase("y"));

    }
}

