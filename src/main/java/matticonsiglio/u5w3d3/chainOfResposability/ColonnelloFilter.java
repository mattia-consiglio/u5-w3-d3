package matticonsiglio.u5w3d3.chainOfResposability;

public class ColonnelloFilter extends Filter {
    @Override
    public void check(int salary) {
        if (salary <= new Colonnello().getStipendio()) {
            System.out.println("Colonnello Salary is " + salary + " and it's OK");
        } else {
            System.out.println("Colonnello Salary is " + salary + " and it's NOT OK");
            callNext(salary);
        }
    }
}
