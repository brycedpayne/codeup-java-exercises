package shapes;

//import util.Input; //not necessary if in same package.

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI *(Math.pow(radius,2.0));
    }
    public double getCircumference(){
        return Math.PI * (radius*2.0);
    }

}

