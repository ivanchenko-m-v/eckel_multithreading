package ru.imv;

/**
 * TaskView
 * Exercise 1: (2) Implement a Runnable. Inside run( ), print a message, and then call yield( ).
 * Repeat this three times, and then return from run( ).
 * Put a startup message in the constructor and a shutdown message when the task terminates.
 * Create a number of these tasks and drive them using threads.
 */
public class TaskView implements Runnable {
    private static int taskViewCounter = 0;
    private final int taskId = ++taskViewCounter;

    public TaskView() {
        System.out.println(getStartMessage());
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; ++i) {
            System.out.print(getMessage(i + 1));
            Thread.yield();
        }
    }

    private String getStartMessage() {
        StringBuffer buffer = new StringBuffer("The task #");
        buffer.append(taskId)
                .append(" have been started in thread ")
                .append(Thread.currentThread().getName());

        return buffer.toString();
    }

    private String getMessage(int num) {
        StringBuffer buffer = new StringBuffer("#");
        buffer.append(taskId)
                .append("(")
                .append(num)
                .append(")");

        return buffer.toString();
    }

    public int getTaskId() {
        return taskId;
    }
}
