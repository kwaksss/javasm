package inherit2;

public class Circle extends Shape {

    private int r;
    public Circle() {}

    public Circle(int r , int x , int y) {
        super(x,y);
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "r=" + r +
                ']' + super.toString();
    }

    public double getArea() {
        return Math.PI * r * r;
    }
    public double getCircum() {
        return 2 * Math.PI * r;
    }
}
