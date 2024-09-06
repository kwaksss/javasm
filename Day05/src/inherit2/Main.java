package inherit2;

//그림판
public class Main {
    public static void main(String[] args) {

//        Shape shape = new Shape();
        //추상 클래스는 객체 생성 x
        Shape shape[] = new Shape[3];
        shape[0] = new Circle(54,10,10);
        shape[1] = new Rectangle(100,200,20,20);
        shape[2] = new Triangle(300,400,30,30);

        for(Shape s : shape){
            System.out.println(s);
            System.out.println(s.getArea());
            System.out.println(s.getCircum());
            System.out.println("-----------------------");
        }



    }
}
