package runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");
        RunnAbleDemo runnAbleDemo1 = new RunnAbleDemo("Thread1-HR-database");
        RunnAbleDemo runnAbleDemo2 = new RunnAbleDemo("Thread2-send-mail");
        System.out.println("Main stopped.");
    }
}
