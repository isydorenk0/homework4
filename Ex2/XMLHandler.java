package Ex2;

public class XMLHandler extends AbstractHandler {
    @Override
    void open() {
        System.out.println("Opening XML document...");
    }

    @Override
    void create() {
        System.out.println("Creating XML document...");
    }

    @Override
    void change() {
        System.out.println("Changing XML document...");
    }

    @Override
    void save() {
        System.out.println("Saving XML document...");
    }
}
