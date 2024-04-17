package matticonsiglio.u5w3d3.chainOfResposability;

public class MaggioreFilter extends Filter {
    @Override
    public void check(int salary) {
        if (salary <= new Maggiore().getStipendio()) {
            System.out.println("Maggiore Salary is " + salary + " and it's OK");
        } else {
            System.out.println("Maggiore Salary is " + salary + " and it's NOT OK");
            callNext(salary);
        }
    }
}
