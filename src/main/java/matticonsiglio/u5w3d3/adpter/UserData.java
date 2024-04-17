package matticonsiglio.u5w3d3.adpter;

//@NoArgsConstructor
//@Getter
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
