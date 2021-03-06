package SongLibView;


import java.io.IOException;


import app.SongLib;
import javafx.event.ActionEvent;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SongViewController {

	private SongLib songlib;
	@FXML
	public Button cancelButton, okButton;

	@FXML 
	public ListView<String> listView;

	private ObservableList<String> obsList;

	@FXML
	private void homeScene() throws IOException {
		songlib.showMainView();
	}

	@FXML
	private void addButton() throws IOException {
		SongLib.showAddScene();
	}

	@FXML
	private void editButton() throws IOException {
		SongLib.showEditScene();
	}

	@FXML
	private void deleteButton() throws IOException {
		SongLib.showDeleteScene();
	}
	@FXML
	private void cancelButtonEvent(ActionEvent event) {
		Stage stage = (Stage) cancelButton.getScene().getWindow();
		stage.close();
	}

	@FXML
	private void okButtonEvent(ActionEvent event) {
		try {
			System.out.println("ok button pressed");
			System.out.println("title is " + title.getText());
			System.out.println("artist is " + artist.getText());
			System.out.println("album is " + album.getText());
			System.out.println("year is " + year.getText());
			
			Song s = new Song(title.getText(), artist.getText(), album.getText(), Integer.parseInt(year.getText()));
						
			obsList = FXCollections.observableArrayList("");
			
			listView.getSelectionModel().select(0);
			
			listView.setItems(obsList);
		} catch (Exception e) {
			System.out.println("exception in ok button event");
			e.printStackTrace(System.out);
		}

		// close pop up window just like cancel does
		Stage stage = (Stage) okButton.getScene().getWindow();
		stage.close();
	}

//	@FXML
//	private void TitleAction(ActionEvent event) {
//		//		TextField source = (TextField)event.getSource();
//		//		System.out.println("You entered " + source.getText());
//
//
//	}

	@FXML
	private TextField title;
	@FXML
	private TextField artist;
	@FXML
	private TextField album;
	@FXML
	private TextField year;
}
