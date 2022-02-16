package serverpack;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.*;
import java.util.Arrays;;

public class TcpServer {
    private int port;
    private static final String filesPackage = "D:\\GitTasks\\TcpHomeWork\\TcpServer\\src\\serverpack\\filePackage";

    public TcpServer(int port) {
        this.port = port;
    }


    public void start() {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Waiting");
            Socket socket = serverSocket.accept();
            System.out.println("Got");
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            String line;
            while (true) {
                line = dis.readUTF();
                if (line.equals("/fs")) {
                    dos.writeUTF(getAllFiles());
                } else {
                    dos.writeUTF(moveFile(line));
                }
                dos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String moveFile(String src) {
        Path result = null;
        File newFile = new File(filesPackage, new File(src).getName());
        try {
            result = Files.move(Paths.get(src), Paths.get(newFile.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (result != null) {
            return  "Successfully";
        } else
            return "Failed";
    }

    private String getAllFiles() {
        File folder = new File(filesPackage);
        return Arrays.toString(folder.listFiles());
    }
}

