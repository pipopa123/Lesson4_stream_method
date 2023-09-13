module com.example.p0910 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.p0910 to javafx.fxml;
    exports com.example.p0910;
}