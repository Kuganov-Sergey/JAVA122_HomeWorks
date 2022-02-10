package homeWork.patterns.mediator.components;

public class ThreadWrite implements Runnable {
    private LogText logText;
    private int counter = 0;

    public ThreadWrite(LogText logText) {
        this.logText = logText;
    }

    @Override
    public void run() {
        while(counter != 10) {
            logText.setLog(Thread.currentThread().getName() + "-" + (int)(Math.random() * 100) + 1);
            counter++;
        }
        logText.stopThreads();
        logText.setDone();
        System.out.println("Thread1 finish");
    }
}
