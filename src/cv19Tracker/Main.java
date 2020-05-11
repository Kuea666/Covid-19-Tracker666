package cv19Tracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static cv19Tracker.ReadText.readTextFromUrl;
import static cv19Tracker.UrlToInt.readNumberFromUrl;

public class Main extends Application {
    //https://covid19.th-stat.com/api/open/timeline

    @Override
    public void start(Stage primaryStage) throws Exception{
        String[] stringData= readNumberFromUrl("http://covid19.th-stat.com/api/open/today");
        int i =  Integer.parseInt(stringData[1]);
        System.out.println(stringData[1]);
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

//        String withoutLastCharacter = text.substring(0, text.length() - 1);
//        String[] stringArrayByDate = stringByDate.split("}");
}

