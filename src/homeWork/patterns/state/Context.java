package homeWork.patterns.state;

import homeWork.patterns.state.states.JSONFile;
import homeWork.patterns.state.states.TextFile;

import java.util.Scanner;

public class Context {
    private CreateFile createFile;

    private void setCreateFile(CreateFile createFile) {
        this.createFile = createFile;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название фаила");
        String fileName = scanner.nextLine();
        System.out.println("""
                Какой фаил хотите создать?
                1 - JsonFile
                2 - TextFile""");
        int fileType = scanner.nextInt();
        switch (fileType) {
            case 1 -> setCreateFile(new JSONFile());
            case 2 -> setCreateFile(new TextFile());
            default -> {
                System.out.println("Выберите правильный вариант!");
                return;
            }
        }
        createFile.saveFile(fileName.trim().toLowerCase());
    }

}
