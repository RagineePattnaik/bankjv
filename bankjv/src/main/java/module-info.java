module com.example.bankjv {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bankjv to javafx.fxml;
    exports com.example.bankjv;
}