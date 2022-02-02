package homeWork.patterns.proxy.proxyComponents;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CheckLineCount {

    public int check(File file) {
        try {
            return FileUtils.readLines(file, StandardCharsets.UTF_8).size();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
