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
    void on_submit() {
        String choice1 = choice_box1.getValue();
        String choice2 = choice_box2.getValue();
        String choice3 = choice_box3.getValue();

        Integer score = 0;

        if (choice1.equals("Class")) {
            score++;
        }

        if (choice2.equals("String")) {
            score++;
        }

        if (choice3.equals("System")) {
            score++;
        }
        label_result.setText("Your score: " + score + "/3");
    }

    @FXML
    void initialize() {
        System.out.println("Controller initialized");
        choice_box1.setValue("Select");
        choice_box2.setValue("Choose");
        choice_box3.setValue("Choose");

        choice_box1.getItems().addAll("private", "Class", "String");
        choice_box2.getItems().addAll("hai", "String", "System");
        choice_box3.getItems().addAll("private", "love", "System");
    }

}
