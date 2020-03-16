package ru.imv;

/**
 * Hello world!
 */
public class Task01App {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new TaskView()).start();
        }
        System.out.println("Waiting....");
    }
}
