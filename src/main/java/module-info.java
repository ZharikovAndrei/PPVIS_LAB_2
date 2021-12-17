module com.example.home_library {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.home_library to javafx.fxml;
    exports com.example.home_library;
}