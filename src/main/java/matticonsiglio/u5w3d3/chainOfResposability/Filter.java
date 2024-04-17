package matticonsiglio.u5w3d3.chainOfResposability;

import lombok.Setter;

@Setter
public abstract class Filter {
    private Filter successor;

    public abstract void check(int salary);

    public void callNext(int salary) {
        if (successor != null) {
            successor.check(salary);
        } else System.out.println("No more filters");
    }
}
