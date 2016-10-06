package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddTopController implements Initializable{
	@FXML
	private Label aid,atp,anid,aun,aemail,astatus;
	@FXML
	private Button bttp,btas,btaq,bttpm,btrm;
	@FXML
	private TextField atf1,atf2,atf3,atf4,atf5;
	private Main application;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		aid.setText("MyTi ID:");
		atp.setText("TopUp Number:");
		anid.setText("New ID:");
		aun.setText("User name:");
		aemail.setText("E-mail:");
		astatus.setText("status");
		bttp.setText("Top up");
		btas.setText("Save");
		btaq.setText("Quit");
		bttpm.setText("Travel pass purchase");
		btrm.setText("Report manage");
		
	}
	
	@FXML
	public void gotoMain(ActionEvent e) {
		this.application.gotoMain();
	}
	
	@FXML
	public void gotoReport(ActionEvent e) {
		this.application.gotoReport();
	}
	
	@FXML
	public void end(ActionEvent e) {
		this.application.end();
	}
	
	public void setApp(Main main){  
        this.application = main;  
    } 

}
