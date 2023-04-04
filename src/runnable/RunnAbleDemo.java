package runnable;

public class RunnAbleDemo implements Runnable{
    private Thread thread;
    private String threadName;

    RunnAbleDemo(String name){
        threadName = name;
        System.out.println("Creating" + name);
    }
    @Override
    public void run() {
        System.out.println("running" + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("thread" + threadName + "," + i);
                Thread.sleep(50);
            }
        }catch (InterruptedException i){
            System.err.println("thread" + threadName + "interrupted");
        }
    }
    public void start(){
        System.out.println("thread" + threadName);
        if (thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
