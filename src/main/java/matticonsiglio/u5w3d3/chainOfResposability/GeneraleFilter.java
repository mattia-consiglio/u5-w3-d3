package matticonsiglio.u5w3d3.chainOfResposability;

public class GeneraleFilter extends Filter {
    @Override
    public void check(int salary) {
        if (salary <= new Generale().getStipendio()) {
            System.out.println("Generale Salary is " + salary + " and it's OK");
        } else {
            System.out.println("Generale Salary is " + salary + " and it's NOT OK");
            callNext(salary);
        }
    }
}
