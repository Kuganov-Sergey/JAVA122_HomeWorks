package serverpack;

public class Main {
    public static void main(String[] args) {
        TcpServer tcpServer = new TcpServer(3030);
        tcpServer.start();
    }
}
