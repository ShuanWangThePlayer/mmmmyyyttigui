package gui;
	
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	private Stage stage;
	private final double MINIMUM_WINDOW_WIDTH = 400.0;  
	private final double MINIMUM_WINDOW_HEIGHT = 250.0; 
	
	@Override
	public void start(Stage primaryStage) {
		 stage = primaryStage;  
	     stage.setTitle("MYTI");  
	     stage.setMinWidth(MINIMUM_WINDOW_WIDTH);  
	     stage.setMinHeight(MINIMUM_WINDOW_HEIGHT);  
	     gotoMain();  
	     stage.show();
	}
	 
	private Initializable replaceSceneContent(String fxml) throws Exception {  
		FXMLLoader loader = new FXMLLoader();  
		InputStream in = Main.class.getResourceAsStream(fxml);  
		loader.setBuilderFactory(new JavaFXBuilderFactory());  
		loader.setLocation(Main.class.getResource(fxml));  
		AnchorPane page;  
		try {  
			page = (AnchorPane) loader.load(in);  
	        } finally {  
	        	in.close();  
	        	}   
		Scene scene = new Scene(page, 800, 600);  
		stage.setScene(scene); 
		stage.sizeToScene();  
		return (Initializable) loader.getController();  
	}
	 
	public void gotoMain(){  
	     try {  
	           MainController main = (MainController) replaceSceneContent("Main.fxml");  
	           main.setApp(this);  
	       } catch (Exception ex) {  
	           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);  
	       }  
	}  
		
	public void gotoAdd(){  
	     try {  
	           AddTopController at = (AddTopController) replaceSceneContent("keyin.fxml");  
	           at.setApp(this);  
	       } catch (Exception ex) {  
	           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);  
	       }  
	}
	 
	public void gotoReport(){  
	     try {  
	           ReportController at = (ReportController) replaceSceneContent("report.fxml");  
	           at.setApp(this);  
	       } catch (Exception ex) {  
	           Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);  
	       }  
    }
	 
	public void end(){
		System.exit(0);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
