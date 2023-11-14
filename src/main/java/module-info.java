module com.example.primeiroprojeto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeiroprojeto to javafx.fxml;
    exports com.example.primeiroprojeto;
}