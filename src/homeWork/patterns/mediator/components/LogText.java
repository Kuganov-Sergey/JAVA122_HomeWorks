package homeWork.patterns.mediator.components;

import homeWork.patterns.mediator.Mediator;

public class LogText implements Mediator {
    private String log;
    private boolean isDone = true;
    private boolean stop = false;

    @Override
    public void stopThreads() {
        stop = true;
    }

    public boolean isStop() {
        return stop;
    }

    public void setDone() {
        isDone = true;
    }

    public synchronized String getLog() {
        while(!isDone) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isDone = false;
        notify();
        return log;
    }

    public synchronized void setLog(String text) {
        this.log = text;
        try {
            wait(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        isDone = true;
        notify();
    }
}
