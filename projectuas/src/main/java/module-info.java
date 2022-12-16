module com.cariobat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectuas to javafx.fxml;
    exports com.example.projectuas;

}