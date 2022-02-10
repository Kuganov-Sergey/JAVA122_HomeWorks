package homeWork.patterns.memento.context;

public class Memento {
    private String user;

    public void setUser(String user) {
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "user='" + user + '\'' +
                '}';
    }
}
