package lesson_12;

public class Printer implements Runnable{

    @Override
    public void run() {
        System.out.println("i'm printing...");
    }
}
