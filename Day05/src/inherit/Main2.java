package inherit;

public class Main2 {
    public static void main(String[] args) {

        Employee emp = new Manager(11,"james",1000,100);
        System.out.println(emp);
        //Manager는 Employee를 상속받았기 때문에.
        //
        System.out.println(emp.getAnnSalary());
//        System.out.println(emp.getBonus());
        //매니저는 사원이다라고 선언해서 사원에 관한 기능은 다 호출 된다.
        //emp.toString은 하위클래스에서 재정의된것이 호출.
        //재정의된것은 호출 ok.


    }
}
