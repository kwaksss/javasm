package inherit2;

public class Rectangle extends Shape {

    private int w;
    private int h;
    public Rectangle() {}
    public Rectangle(int w, int h,int x, int y) {
        super(x, y);//반드시 첫번째 라인.
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "w=" + w +
                ", h=" + h +
                ']' + super.toString();
    }



    @Override
    public double getArea() {
        return this.w * this.h;
    }

    @Override
    public double getCircum() {
        return (this.w + this.h) * 2;

    }
}
