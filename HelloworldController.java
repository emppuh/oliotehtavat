/*viikko 7, tehtävät 1-4*/
package application;

import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class HelloworldController {
	@FXML
	private Button button;
	@FXML
	private Label label;
	@FXML
	private Button button2;
	@FXML
	private Label label2;
	
	@FXML
	private TextField text;

	@FXML
	public void handleButtonAction(ActionEvent event) {
		System.out.println("Hello world!");
		label.setText("Hello world!");
	}
	
	@FXML
	public void writeText(ActionEvent event) {
		System.out.println("toinen nappula");
		label2.setText(text.getText());
	}
	
}
