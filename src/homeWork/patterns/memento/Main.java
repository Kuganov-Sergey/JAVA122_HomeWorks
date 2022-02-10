package homeWork.patterns.memento;

import homeWork.patterns.memento.context.Memento;
import homeWork.patterns.memento.context.ProgramSettings;
import homeWork.patterns.memento.context.SaveFiles;

public class Main {
    public static void main(String[] args) {
        SaveFiles saveFiles = new SaveFiles();
        ProgramSettings programSettings1 = new ProgramSettings("Serj", true);
        ProgramSettings programSettings2 = new ProgramSettings("Kuganov", true);
        Memento memento = new Memento();
        memento.setUser(programSettings1.getUser());
        saveFiles.setMemento(memento);
        memento.setUser(programSettings2.getUser());
        saveFiles.setMemento(memento);
        saveFiles.add();
    }
}
