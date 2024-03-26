package lesson_12;

public class MyCustomThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from MyCustomThread");
    }
}
