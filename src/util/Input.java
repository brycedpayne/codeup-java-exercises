package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner;

    public Input() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }

    public String getString() {
        return getString("Please type a sentence: ");
    }
    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        return yesNo("(y/n): ");
    }
    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        String response = scanner.next();
        if (response.equalsIgnoreCase("y")) {
            return true;
        } else if (response.equalsIgnoreCase("n")) {
            return false;
        } else {
            return yesNo();
        }
    }

    public int getInt(int x, int y) {

            return getInt(x, y, String.format("Please enter a number between %d and %d: ", x, y));

    }
    public int getInt(int x, int y, String prompt) {
        System.out.printf(prompt);
        int numInput = scanner.nextInt();
        if (numInput < x || numInput > y) {
            return getInt(x, y);
        }
        return numInput;
    }

    public int getInt() {
        return getInt("Please enter an integer: ");
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double x, double y) {
        return getDouble(x, y, String.format("Please enter a number between %f and %f: ", x, y));
    }

    public double getDouble(double x, double y, String prompt) {
        System.out.printf(prompt);
        double numInput = scanner.nextDouble();
        if (numInput < x || numInput > y) {
            return getDouble(x, y);
        }
        return numInput;
    }

    public double getDouble() {
        return getDouble("Please an decimal number: ");
    }

    public double getDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

}
