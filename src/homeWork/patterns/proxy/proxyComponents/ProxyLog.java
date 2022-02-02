package homeWork.patterns.proxy.proxyComponents;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ProxyLog {

    File file = new File("info.txt");

    public void addInfo(String info) {
        try {
            FileUtils.write(file, info, StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getInfo() {
        try {
            return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
