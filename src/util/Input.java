package util;

import java.util.Scanner;

public class Input {

    //init scanner
    private static Scanner scanner;
    //scanner constructor
    public Input() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }
    //getString method w/ default prompt. returns input string.
    public String getString() {
        return getString("Please type a sentence: ");
    }
    //getString method w/ custom prompt. returns input string.
    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    //yesNo method w/ default prompt. returns boolean T/F for Y/N.
    public boolean yesNo() {
        return yesNo("(y/n): ");
    }
    //yesNo method w/ custom prompt. returns boolean T/F for Y/N.
    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        char response = scanner.nextLine().trim().toLowerCase().charAt(0);
        if (Character.compare(response,'y') == 0) {
            return true;
        } else if (Character.compare(response,'n') == 0) {
            return false;
        } else {
            return yesNo();
        }
    }
    //getInt method w/ default prompt. returns input int between min & max.
    public int getInt(int x, int y) {

            return getInt(x, y, String.format("Please enter a number between %d and %d: ", x, y));

    }
    //getInt method w/ custom prompt. returns input int between min & max.
    public int getInt(int x, int y, String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        int i;

        try{                                    //validation try/catch.
            i = Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            return getInt(x,y,prompt);
        }

        if (i < x || i > y) {
            return getInt(x, y,prompt);
        }
        return i;
    }

//    public int getInt(int x, int y, String prompt) {
//        System.out.printf(prompt);
//        String input = scanner.nextLine();
//        int numInput = Integer.parseInt(input);
//        if (numInput < x || numInput > y) {
//            return getInt(x, y);
//        }
//        return numInput;
//    }
    //getInt method w/ default prompt. returns input int.
    public int getInt() {
        return getInt("Please enter an integer: ");
    }

//    public int getInt(String prompt) {
//        System.out.print(prompt);
//        String input = scanner.nextLine();
//        return Integer.parseInt(input);
//    }
    //getInt method w/ custom prompt. returns input int.
    public int getInt(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();

        try{
            return Integer.parseInt(input.trim());
        } catch (NumberFormatException e) {
            return getInt(prompt);
        }
    }
    //getDouble method w/ default prompt. returns input double between min & max.
    public double getDouble(double x, double y) {
        return getDouble(x, y, String.format("Please enter a number between %f and %f: ", x, y));
    }
    //getDouble method w/ custom prompt. returns input double between min & max.
    public double getDouble(double x, double y, String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();
        double d;

        try{
            d = Double.parseDouble(input.trim());
        } catch (NumberFormatException e) {
            return getDouble(x,y,prompt);
        }

        if (d < x || d > y) {
            return getDouble(x, y);
        }
        return d;
    }

//    public double getDouble(double x, double y, String prompt) {
//        System.out.printf(prompt);
//        double numInput = scanner.nextDouble();
//        if (numInput < x || numInput > y) {
//            return getDouble(x, y);
//        }
//        return numInput;
//    }
    //getDouble method w/ default prompt. returns input double.
    public double getDouble() {
        return getDouble("Please an decimal number: ");
    }

//    public double getDouble(String prompt) {
//        System.out.print(prompt);
//        return scanner.nextDouble();
//    }
    //getDouble method w/ custom prompt. returns input double.
    public double getDouble(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine();

        try{
            return Double.parseDouble(input.trim());
        } catch (NumberFormatException e) {
            return getDouble(prompt);
        }
    }

}
