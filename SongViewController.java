package SongLibView;

import java.io.IOException;

import app.SongLib;
import javafx.fxml.FXML;

public class SongViewController {
	
	private SongLib songlib;
	
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
}
