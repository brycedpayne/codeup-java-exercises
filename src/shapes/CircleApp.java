package shapes;

import util.Input; //not necessary if in same package.

public class CircleApp {

    private static int circles;

    public static void countCircles(){
        circles++;
    }


    public static void main(String[] args) {
        Input input = new Input();
//        int circleCount = 0;

        boolean doAgain;
        do {
            Circle circle = new Circle(input.getDouble("Please enter a radius: "));
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
            countCircles();

            doAgain = input.yesNo("Do another circle? (y/n): ");
        } while (doAgain);

        System.out.printf("You did %d circle.", circles);

    }
}
