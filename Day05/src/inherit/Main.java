package inherit;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(100,"James",1000);
        //Employee is a Object
        Manager mgr = new Manager(101,"Tom",1000,100);

        System.out.println(employee.getSalary());
        System.out.println(mgr.getSalary());
        System.out.println(mgr.getBonus());

        System.out.println(employee.toString());
        System.out.println(mgr.toString());
        //최상위 클래스만 변경하면 하위 클래스도 그것을 사용.
        //하위 클래스에서는 없지만 상위 클래스에서 정의한 toString을 이용해서 사용 가능.
        //대신 상위 클래스에서 정의한 대로만 출력.

        System.out.println(mgr.getAnnSalary());
        System.out.println(employee.getAnnSalary());

//        employee.salary = 1000000;
        //protect는 데이터 변경 위험이 있기에 위험하다.


    }
}
