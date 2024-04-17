package matticonsiglio.u5w3d3.adpter;

import java.util.Date;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        super();
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getCognome() + " " + info.getNome();
    }

    @Override
    public int getEta() {
        return (int) ((new Date().getTime() - info.getDataNascita().getTime()) / 1000 / 60 / 60 / 24 / 365);
    }
}
