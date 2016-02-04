package SongLib;

import java.util.ArrayList;
import java.util.Optional;

import Control.Control;
import Song.Song;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class SongLib extends Application {

	@FXML         
	ListView<String> listView;                

	private ObservableList<String> obsList;              
	
	public void start(Stage primaryStage) {
		// create an ObservableList 
	      // from an ArrayList              
//	      obsList = FXCollections.observableArrayList();                         
//	                       
//	      listView.setItems(obsList); 
//	      
//	      // set listener for the items
//	      listView
//	      .getSelectionModel()
//	      .selectedItemProperty()
//	      .addListener(
//	    		  (obs, oldVal, newVal) -> 
//	    		  showItemInputDialog(primaryStage));

	}

	private void showItemInputDialog(Stage primaryStage) {
		String item = listView.getSelectionModel().getSelectedItem();
		   int index = listView.getSelectionModel().getSelectedIndex();

		   TextInputDialog dialog = new TextInputDialog(item);
		   dialog.initOwner(primaryStage); dialog.setTitle("List Item");
		   dialog.setHeaderText("Selected Item (Index: " + index + ")");
		   dialog.setContentText("Enter name: ");

		   Optional<String> result = dialog.showAndWait();
		   if (result.isPresent()) { obsList.set(index, result.get()); }

	}

	public static void main(String[] args) {		
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

		launch(args);
	}
}
