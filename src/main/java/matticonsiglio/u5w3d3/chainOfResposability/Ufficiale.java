package matticonsiglio.u5w3d3.chainOfResposability;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Ufficiale {
    private int stipendio;
    private Ufficiale superiore;

    public void doCheck(double cifra) {
        if (cifra <= this.stipendio)
            System.out.println("Lo stipendio di " + this.getClass().getSimpleName() + " è maggiore o uguale a " + cifra);
        if (superiore != null) {
            this.superiore.doCheck(cifra);
        } else {
            System.out.println("Non ci sono altri ufficiali di grado superiore");
        }
    }
}
