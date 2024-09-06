package inherit2;

public class Triangle extends Shape {
    private int w;
    private int h;
    public Triangle() {}

    public Triangle(int w, int h,int x,int y) {
        super(x,y);
        this.w = w;
        this.h = h;

    }

    @Override
    public String toString() {
        return "Triangle[" +
                "w=" + w +
                ", h=" + h +
                ']' + super.toString();
    }

    public double getArea() {
        return w * h *0.5;
    }
    public double getCircum() {
        return  (Math.sqrt(Math.pow(this.w,2) + Math.pow(this.h,2))) +
                this.w + this.h;
    }
}
