package homeWork.patterns.proxy.proxyComponents;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class ProxyClass implements WriterToFiles {
    private MyWriter myWriter = new MyWriter();
    private CheckLineCount checkLineCount = new CheckLineCount();
    private ProxyLog proxyLog = new ProxyLog();

    private static final String TEXT = "text";
    private int fileId = 1;

    @Override
    public void write() {
        Date date = new Date();
        File file = new File(TEXT + fileId + ".txt");
        if (file.exists() && checkLineCount.check(file) >= 3) {
            fileId++;
            file = new File(TEXT + fileId + ".txt");
            proxyLog.addInfo("File name: " + TEXT + fileId + ".txt\n Address: " +
                    file.getAbsolutePath() + "\n Create date: " +
                    date + "\n\n");
            return;
        }
        myWriter.write(file, date + ": " + consoleText());
    }

    private String consoleText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        return scanner.nextLine();
    }

    @Override
    public String getInfo() {
        return proxyLog.getInfo();
    }
}
