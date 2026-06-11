import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button_submit;

    @FXML
    private ChoiceBox<String> choice_box1;

    @FXML
    private ChoiceBox<String> choice_box2;

    @FXML
    private ChoiceBox<String> choice_box3;

    @FXML
    private Label label_result;

    @FXML
    private Label label_timmer;

    @FXML
    private Label title_project;

    @FXML
    void initialize() {
        System.out.println("Controller initialized");
        choice_box1.setValue("Choose");
        choice_box2.setValue("Choose");
        choice_box3.setValue("Choose");

        choice_box1.getIte


     
    }

}
