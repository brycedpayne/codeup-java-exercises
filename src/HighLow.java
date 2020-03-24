import java.util.Scanner;

public class HighLow {

    public static int getInteger(int x, int y) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter a number between %d and %d:", x, y);
        int numInput = input.nextInt();
        if (numInput < x || numInput > y) {
            return getInteger(x, y);
        }
        return numInput;
    }

    public static String check(long random) {
        int guess = getInteger(1, 100);
        String response = "GOOD GUESS!";

        if (guess == random) {
            return response;
        } else if (guess > random) {
            System.out.println("LOWER");
            return check(random);
        } else if (guess < random) {
            System.out.println("HIGHER");
            return check(random);
        }
        return response;
    }

    public static void main(String[] args) {
        long randomNum = (long) (Math.random() * 100) + 1;
        System.out.println(randomNum);

        String guess = check(randomNum);
        System.out.println(guess);

    }
}
