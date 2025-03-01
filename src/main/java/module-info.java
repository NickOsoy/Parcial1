module com.example.mipatito {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mipatito to javafx.fxml;
    exports com.example.mipatito;
}