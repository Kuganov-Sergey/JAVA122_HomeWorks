package pack.udp;

import javafx.scene.control.TextArea;

public class Server extends Thread {
    private TextArea serverMsg;
    private volatile boolean isInterrupted = false;

    public Server(TextArea serverMsg) {
        this.serverMsg = serverMsg;
    }

    @Override
    public void run() {
        while (!isInterrupted) {
            serverMsg.appendText("Wait for client text ...\n");
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setInterrupted() {
        isInterrupted = true;
    }
}
