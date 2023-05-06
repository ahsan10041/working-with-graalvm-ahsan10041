module hello {
    requires javafx.controls;
    requires javafx.fxml;
    exports hello;
    opens hello to javafx.fxml;
}
