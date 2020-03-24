import java.util.Scanner;

public class ConsoleExercises{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//
        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);
        System.out.format("The value of pi is approximately %.2f%n", pi);

//        System.out.println("Enter an integer: ");
//        int userInt = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInt + "\" <--");

//        System.out.print("Enter three words: ");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//        System.out.println("You entered: --> \"" + wordOne +" "+ wordTwo+" " +wordThree + "\" <--");

//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println("You entered: --> \"" +sentence + "\" <--");

        scanner.useDelimiter("\n");
        System.out.println("Enter classroom length, width, and height: ");
        String length = scanner.nextLine();
        String width = scanner.nextLine();
        String height = scanner.nextLine();

        double l = Double.parseDouble(length);
        double w = Double.parseDouble(width);
        double h = Double.parseDouble(height);

        System.out.printf("The area of the classroom is %.2f sqft.\n", l*w);
        System.out.printf("The perimeter of the classroom is %.2f ft.\n", (l+w)*2);
        System.out.printf("The volume of the classroom is %.2f cuft.\n", l*w*h);
    }
}