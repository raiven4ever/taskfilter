module com.raiven.taskfilter {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.raiven.taskfilter to javafx.fxml;
    opens com.raiven.taskfilter.model to javafx.base;
    opens com.raiven.taskfilter.controller to javafx.fxml;
    exports com.raiven.taskfilter;
}
