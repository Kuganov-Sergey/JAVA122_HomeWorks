package clientpack;

public class Main {
    public static void main(String[] args) {
        TcpClient tcpClient = new TcpClient("127.0.0.1", 3030);
        tcpClient.startClient();
    }
}
