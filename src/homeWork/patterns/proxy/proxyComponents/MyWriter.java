package homeWork.patterns.proxy.proxyComponents;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MyWriter {

    public void write(File file, String text) {
        try {
            FileUtils.write(file, text + "\n", StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
