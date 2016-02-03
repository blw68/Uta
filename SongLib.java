package SongLib;

import java.util.ArrayList;

import Control.Control;
import Song.Song;
import javafx.application.Application;
import javafx.stage.Stage;

public class SongLib extends Application {

	@Override
	public void start(Stage primaryStage) {
		
	}

	public static void main(String[] args) {
		//launch(args);
		
		// just used to test add
		System.out.println("add test");
		ArrayList<Song> songList = new ArrayList<Song>();
		Control.addInAbcOrder(songList, new Song("Ode to Joy", "Beethoven", "Ninth Symphony", 1785));
		Control.addInAbcOrder(songList, new Song("Ode 2 Joy", "Beethoven", "Ninth Symphony", 1785));
		Control.addInAbcOrder(songList, new Song("Ode 3 Joy", "Beethoven", "Ninth Symphony", 1785));
		Control.addInAbcOrder(songList, new Song("Ode 1 Joy", "Beethoven", "Ninth Symphony", 1785));
		Control.addInAbcOrder(songList, new Song("Ode 1 Joy", "Beethoven", "Ninth Symphony", 1785));
		Control.addInAbcOrder(songList, new Song("Ode to Joy", "Beethoven", "Ninth Symphony", 1785));
		Control.printList(songList);
	}
}
