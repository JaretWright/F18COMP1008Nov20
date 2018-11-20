package f18comp1008nov20;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author jwright
 */
public class LaunchStudentCreator extends Application{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentCreator.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Create Student");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
