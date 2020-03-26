package shapes;

//import util.Input; //not necessary if in same package.

public class Circle {
    //radius init.
    private double radius;
    //Circle constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    //radius getter
    public double getRadius() {
        return radius;
    }
    //radius setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //getArea method for Circle class
    public double getArea(){
        return Math.PI *(Math.pow(radius,2.0));
    }
    //getCircumference method for Circle class
    public double getCircumference(){
        return Math.PI * (radius*2.0);
    }

}

