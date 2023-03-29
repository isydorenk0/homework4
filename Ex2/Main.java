package Ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractHandler> handlers = new ArrayList<>();

        handlers.add(new XMLHandler());
        handlers.add(new TXTHandler());
        handlers.add(new DOCHandler());
        for (AbstractHandler handler :
                handlers) {
            handler.create();
            handler.open();
            handler.change();
            handler.save();
            System.out.println("**************");
        }
    }
}
