package cv19Tracker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.List;

import static cv19Tracker.ReadText.readTextFromUrl;
import static cv19Tracker.UrlToInt.readNumberFromUrl;

public class tablePageController {

    @FXML
    private AnchorPane tablePage;

    @FXML
    private Button backButton;

    @FXML
    private PieChart charTPie;

    @FXML
    void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) backButton.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    @FXML
    void initialize() {
        tablePage.setStyle("-fx-background-color: #4b5a81");
        String[] Data= readNumberFromUrl("http://covid19.th-stat.com/api/open/today");
        ObservableList<PieChart.Data>list= FXCollections.observableArrayList();
        int i =  Integer.parseInt(Data[1]);
        int i2 =  Integer.parseInt(Data[2]);
        int i3 =  Integer.parseInt(Data[3]);
        list.add(new PieChart.Data("Recovered",i));
        list.add (new PieChart.Data("Dead", i2));
        list.add(new PieChart.Data("In Hospital",i3));
        charTPie.setData(list);
        charTPie.setStartAngle(90);
//        PieChart dataPie=new PieChart(list);
//        dataPie.setTitle("Pie Chart Today");
//        paneView.getChildren().add(dataPie);
    }


//    @FXML
//    void handleButtonAction(ActionEvent event) throws IOException {
//
//        Parent tablePageParent =FXMLLoader.load(getClass().getResource("tablePage.fxml"));
//        Scene tablePageScene =new Scene(tablePageParent);
//        Stage appStage =(Stage)((Node) event.getSource()).getScene().getWindow();
//        appStage.setScene(tablePageScene);
//        appStage.show();
//
//    }

}
