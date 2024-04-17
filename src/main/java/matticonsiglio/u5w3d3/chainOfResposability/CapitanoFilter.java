package matticonsiglio.u5w3d3.chainOfResposability;

public class CapitanoFilter extends Filter {
    @Override
    public void check(int salary) {
        if (salary <= new Capitano().getStipendio()) {
            System.out.println("Capitano Salary is " + salary + " and it's OK");
        } else {
            System.out.println("Capitano Salary is " + salary + " and it's NOT OK");
            callNext(salary);
        }
    }
}
