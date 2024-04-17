package matticonsiglio.u5w3d3.composite;

import java.util.ArrayList;
import java.util.List;

public class Section implements Object {
    private List<Object> objects = new ArrayList<Object>();
    private String title;


    public Section(String title) {
        this.title = title;
    }

    public void addPage(Object page) {
        objects.add(page);
    }

    public void removePage(Object page) {
        objects.remove(page);
    }

    @Override
    public int getPageCount() {
        int count = 0;
        for (Object page : objects) {
            count += page.getPageCount();
        }
        return count;
    }

    @Override
    public void print() {
        System.out.println(title);
        System.out.println();
        for (Object page : objects) {
            page.print();
        }
    }
}
