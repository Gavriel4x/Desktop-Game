package view;

import controller.MainMenuController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainMenu {
	
	private Scene scene;
	private BorderPane container;
	private GridPane gp;
	private BackgroundImage bgImg;
	private ImageView logo;
	private Font font;
	private ImageCursor cursor;
	private Button btnPlay, btnScore, btnOption, btnExit;
	
	private void initialize() {
		
		gp = new GridPane();
		container = new BorderPane();
		scene = new Scene(container, 1200, 800);
		
		bgImg = new BackgroundImage(new Image("file:resources/titlescreen/backdrop/title_backdrop.png"), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, new BackgroundSize(1.0, 1.0, true, true, false, false));
		container.setBackground(new Background(bgImg));
		
		logo = new ImageView(new Image("file:resources/titlescreen/title/title_logo.png"));
		logo.setFitHeight(300);
		logo.setFitWidth(800);
		
		btnPlay = new Button("PLAY");
		btnScore = new Button("HIGHSCORE");
		btnOption = new Button("OPTIONS");
		btnExit = new Button("EXIT");
		
		font = Font.loadFont("file:resources/font/minecraftia/Minecraftia-Regular.ttf", 40);


		btnPlay.setTextFill(Color.GRAY);
		btnScore.setTextFill(Color.GRAY);
		btnOption.setTextFill(Color.GRAY);
		btnExit.setTextFill(Color.GRAY);
		
		btnPlay.setFont(font);
		btnScore.setFont(font);
		btnOption.setFont(font);
		btnExit.setFont(font);
		
		btnPlay.setBackground(Background.EMPTY);
		btnScore.setBackground(Background.EMPTY);
		btnOption.setBackground(Background.EMPTY);
		btnExit.setBackground(Background.EMPTY);
		
		cursor = new ImageCursor(new Image("file:resources/app/cursor/cursor.png"));
		container.setCursor(cursor);
	}
	
	private void setPosition() {
		
		container.setCenter(logo);
		BorderPane.setAlignment(logo, Pos.CENTER);
		BorderPane.setMargin(logo, new Insets(100,0,0,0));
		
		gp.add(btnPlay, 0, 0);
		gp.add(btnScore, 0, 1);
		gp.add(btnOption, 0, 2);
		gp.add(btnExit, 0, 3);
		
		GridPane.setMargin(btnPlay, new Insets(0,0,0,50));
		GridPane.setMargin(btnScore, new Insets(0,0,0,50));
		GridPane.setMargin(btnOption, new Insets(0,0,0,50));
		GridPane.setMargin(btnExit, new Insets(0,0,50,50));
		
		gp.setVgap(8);
		gp.setAlignment(Pos.BOTTOM_LEFT);
		
		btnPlay.setPadding(new Insets(0,0,-50,0));
		btnScore.setPadding(new Insets(0,0,-50,0));
		btnOption.setPadding(new Insets(0,0,-50,0));
		btnExit.setPadding(new Insets(0,0,-50,0));
		
		container.setBottom(gp);
		
	}
	
	private void setEvent() {
		
		//hover
		btnPlay.setOnMouseEntered((e) -> MainMenuController.onMouseEntered(btnPlay));
		btnScore.setOnMouseEntered((e) -> MainMenuController.onMouseEntered(btnScore));
		btnOption.setOnMouseEntered((e) -> MainMenuController.onMouseEntered(btnOption));
		btnExit.setOnMouseEntered((e) -> MainMenuController.onMouseEntered(btnExit));
		
		//unhover
		btnPlay.setOnMouseExited((e) -> MainMenuController.onMouseExited(btnPlay));
		btnScore.setOnMouseExited((e) -> MainMenuController.onMouseExited(btnScore));
		btnOption.setOnMouseExited((e) -> MainMenuController.onMouseExited(btnOption));
		btnExit.setOnMouseExited((e) -> MainMenuController.onMouseExited(btnExit));
		
		//click
		btnPlay.setOnMouseClicked((e) -> MainMenuController.onMouseConfirmed(btnPlay));
		btnScore.setOnMouseClicked((e) -> MainMenuController.onMouseConfirmed(btnScore));
		btnOption.setOnMouseClicked((e) -> MainMenuController.onMouseConfirmed(btnOption));
		btnExit.setOnMouseClicked((e) -> MainMenuController.quit());
	}
	
	public MainMenu() {
		initialize();
		setPosition();
		setEvent();
	}

	public Scene getScene() {
		return scene;
	}

}
