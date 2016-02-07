package SongLibView;

import java.awt.TextField;
import java.io.IOException;


import app.SongLib;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SongViewController {
	
	private SongLib songlib;
	@FXML
	public Button cancelButton;
	
	@FXML
	private void homeScene() throws IOException{
		songlib.showMainView();
	}
	
	@FXML
	private void addButton() throws IOException{
		SongLib.showAddScene();
	}
	
	@FXML
	private void editButton() throws IOException{
		SongLib.showEditScene();
	}
	
	@FXML
	private void deleteButton() throws IOException{
		SongLib.showDeleteScene();
	}
	@FXML
	private void cancelButtonEvent(ActionEvent event) {
		Stage stage = (Stage) cancelButton.getScene().getWindow();
	    stage.close();
	}
	
	@FXML
	private TextField title;
	@FXML
	private TextField artist;
	@FXML
	private TextField album;
	@FXML
	private TextField year;
}
