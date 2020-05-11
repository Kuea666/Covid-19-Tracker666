package cv19Tracker;


import static cv19Tracker.ReadText.readTextFromUrl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Arrays;

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
//        Scene tablePageScene =new Scene(tablePageParent);
        Stage appStage = new Stage();
        appStage.setTitle("CoVid-19 Tracker");
//        appStage.initStyle(StageStyle.UNDECORATED);
        appStage.setScene(new Scene(tablePageParent, 600, 600));
        appStage.show();
//        appStage.setScene(tablePageScene);
//        appStage.show();
    }

    @FXML
    void initialize() {
        Apane.setStyle("-fx-background-color: #4b5a81");

        String[] sData= readTextFromUrl("http://covid19.th-stat.com/api/open/today");
        String s0=sData[0];
        String s1=sData[1];
        String s2=sData[2];
        String s3=sData[3];
        String s4=sData[4];
        String s5=sData[5];
        String s6=sData[6];
        String s7=sData[7];
        String s8=sData[8];

        lb1.setText(s1);

        lb2.setText(s2);
        lb3.setText(s3);
        lb4.setText(s4);
        lb5.setText(s5);
        lb6.setText(s6);
        lb7.setText(s7);
        lb8.setText(s0);
        lb10.setText(s8);

    }
}
