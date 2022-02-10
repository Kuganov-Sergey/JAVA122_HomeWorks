package homeWork.patterns.mediator;

import homeWork.patterns.mediator.components.LogText;
import homeWork.patterns.mediator.components.ThreadRead;
import homeWork.patterns.mediator.components.ThreadWrite;

public class Main {
    public static void main(String[] args) {
        LogText logText = new LogText();
        ThreadWrite threadWrite = new ThreadWrite(logText);
        ThreadRead threadRead1 = new ThreadRead(logText);
        ThreadRead threadRead2 = new ThreadRead(logText);
        Thread thread1 = new Thread(threadWrite);
        Thread thread2 = new Thread(threadRead1);
        Thread thread3 = new Thread(threadRead2);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

