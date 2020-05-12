package cv19Tracker;


import cv19Tracker.strategy.ReaderStrategy;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import cv19Tracker.strategy.*;

public class homePageController {

    @FXML
    private AnchorPane Apane;

    @FXML
    private Label lb1;

    @FXML
    private Label lb2;

    @FXML
    private Label lb4;

    @FXML
    private Label lb5;

    @FXML
    private Label lb3;

    @FXML
    private Label lb7;

    @FXML
    private Label lb8;

    @FXML
    private Label lb6;

    @FXML
    private Label lb10;

    @FXML
    private Label lb11;

    @FXML
    private Label lb111;

    @FXML
    private Label lb1111;

    @FXML
    private MenuBar barMenu;

    @FXML
    private Menu mainBar;

    @FXML
    private MenuItem todayBar;

    @FXML
    private MenuItem tableBar;

    @FXML
    void handleButtonAction(ActionEvent event) throws IOException {
        Parent tablePageParent =FXMLLoader.load(getClass().getResource("tablePage.fxml"));
        Stage appStage = new Stage();
        appStage.setTitle("CoVid-19 Tracker");//set title
        appStage.setScene(new Scene(tablePageParent, 600, 600));//set scene
        appStage.show();
    }

    @FXML
    void initialize() {
        Apane.setStyle("-fx-background-color: #4b5a81");//set background color.
        ReaderStrategy strategy=new ReadTextStrategy();
        String[] fromUrl= strategy.reader("http://covid19.th-stat.com/api/open/today");
        String dataConfirmed=fromUrl[0];//convert Confirmed to string
        String dataRecovered=fromUrl[1];//convert Recovered to string
        String dataHospitalized=fromUrl[2];//convert Hospitalized to string
        String dataDeath=fromUrl[3];//convert Death to string
        String dataNewConfirmed=fromUrl[4];//convert NewConfirmed to string
        String dataNewRecovered=fromUrl[5];//convert NewRecovered to string
        String dataNewHospitalize=fromUrl[6];//convert NewHospitalize to string
        String dataNewDeath=fromUrl[7];//convert NewDeath to string
        String dataDate=fromUrl[8];//convert Date to string

        lb1.setText(dataRecovered);//set Recovered
        lb2.setText(dataHospitalized);//set Hospitalized
        lb3.setText(dataDeath);//set Death
        lb4.setText(dataNewConfirmed);//set NewConfirmed
        lb5.setText(dataNewRecovered);//set NewRecovered
        lb6.setText(dataNewHospitalize);//set NewHospitalize
        lb7.setText(dataNewDeath);//set newDeath
        lb8.setText(dataConfirmed);//set Confirmed
        lb10.setText(dataDate);//set date

    }
}
