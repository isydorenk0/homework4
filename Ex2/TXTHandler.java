package Ex2;

public class TXTHandler extends AbstractHandler{
    @Override
    void open() {
        System.out.println("Opening TXT document...");
    }

    @Override
    void create() {
        System.out.println("Creating TXT document...");
    }

    @Override
    void change() {
        System.out.println("Changing TXT document...");
    }

    @Override
    void save() {
        System.out.println("Saving TXT document...");
    }
}
