package inherit;

//Manager is an Employee
public class Manager extends Employee {
    private double bonus;

    public Manager() {

    }

    public Manager(int empNo, String name, double salary, double bonus) {
        super(empNo, name, salary);
        this.bonus = bonus;
    }


    public String toString() {
        return "Manger:" + super.getEmpNo() + " " + super.getName()+ " "
                + super.getSalary()+" " + this.bonus;
    }

    @Override
    public double getAnnSalary() {
        return super.getAnnSalary() + bonus;
    }

    public double getBonus() {
        return bonus;
    }//Manger만이 가질 수 있는 함수.
}
