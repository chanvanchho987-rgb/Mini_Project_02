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
    private ChoiceBox<?> choice_box1;

    @FXML
    private ChoiceBox<?> choice_box2;

    @FXML
    private ChoiceBox<?> choice_box3;

    @FXML
    private Label label_result;

    @FXML
    private Label label_timmer;

    @FXML
    private Label title_project;

    @FXML
    void initialize() {
        assert button_submit != null : "fx:id=\"button_submit\" was not injected: check your FXML file 'View.fxml'.";
        assert choice_box1 != null : "fx:id=\"choice_box1\" was not injected: check your FXML file 'View.fxml'.";
        assert choice_box2 != null : "fx:id=\"choice_box2\" was not injected: check your FXML file 'View.fxml'.";
        assert choice_box3 != null : "fx:id=\"choice_box3\" was not injected: check your FXML file 'View.fxml'.";
        assert label_result != null : "fx:id=\"label_result\" was not injected: check your FXML file 'View.fxml'.";
        assert label_timmer != null : "fx:id=\"label_timmer\" was not injected: check your FXML file 'View.fxml'.";
        assert title_project != null : "fx:id=\"title_project\" was not injected: check your FXML file 'View.fxml'.";

    }

}
