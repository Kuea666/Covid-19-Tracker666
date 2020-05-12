package cv19Tracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//import static cv19Tracker.ReadText.readTextFromUrl;
//import static cv19Tracker.UrlToInt.readNumberFromUrl;

/**
 * @author Siravit 6210546048
 */

public class Main extends Application {
    //https://covid19.th-stat.com/api/open/timeline

    @Override
    public void start(Stage primaryStage) throws Exception{
//        String[] stringData= readNumberFromUrl("http://covid19.th-stat.com/api/open/today");
//        int i =  Integer.parseInt(stringData[1]);
//        System.out.println(stringData[1]);
//        String[] stringData=readTextFromUrl("http://covid19.th-stat.com/api/open/today");
//        //test print data
//        for(String data:stringData)
//            System.out.println(data);
        Parent root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
        primaryStage.setTitle("Thai Covid-19 Stat");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}

