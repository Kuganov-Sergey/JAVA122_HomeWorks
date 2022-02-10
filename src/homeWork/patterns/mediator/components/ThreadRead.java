package homeWork.patterns.mediator.components;

public class ThreadRead implements Runnable {
    private LogText logText;

    public ThreadRead(LogText logText) {
        this.logText = logText;
    }

    @Override
    public void run() {
        while (!logText.isStop()) {
            System.out.println(Thread.currentThread().getName() + " -> " + logText.getLog());
        }
        System.out.println("FINISH");
        logText.setDone();
    }
}
