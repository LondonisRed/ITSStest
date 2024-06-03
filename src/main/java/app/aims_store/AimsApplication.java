package app.aims_store;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
public class AimsApplication extends Application {

    static WebView webView;
    static WebEngine webEngine;

    @Override
    public void start(Stage stage) throws Exception {
        // Create the WebView and WebEngine
        webView = new WebView();
        webEngine = webView.getEngine();

        // Load the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(AimsApplication.class.getResource("/app/aims_store/hello-view.fxml"));
        VBox root = fxmlLoader.load();

        // Set the WebView as the child of the VBox
        root.getChildren().add(webView);

        // Create the scene and set it on the stage
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}