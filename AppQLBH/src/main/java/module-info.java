module com.nth.appqlbh {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.nth.appqlbh to javafx.fxml;
    exports com.nth.appqlbh;
}
