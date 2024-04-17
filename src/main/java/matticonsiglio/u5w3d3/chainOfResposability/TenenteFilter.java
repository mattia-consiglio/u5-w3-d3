package matticonsiglio.u5w3d3.chainOfResposability;

public class TenenteFilter extends Filter {
    @Override
    public void check(int salary) {
        if (salary <= new Tenente().getStipendio()) {
            System.out.println("Tenente Salary is " + salary + " and it's OK");
        } else {
            System.out.println("Tenente Salary is " + salary + " and it's NOT OK");
            callNext(salary);
        }
    }
}
