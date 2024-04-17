package matticonsiglio.u5w3d3.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        // create a composite object
        Section book = new Section("Book");
        Section chapter1 = new Section("Chapter 1");
        Section chapter2 = new Section("Chapter 2");
        Section chapter3 = new Section("Chapter 3");
        chapter1.addPage(new Page("Chapter 1.1"));
        chapter1.addPage(new Page("Chapter 1.2"));
        chapter2.addPage(new Page("Chapter 2.1"));
        chapter2.addPage(new Page("Chapter 2.2"));
        chapter3.addPage(new Page("Chapter 3.1"));
        chapter3.addPage(new Page("Chapter 3.2"));
        book.addPage(chapter1);
        book.addPage(chapter2);
        book.addPage(chapter3);

        System.out.println("Total pages: " + book.getPageCount());

        book.print();
    }
}
