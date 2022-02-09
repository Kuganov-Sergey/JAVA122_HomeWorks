package homeWork.patterns.state.states;

import homeWork.patterns.state.CreateFile;

import java.io.File;
import java.io.IOException;

public class TextFile implements CreateFile {
    @Override
    public void saveFile(String fileName) {
        File file = new File(fileName + ".txt");
        try {
            if (!file.createNewFile()) {
                System.out.println("Already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
