package view;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;

public class Config {
	
	private void setFullscreenMode(Stage stage) {
		stage.setFullScreen(true);
		stage.setResizable(false);
		stage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
		stage.setMaximized(true);
	}

	public Config(Stage arg, Scene sc) {
		// TODO Auto-generated constructor stub
		
		arg.setScene(sc);
		arg.setTitle("FungeonS");
		setFullscreenMode(arg);
		arg.getIcons().add(new Image("file:.\\resources\\titlescreen\\icon\\icon.png"));
		arg.show();
	}


}
