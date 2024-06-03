module App.aims_store {
    requires transitive javafx.graphics; 
    requires transitive javafx.controls;
    requires transitive javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;
    requires spring.context;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires spring.web;
    requires org.apache.tomcat.embed.core;

    opens app.aims_store to javafx.fxml;
    exports app.aims_store;
    exports controller to javafx.fxml;
    exports test to javafx.graphics;
    opens controller to javafx.fxml;
}

