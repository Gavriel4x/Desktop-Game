package view;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Music {

	private MediaPlayer music, confirm, cancel, select, pause;
	public double sfx, bgm;

	private static Music musicSingleton;

	public static Music getInstance() {
		return (musicSingleton != null) ? musicSingleton : new Music();
	}

	public void set() {
		sfx = 0.25;
		bgm = 0.1;

		music.setVolume(bgm);
		confirm.setVolume(sfx);
		cancel.setVolume(sfx);
		select.setVolume(sfx);
		pause.setVolume(sfx);
	}

	public void initialize() {

		File fp;

		fp = new File("./resources/music/menu/menu_bgm.mp3");
		music = new MediaPlayer(new Media(fp.toURI().toString()));
		music.setAutoPlay(false);

		fp = new File("./resources/sfx/menu/menu_cancel.wav");
		cancel = new MediaPlayer(new Media(fp.toURI().toString()));
		cancel.setAutoPlay(false);

		fp = new File("./resources/sfx/menu/menu_select.wav");
		select = new MediaPlayer(new Media(fp.toURI().toString()));
		select.setAutoPlay(false);

		fp = new File("./resources/sfx/menu/menu_pause.wav");
		pause = new MediaPlayer(new Media(fp.toURI().toString()));
		pause.setAutoPlay(false);

		fp = new File("./resources/sfx/menu/menu_confirm.wav");
		confirm = new MediaPlayer(new Media(fp.toURI().toString()));
		confirm.setAutoPlay(false);

	}

	public Music() {
		initialize();
		set();
	}

	public void setBgm(double vol) {
		this.bgm = vol;
		music.setVolume(bgm);

		confirm.setVolume(sfx);
		cancel.setVolume(sfx);
		select.setVolume(sfx);
		pause.setVolume(sfx);
	}

	public void setSfx(double vol) {
		this.sfx = vol;
		music.setVolume(bgm);

		confirm.setVolume(sfx);
		cancel.setVolume(sfx);
		select.setVolume(sfx);
		pause.setVolume(sfx);
	}

	public void playCancelMusic() {
		cancel.play();
	}

	public void stopCancelMusic() {
		cancel.stop();
	}

	public void playConfirmMusic() {
		confirm.play();
	}

	public void stopConfirmMusic() {
		confirm.stop();
	}

	public void playPauseMusic() {
		pause.play();
	}

	public void stopPauseMusic() {
		pause.stop();
	}

	public void playSelectMusic() {
		select.play();
	}

	public void stopSelectMusic() {
		select.stop();
	}

	public void playMenuMusic() {
		music.setAutoPlay(true);
		music.play();
	}
}
