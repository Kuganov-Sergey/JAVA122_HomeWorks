package homeWork.patterns.memento.context;

import homeWork.patterns.state.states.JSONFile;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaveFiles {
    private int counter;
    private File file = new File("file.json");
    private List<Memento> mementoArrays = new ArrayList<>();

    public void add() {
        JSONObject jsonObject = new JSONObject();
        try {
            for(Memento arr : mementoArrays) {
                jsonObject.put(String.valueOf(mementoArrays.indexOf(arr)), arr);
            }
            String json = jsonObject.toString();
            FileUtils.write(file, json, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setMemento(Memento memento) {
        mementoArrays.add(memento);
    }
}
