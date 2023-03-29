package Ex2;

public class DOCHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Opening DOC document...");
    }

    @Override
    void create() {
        System.out.println("Creating DOC document...");
    }

    @Override
    void change() {
        System.out.println("Changing DOC document...");
    }

    @Override
    void save() {
        System.out.println("Saving DOC document...");
    }
}
