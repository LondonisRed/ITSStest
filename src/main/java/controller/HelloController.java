package controller;

import app.aims_store.AimsApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private void onHelloButtonClick() {
        // Create a new stage for the WebView
        Stage webViewStage = new Stage();
        webViewStage.setTitle("Payment Processing");

        // Create the WebView and WebEngine
        WebView webView = new WebView();
        WebEngine webEngine = webView.getEngine();

        // Monitor URL changes
        webEngine.locationProperty().addListener((obs, oldLocation, newLocation) -> {
            if (newLocation.equals("http://localhost:8080/return-url")) {
                // Close the WebView stage
                webViewStage.close();

                // Open a new scene within the JavaFX application
                try {
                    openReturnScene();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        // Load the payment URL
        webEngine.load("https://www.example-payment.com");

        // Create a VBox and set the WebView as the child
        VBox webViewRoot = new VBox();
        webViewRoot.getChildren().add(webView);

        // Create the scene for the new stage and set it
        Scene webViewScene = new Scene(webViewRoot, 800, 600);
        webViewStage.setScene(webViewScene);
        webViewStage.show();
    }

    private void openReturnScene() throws IOException {
        // Load the new FXML for the return scene
        FXMLLoader fxmlLoader = new FXMLLoader(AimsApplication.class.getResource("return-view.fxml"));
        VBox returnRoot = fxmlLoader.load();

        // Create a new scene and set it on the primary stage
        Scene returnScene = new Scene(returnRoot, 320, 240);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Return Scene");
        primaryStage.setScene(returnScene);
        primaryStage.show();
    }
}
