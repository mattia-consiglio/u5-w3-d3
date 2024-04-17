package matticonsiglio.u5w3d3.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Page implements Object {
    private String content;

    @Override
    public int getPageCount() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println(content);
    }
}
