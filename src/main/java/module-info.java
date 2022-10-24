module com.example.lesson07 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lesson07 to javafx.fxml;
    exports com.example.lesson07;
}