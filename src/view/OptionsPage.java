package view;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class OptionsPage {

	private Scene scene;
	private BorderPane container;
	private GridPane gp;
	private Button btnSound, btnGameplay, btnBack;
	private BackgroundFill bf;
	private Label lblOption;
	
	public void initialize() {
		
		container = new BorderPane();
//		scene = new Scene(container,100);
		
		gp = new GridPane();
		
		btnSound = new Button("Sound");
		btnGameplay = new Button("Gameplay");
		btnBack = new Button("Back");
		
		lblOption = new Label("Option");
		
		bf = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);
		container.setBackground(new Background(bf));
	}
	
	public void setPosition() {
		
	}
	
	public OptionsPage() {
		initialize();
		setPosition();
	}
	
	public Scene getScene() {
		return this.scene;
	}

}
