import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Создание пути
        Path tst = Paths.get("tst");
        Path tmp = Paths.get("tst/tmp.txt");
        Path main = Paths.get("tst/main.txt");
        //Создание папки и фаилов
        try {
            Files.createFile(tmp);
            if (!Files.exists(tst)) {
                Files.createDirectory(tst);
                Files.createFile(main);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Print text here... ->");
        try (FileChannel channelTmp = FileChannel.open(tmp, StandardOpenOption.CREATE, StandardOpenOption.WRITE,
                StandardOpenOption.DELETE_ON_CLOSE);
             FileChannel channelMain = FileChannel.open(main, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            ByteBuffer buffer = ByteBuffer.allocate(512);
            while (!scanner.hasNext("/")) {
                buffer.put(scanner.nextLine().getBytes(StandardCharsets.UTF_8));
                buffer.flip();
                channelTmp.write(buffer);
                buffer.rewind();
                buffer.limit(buffer.capacity());
            }
            //Лист символов для читаемости, передает в foreach в buffer
            List<String> list = Files.readAllLines(tmp, StandardCharsets.UTF_8);
            buffer.put(LocalDateTime.now().toString().getBytes(StandardCharsets.UTF_8));
            buffer.put("\n".getBytes(StandardCharsets.UTF_8));
            for(String o : list) {
                buffer.put(o.getBytes(StandardCharsets.UTF_8));
            }
            buffer.put("\n\n".getBytes(StandardCharsets.UTF_8));
            buffer.flip();
            channelMain.write(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
