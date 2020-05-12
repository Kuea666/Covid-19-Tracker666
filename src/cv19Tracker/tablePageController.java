package cv19Tracker;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import cv19Tracker.strategy.*;



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
        ReaderStrategy strategy=new ReadNumberStrategy();
        tablePage.setStyle("-fx-background-color: #4b5a81");
        String[] Data= strategy.reader("http://covid19.th-stat.com/api/open/today");
        ObservableList<PieChart.Data>list= FXCollections.observableArrayList();
        int dataRecovered =  Integer.parseInt(Data[1]);
        int dataDeath =  Integer.parseInt(Data[2]);
        int dataInHospital =  Integer.parseInt(Data[3]);
        list.add(new PieChart.Data("Recovered",dataRecovered));
        list.add (new PieChart.Data("Dead", dataDeath));
        list.add(new PieChart.Data("In Hospital",dataInHospital));
        charTPie.setData(list);
        charTPie.setStartAngle(90);
    }

}
