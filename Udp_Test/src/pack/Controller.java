package pack;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import pack.udp.Client;
import pack.udp.Server;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        server = new Server(serverMsg);
        client = new Client();
        server.setDaemon(true);
        server.start();
    }

    public void initHandlers() {
        server.setInterrupted();
    }

    private Server server;
    private Client client;

    @FXML
    private TextField sendAdr;
    @FXML
    private TextArea serverMsg;
    @FXML
    private TextArea clientMsg;


    @FXML
    public void sendHandler() {
        serverMsg.appendText(clientMsg.getText());
        serverMsg.appendText("\n");
        clearClient();
    }

    @FXML
    public void clearClient() {
        clientMsg.clear();
    }

    @FXML
    public void clearServer() {
        serverMsg.clear();
    }
}
