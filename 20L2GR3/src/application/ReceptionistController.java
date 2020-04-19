package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;
public class ReceptionistController implements Initializable{

	 @FXML
	    private CheckBox change;
	 @FXML 
		private Pane pane;
	    @FXML
	    private TableView<Rooms> takenRooms;
	    @FXML
	    private TableView<Rooms> freeRooms;
		@FXML
		private TableColumn<Rooms,Integer> idRoom;
		
		@FXML
		private TableColumn<Rooms,Integer> numberOfSeats;
		
		@FXML
		private TableColumn <Rooms,Integer>roomNumber;
				
		@FXML
		private TableColumn<Rooms,String> lvl;
		
		
		@FXML
		private TableColumn<Rooms,Integer> idRoomf;
		
		@FXML
		private TableColumn<Rooms,Integer> numberOfSeatsF;
		
		@FXML
		private TableColumn <Rooms,Integer>roomNumberF;
				
		@FXML
		private TableColumn<Rooms,String> lvlF;
		
		@FXML
		private TableColumn<Rooms,Date> dates;
		
		String loggedUserName;
		
		public ObservableList <Rooms> list;
		public ObservableList <Rooms> list1;
		@FXML
	    void zmien(ActionEvent event) throws Exception {
	    	
		 boolean isSelected = change.isSelected();
		 if(isSelected == true)
		 {	 
			 
			 takenRooms.setVisible(true);
			 freeRooms.setVisible(false);
			 change.setText("Wolne Pokoje");
		 }
		 if(isSelected == false)
		 {
			 
			
			 takenRooms.setVisible(false);
			 freeRooms.setVisible(true);
			 change.setText("Zaj�te Pokoje");
		 }
	    	
	    }
	 @FXML
	    void wyloguj(ActionEvent event) throws Exception {	
		 Parent application = FXMLLoader.load(getClass().getResource("Uzytkownik.fxml"));
	     Scene applicationScene = new Scene(application);
	     Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	     applicationScene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	     window.setScene(applicationScene);
	     window.show();
	    	
	    }
	 
	 
	 
	 
	 
	 public void initialize(URL url, ResourceBundle rbl) {
		 list=FXCollections.observableArrayList();
		 list1=FXCollections.observableArrayList();

		 Preferences userPreferences = Preferences.userRoot();
		 loggedUserName = userPreferences.get("logged","");
		
		 
		 Date data= new Date();
		 data.getTime();	
	     Rooms test = new Rooms(1,2,312,"High");
	     Rooms test1 = new Rooms(2,2,314,"Medium");
	     list.add(test);
	     list1.add(test1);
	    	
	    	idRoom.setCellValueFactory(new PropertyValueFactory<Rooms, Integer>("id"));
	    	numberOfSeats.setCellValueFactory(new PropertyValueFactory<Rooms, Integer>("number_of_seats"));
	    	roomNumber.setCellValueFactory(new PropertyValueFactory<Rooms, Integer>("room_number"));
	    	lvl.setCellValueFactory(new PropertyValueFactory<Rooms, String>("lvl"));
	    	dates.setCellValueFactory(new PropertyValueFactory<Rooms, Date>("data"));
	    	
	    	
	    	idRoomf.setCellValueFactory(new PropertyValueFactory<Rooms, Integer>("id"));
	    	numberOfSeatsF.setCellValueFactory(new PropertyValueFactory<Rooms, Integer>("number_of_seats"));
	    	roomNumberF.setCellValueFactory(new PropertyValueFactory<Rooms, Integer>("room_number"));
	    	lvlF.setCellValueFactory(new PropertyValueFactory<Rooms, String>("lvl"));
	    	
	    	
	    	takenRooms.setItems(list);	
	    	freeRooms.setItems(list1);
	    	takenRooms.setVisible(false);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
		}
	
}