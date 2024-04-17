package matticonsiglio.u5w3d3.chainOfResposability;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        TenenteFilter tenenteFilter = new TenenteFilter();
        CapitanoFilter capitanoFilter = new CapitanoFilter();
        MaggioreFilter maggioreFilter = new MaggioreFilter();
        ColonnelloFilter colonnelloFilter = new ColonnelloFilter();
        GeneraleFilter generaleFilter = new GeneraleFilter();
        tenenteFilter.setSuccessor(capitanoFilter);
        capitanoFilter.setSuccessor(maggioreFilter);
        maggioreFilter.setSuccessor(colonnelloFilter);
        colonnelloFilter.setSuccessor(generaleFilter);
        tenenteFilter.check(2000);
    }
}
