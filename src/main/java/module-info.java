module com.raiven.taskfilter {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.raiven.taskfilter to javafx.fxml;
    opens com.raiven.taskfilter.model to javafx.base;
    exports com.raiven.taskfilter;
}
