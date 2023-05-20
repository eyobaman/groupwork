package application;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
public class DbUtil {
    public static void changeScene(ActionEvent event, String fxmlFile, String title, String username ) {
    	Parent root = null;
    	if(username != null) {
    		try {
    			FXMLLoader loader= new FXMLLoader(DbUtil.class.getResource(fxmlFile));
    			root = loader.load();
    			LoginController loginController = loader.getController();
    			loginController.setUserInformation(username);
    			
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    	}else {
    		try {
    			root = FXMLLoader.load(DbUtil.class.getResource(fxmlFile)); 
    		}catch(IOException e) {
    			e.printStackTrace();
    		}
    	}
    	Stage stage =
    }
}
