package lesson_16;

import java.io.*;

public class Main {
    public static void main(String[] args) {

    }

    private static void readPersonFromFile() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("people.txt"));
            Person p = (Person) objectInputStream.readObject();

            System.out.println(p);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void savePersonToFile(Person p) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("people.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(p);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
