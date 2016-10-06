package gui;

import myti.*;

import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainController implements Initializable {
	@FXML
	private Label zone,time,td,st,id,status,aid,atp,anid,aun,aemail,astatus;
	@FXML
	private ComboBox<String> cbox1,cbox2,cboxz,cboxt;
	@FXML
	private Button bts,btshow,btq,bta,btr,bttp,btas,btaq,bttpm,btrm;
	@FXML
	private TextField tf1,tf2,tf3,tf4,atf1,atf2,atf3,atf4,atf5;
	
	private Main application;
	
	ObservableList<String> list = FXCollections.observableArrayList("Central","Flagstaff","Richmond","Lilydale","Epping");
	ObservableList<String> zlist = FXCollections.observableArrayList("zone 1","zone 1+2");
	ObservableList<String> tlist = FXCollections.observableArrayList("2 Hours","All Day");

	public void purchasePass(ActionEvent e) {
		for (int i=0; i<cbox1.getItems().size(); i++){
			if (cbox1.getItems().get(i)!=null) {
				
			}
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		cbox1.setItems(list);
		cbox2.setItems(list);
		cboxz.setItems(zlist);
		cboxt.setItems(tlist);
	}
	
	public void getMsg(ActionEvent e){
		if(!tf1.getText().equals("mon")&&!tf1.getText().equals("tue")&&!tf1.getText().equals("wed")&&!tf1.getText().equals("thu")
				&&!tf1.getText().equals("fri")&&!tf1.getText().equals("sat")&&!tf1.getText().equals("sun") || (Integer.parseInt(tf2.getText()) >= 2400 || Integer.parseInt(tf2.getText())%100 > 59)) {
			status.setText("Invalid input");
		}
		else
			status.setText("Purchase sucess!");
	}

	public void setApp(Main main){  
        this.application = main;  
    } 
	
	@FXML
	public void gotoAdd(ActionEvent e){
		application.gotoAdd();
	}
	
	@FXML
	public void gotoReport(ActionEvent e) {
		this.application.gotoReport();
	}
	
	@FXML
	public void end(ActionEvent e) {
		this.application.end();
	}
}
