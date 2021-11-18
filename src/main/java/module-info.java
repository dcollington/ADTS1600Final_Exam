module com.example.adts1600_digitalprototype {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.adts1600_digitalprototype to javafx.fxml;
    exports com.example.adts1600_digitalprototype;
}