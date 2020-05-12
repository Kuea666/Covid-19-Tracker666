package cv19Tracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Covid-19 Tracker app
 *
 * @author Siravit 6210546048
 */
public class Main extends Application {
    //https://covid19.th-stat.com/api/open/timeline

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("homePage.fxml"));//load fxml file
        primaryStage.setTitle("Thai Covid-19 Stat");//set title
        primaryStage.setScene(new Scene(root, 600, 600));//set scene
        primaryStage.show();//show
    }
    public static void main(String[] args) {
        launch(args);
    }
}
