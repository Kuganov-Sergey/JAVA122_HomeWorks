package homeWork.patterns.memento.context;

public class ProgramSettings {
    private String user;
    private boolean isGUI;

    public ProgramSettings(String user, boolean isGUI) {
        this.user = user;
        this.isGUI = isGUI;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setGUI(boolean GUI) {
        isGUI = GUI;
    }

    public ProgramSettings save() {
        return new ProgramSettings(user, isGUI);
    }

    @Override
    public String toString() {
        return "ProgramSettings{" +
                "user='" + user + '\'' +
                ", isGUI=" + isGUI +
                '}';
    }
}
