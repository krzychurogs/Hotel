package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CookCleanerController {
	@FXML
	private Button confirmButton;
	
	@FXML
	private TableView<Task> taskTableView;
	
	@FXML
	private TableColumn<Task,Integer> idColumn;
	
	@FXML
	private TableColumn<Task,Integer> userColumn;
	
	@FXML
	private TableColumn <Task,Integer>roomColumn;
	
	@FXML
	private TableColumn<Task,Integer> serviceColumn;
	
	@FXML
	private TableColumn<Task,String> descriptionColumn;
	
	public ObservableList <Task> list;
	
	
	
	
	public CookCleanerController() 
    {
    }
     
    @FXML
    private void initialize() 
    {
    	list=FXCollections.observableArrayList();
    	Task test = new Task(1,1,1,1,"Pizza");
    	Task dwa = new Task(2,2,2,2,"Hamburger");
    	list.add(test);
    	list.add(dwa);
    	idColumn.setCellValueFactory(new PropertyValueFactory<Task, Integer>("id"));
    	userColumn.setCellValueFactory(new PropertyValueFactory<Task, Integer>("user"));
    	roomColumn.setCellValueFactory(new PropertyValueFactory<Task, Integer>("room"));
    	serviceColumn.setCellValueFactory(new PropertyValueFactory<Task, Integer>("service"));
    	descriptionColumn.setCellValueFactory(new PropertyValueFactory<Task, String>("description"));
        
    	taskTableView.setItems(list);
    	
    	
    	
    }
     
    @FXML
    private void printOutput() 
    {
        
    }
	
}
