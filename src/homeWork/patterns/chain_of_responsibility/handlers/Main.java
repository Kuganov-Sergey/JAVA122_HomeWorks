package homeWork.patterns.chain_of_responsibility.handlers;

import homeWork.patterns.chain_of_responsibility.TextTest;
import homeWork.patterns.chain_of_responsibility.exception.TextValidException;

public class Main {
    public static void main(String[] args) {
        TextTest textTest = new TextTest();
        try {
            System.out.println(textTest.invoke("Hello from java"));
        } catch (TextValidException e) {
            e.printStackTrace();
        }
    }
}
