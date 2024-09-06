package inherit;

public class Main3 {
    public static void main(String[] args) {

        //Hetarogeneous Collection

        Employee[] emps = new Employee[4];
        //하위 클래스의 집한도 담을 수 있다.
        emps[0] = new Employee(100,"justin",1000);
        emps[1] = new Employee(101,"tom",1000);
        emps[2] = new Manager(102,"james",1000,100);
        emps[3] = new Manager(103,"kwak",1000,50);

        for(Employee e : emps){
            System.out.println(e);
            System.out.println(e.getAnnSalary());
            if(e instanceof Manager){
                Manager m = (Manager)e;// Employee를 Manger Type으로 바꾸고 getBonus 사용.
                System.out.println(((Manager) e).getBonus());

            }
        }
    }
}
