module com.example.crmproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    requires java.xml;
    requires java.sql;

    opens com.example.crmproject to javafx.fxml;
    exports com.example.crmproject;
}