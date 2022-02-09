package homeWork.patterns.template_method.templates;

import homeWork.patterns.template_method.myExcepion.IncorrectInput;

import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConcreteTemplateMethod extends TemplateMethod {
    private Scanner scanner;
    private StringBuilder stringBuilder;
    private File file;
    private final String FILENAME = "templateMethodText.txt";
    private boolean isAppend;

    public ConcreteTemplateMethod() {
        scanner = new Scanner(System.in);
        stringBuilder = new StringBuilder();
        file = new File(FILENAME);
    }

    @Override
    protected void addName() {
        System.out.println("Введите своё полное имя");
        stringBuilder.append("Name: ")
                .append(scanner.nextLine())
                .append("\n");
    }

    @Override
    protected void selectMode() {
        System.out.println("1 - перезаписывать\n" +
                "2 - дописывать");
        int choice = scanner.nextInt();
        if (choice == 2) {
            isAppend = !isAppend;
        } else if (choice == 1) {
        } else {
            try {
                throw new IncorrectInput("Введите 1 или 2");
            } catch (IncorrectInput incorrectInput) {
                incorrectInput.printStackTrace();
            }
            System.exit(-1);
        }
    }

    @Override
    protected void addDate() {
        Date date = new Date();
        scanner = new Scanner(System.in);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Введите дату в формате dd/MM/yyyy");
        String newDate = scanner.nextLine();
        try {
            date = simpleDateFormat.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        stringBuilder.append("Date: ")
                .append(date)
                .append("\n");
    }

    @Override
    protected void addText() {
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        stringBuilder.append("-------------------\n")
                .append("Text: ")
                .append(text)
                .append("\n+++++++++++++++++++\n");
    }

    @Override
    protected void save() {
        if (isAppend) {
            try(FileWriter fw = new FileWriter(FILENAME, true)) {
                fw.write(stringBuilder.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try(FileWriter fw = new FileWriter(FILENAME)) {
                fw.write(stringBuilder.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
