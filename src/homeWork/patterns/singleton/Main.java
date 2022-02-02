package homeWork.patterns.singleton;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        Files.write("file.txt", "Hello world!");
//        System.out.println(Files.read("file.txt"));
        System.out.println(FileUtils.readLines(new File("test2.txt"), StandardCharsets.UTF_8).size());
    }
}
