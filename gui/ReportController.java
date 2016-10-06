package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ReportController implements Initializable {
	@FXML
	private Label lb1;
	@FXML
	private ListView lv;
	@FXML
	private Button bt1,bt2,bt3;
	
	private Main application;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void setApp(Main main){  
        this.application = main;  
    } 
	
	@FXML
	public void gotoMain(ActionEvent e) {
		this.application.gotoMain();
	}
	@FXML
	public void end(ActionEvent e) {
		this.application.end();
	}
	
	@FXML
	public void gotoAdd(ActionEvent e) {
		this.application.gotoAdd();
	}
}
