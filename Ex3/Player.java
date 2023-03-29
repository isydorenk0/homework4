package Ex3;

import java.util.Scanner;

public class Player implements Playable,Recordable{
    private Scanner scanner;
    private char input;
    public Player(Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public void play() {
        System.out.println("playing, 's' for stop, 'p' for pause");
        do{
            input = scanner.nextLine().charAt(0);
            if (input == 'p') {
                this.pause();
                System.out.println("playing, 's' for stop, 'p' for pause");
            }
        } while (input !='s' );
        this.stop();
    }
    @Override
    public void pause() {
        System.out.println("Player is paused, 'c' for continue");
        do{
            input = scanner.nextLine().charAt(0);
        } while (input !='c');
    }
    @Override
    public void stop() {
        System.out.println("Player is stopped");
    }
    @Override
    public void record() {
        System.out.println("recording, 's' for stop, 'p' for pause");
        do{
            input = scanner.nextLine().charAt(0);
            if (input == 'p') {
                this.pause();
                System.out.println("recording, 's' for stop, 'p' for pause");
            }
        } while (input !='s' );
        this.stop();
    }
}
