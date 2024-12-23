module com.example.tvelia {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
//    requires jfoenix;


    opens com.example.tvelia to javafx.fxml;
    exports com.example.tvelia;
    exports com.example.tvelia.server;
}