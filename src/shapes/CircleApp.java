package shapes;

import util.Input; //not necessary if in same package.

public class CircleApp {
    //circles init.
    private static int circles;
    //countCircles method.
    public static void countCircles(){
        circles++;
    }


    public static void main(String[] args) {
        Input input = new Input(); //create new Input instance.
        boolean doAgain;  //init variable for repeating.

        do {
            Circle circle = new Circle(input.getDouble("Please enter a radius: ")); //init ne Circle instance.
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());
            countCircles();
            doAgain = input.yesNo("Do another circle? (y/n): ");
        } while (doAgain);

        System.out.printf("You did %d circle.", circles);//prints out iteration of circles done.

    }
}
