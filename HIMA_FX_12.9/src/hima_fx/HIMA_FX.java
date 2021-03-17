/* HIMA
 * Forrest Moulin
 * Maxwell Naughton
 * Brianna Price
 */

package hima_fx; 

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author forre
 */
public class HIMA_FX extends Application {
        
    @Override
    public void start(Stage stage) throws Exception {
 
        Parent root = FXMLLoader.load(getClass().getResource("/view/SignOnGUI.fxml"));
        Scene scene = new Scene(root);  
        scene.getStylesheets().add(getClass().getResource("/view/himaCSS.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("HIMA: Sign On"); // Set title for Sign On stage (window)
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }    
}
