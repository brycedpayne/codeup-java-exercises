package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
        this.side = side;
    }
//
    private double side;

    @Override
    public void setWidth(double width) {
        this.width = side;
    }

    @Override
    public void setLength(double length) {
        this.width = side;
    }

    @Override
    public double getPerimeter() {
        return 4*side;
    }

    @Override
    public double getArea() {
        return side*side;
    }
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getPerimeter(){
//        return 4*side;
//    }
//
//    public double getArea() {
//        return Math.pow(side,2);
//    }
}
