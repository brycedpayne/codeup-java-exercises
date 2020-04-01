package shapes;

class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }


    //
//    protected double length,width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getPerimeter(){
//        return (2*length) + (2*width);
//    }
//
//    public double getArea(){
//        return length * width;
//    }
    public double getLength() {
        return length;
    }

    //
//    public void setLength(int length) {
//        this.length = length;
//    }
//
    public double getWidth() {
        return width;
    }

//    public void setWidth(int width) {
//        this.width = width;
//    }

}
