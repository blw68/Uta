package SongLib;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

import Control.Control;
import Song.Song;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class SongLib extends Application {

	
	@FXML         
	ListView<String> listView;   
	
	private ObservableList<String> obsList;   

	// 1. Declare Objects Needed
	@FXML
	private Button addButton;
	@FXML
	private Button editButton;
	@FXML
	private Button deleteButton;
	@FXML
	private Button cancelButton;
	@FXML
	private Button OKButton;
	
	Stage thestage;

	     
	// 2. Build Objects in Start
	public void start(Stage primaryStage) {
		thestage = primaryStage;
		
		// can now use the stage in other methods
		addButton = new Button("Add");
		editButton = new Button("Edit");
		deleteButton = new Button("Delete");
		cancelButton = new Button("Cancel");
		OKButton = new Button("OK");
		
		addButton.setOnAction(e->ButtonClicked(e));
		editButton.setOnAction(e->ButtonClicked(e));
		deleteButton.setOnAction(e->ButtonClicked(e));
		cancelButton.setOnAction(e->ButtonClicked(e));
		OKButton.setOnAction(e->ButtonClicked(e));
	}

	private void showItemInputDialog(Stage primaryStage) {
		String item = listView.getSelectionModel().getSelectedItem();
		int index = listView.getSelectionModel().getSelectedIndex();

		TextInputDialog dialog = new TextInputDialog(item);
		dialog.initOwner(primaryStage); dialog.setTitle("List Item");
		dialog.setHeaderText("Selected Item (Index: " + index + ")");
		dialog.setContentText("Enter name: ");

		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()) { 
			obsList.set(index, result.get()); 
		}

	}

	public static void main(String[] args) {		
		// just used to test add
//		Boolean b;
//		ArrayList<Song> songList = new ArrayList<Song>();
//		Control.addInAbcOrder(songList, new Song("Ode to Joy", "Beethoven", "Ninth Symphony", 1785));
//		Control.addInAbcOrder(songList, new Song("Ode 2 Joy", "Beethoven", "Ninth Symphony", 1785));
//		Control.addInAbcOrder(songList, new Song("Ode 3 Joy", "Beethoven", "Ninth Symphony", 1785));
//		Control.addInAbcOrder(songList, new Song("Ode 1 Joy", "Beethoven", "Ninth Symphony", 1785));
//		Control.addInAbcOrder(songList, new Song("Ode 1 Joy", "Beethoven", "Ninth Symphony", 1785));
//		Control.addInAbcOrder(songList, new Song("Ode to Joy", "Beethoven", "Ninth Symphony", 1785));
//		Control.printList(songList);
//
//		b = Control.output(songList);
//
//		File o = new File("output3.txt");
//		ArrayList<Song> a2 = new ArrayList<Song>();
//		b = Control.input(a2, o);
//
//		Control.printList(a2);

		launch(args);
	}

	//	public static void addSong (ArrayList<Song> songList) {
	//		Control.addInAbcOrder(songList, newSong);
	//	}

	// 8. Complete handleButtonAction method
	@FXML
	private void handleButtonAction(ActionEvent e) throws IOException {
		Stage stage = null;
		Parent root = null;
		if (e.getSource() == addButton) {
			stage = (Stage) addButton.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("PopupWindow.fxml"));
		} else if (e.getSource() == editButton) {
			stage = (Stage) editButton.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("PopupWindow.fxml"));
		} else if (e.getSource() == deleteButton){
			stage = (Stage) deleteButton.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("PopupWindow.fxml"));
		} else if (e.getSource() == OKButton){
			stage = (Stage) OKButton.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("SongLib.fxml"));
		} else if (e.getSource() == cancelButton){
			stage = (Stage) cancelButton.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("SongLib.fxml"));
		} else {
			// shouldn't happen
			System.out.println("got additional button");
			System.exit(1);
		}

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	// 5. Code for ButtonClicked
	public void ButtonClicked(ActionEvent e) {
		if (e.getSource() == addButton) {
			System.out.println("pressed add button");
		} else if (e.getSource() == editButton) {
			System.out.println("pressed edit button");
		} else if (e.getSource() == deleteButton) {
			System.out.println("presed delete button");
		} else if (e.getSource() == OKButton) {
			System.out.println("pressed ok button");
		} else if (e.getSource() == cancelButton) {
			System.out.println("cancel button");
		} else {
			// shouldn't happen
			System.out.println("got additional button in SongLib.ButtonClicked");
			System.exit(1);
		}
	}
}
