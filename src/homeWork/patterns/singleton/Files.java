package homeWork.patterns.singleton;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Files {
    private static Files files = new Files();

    private Files() {
    }

    public static void write(String filePath, String text) {
        File file = new File(filePath);
        try {
            FileUtils.write(file, text, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String read(String filePath) {
        File file = new File(filePath);
        String result = null;
        try {
            result = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
