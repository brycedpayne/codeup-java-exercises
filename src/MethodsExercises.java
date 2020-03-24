import java.util.Scanner;

public class MethodsExercises {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static int mult(int x, int y) {
        int z = 0;
        for (int i = 0; i < y; i++) {
            z += x;
        }
        return z;
    }

    public static String div(double x, double y) {
        if (y == 0) {
            String error = "You cannot divide by 0";
            return error;
        } else {
            return Double.toString(x / y);
        }
    }

    public static int mod(int x, int y) {
        return x % y;
    }

//    public static int getInteger(int x,int y){
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter a number between 1 and 10:");
//        int numInput = input.nextInt();
//        boolean test = false;
//
//        do {
//            if (numInput >= x && numInput <= y) {
//                test = true;
//            } else {
//                System.out.printf("%d number is invalid.  Please enter a number between 1 and 10:\n", numInput);
//                numInput = input.nextInt();
//            }
//        } while (test == false);
//
//        return numInput;
//
//    }

    public static int getInteger(int x, int y) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter a number between %d and %d:", x, y);
        int numInput = input.nextInt();
        if (numInput < x || numInput > y) {
            return getInteger(x, y);
        }
        return numInput;
    }

    public static void factorial(int number){
        String output = "!" + number + " = 1";
        long numFact = 1;
        for (int i = 2; i < number +1; i++){
            output += " x " + i;
            numFact *= i;
        }
        System.out.println(output + " = " + numFact);
    }

//    public static int factorial(int number){
//        int i = 0;
//        if (number == 0){
//            return 1;
//        }
//        if (i <= number) {
//            i++;
//            i *= i;
//            return factorial(i);
//        }
//        return i;
//    }

    public static int dieRoll (int sides) {
        int roll1 = (int) (Math.random()*sides) +1;
        int roll2 = (int) (Math.random()*sides) +1;
        int pair = roll1 +roll2;
        return pair;
    }

    public static void main(String[] args) {
//        System.out.println(add(5, 3));
//        System.out.println(sub(5, 3));
//        System.out.println(mult(5, 3));
//        System.out.println(div(5, 2));
//        System.out.println(mod(5, 3));
//        int userInput = getInteger(1, 10);
//        System.out.printf("%d is a valid number.\n", userInput);
//        factorial(userInput);
        int dice = dieRoll(6);
        System.out.println(dice);
    }
}
