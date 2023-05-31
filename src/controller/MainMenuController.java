package controller;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import view.Config;
import view.MainMenu;
import view.Music;
import view.OptionsPage;

public class MainMenuController extends Application {
	
	private static Music currMusic = Music.getInstance();
	private static Stage primaryStage;

	private static MainMenu mmMenu;
	private static OptionsPage opOptions;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		this.primaryStage = primaryStage;
		
		mmMenu = new MainMenu();
		opOptions = new OptionsPage();
		
		new Config(primaryStage, mmMenu.getScene());
		currMusic.playMenuMusic();
	}
	
	public static void onMouseEntered(Button btn) {
		currMusic.playSelectMusic();
		btn.setTextFill(Color.WHITE);
	}
	
	public static void onMouseExited(Button btn) {
		currMusic.stopSelectMusic();
		btn.setTextFill(Color.GRAY);
	}
	
	public static void onMouseConfirmed(Button btn) {
		currMusic.stopConfirmMusic();
		currMusic.playConfirmMusic();
		
		if(btn.getText().equals("OPTIONS")) {
			changeToOptionScene(btn);
		}
	}
	
	public static void changeToOptionScene(Button btn) {
		
		primaryStage.setScene(opOptions.getScene());
		primaryStage.setFullScreen(true);
		primaryStage.show();
	}
	
	public static void quit() {
		onMouseConfirmed(null);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.exit(0);
	}
	
}
