package clientpack;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpClient {
    private String address;
    private int serverPort;
    private InetAddress inetAddress;

    public TcpClient(String address, int serverPort) {
        this.address = address;
        this.serverPort = serverPort;
    }

    public void startClient() {
        try {
            inetAddress = InetAddress.getByName(address);
            Socket socket = new Socket(inetAddress, serverPort);
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            Scanner scanner = new Scanner(System.in);
            String line;
            while (true) {
                System.out.println("write file absolute path or command /fs");
                line = scanner.nextLine();
                dos.writeUTF(line);
                dos.flush();
                line = dis.readUTF();
                System.out.println(line);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

