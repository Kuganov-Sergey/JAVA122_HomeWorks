package homeWork.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Files.write("file.txt", "Hello world!");
        System.out.println(Files.read("file.txt"));
    }
}
