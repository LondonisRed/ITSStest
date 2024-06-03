package controller;

import app.aims_store.AimsApplication;
import entity.Cart.Cart;
import entity.DeliveryInfo;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ShippingFormController {
    @FXML
    private TextField nameField;
    @FXML
    private TextField phoneNumberField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField provinceField;
    @FXML
    private TextField instructionsField;
    @FXML
    private TextField emailField;
    @FXML
    private CheckBox rushDeliveryCheckBox;
    @FXML
    private Button confirmDeliveryButton;
    @FXML
    private Label shippingFeeField;
    @FXML
    private void initialize() {
        Cart cart = Cart.getCart();
        setShippingFee(40.000);
        confirmDeliveryButton.setOnAction(e -> {
            try {
                handleConfirmDelivery();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

    @FXML
    private void handleConfirmDelivery() throws IOException {
        String name = nameField.getText();
        String address = addressField.getText();
        String phoneNumber = phoneNumberField.getText();
        String province = provinceField.getText();
        String instructions = instructionsField.getText();
        String email = emailField.getText();
        boolean chooseRushOrder = rushDeliveryCheckBox.isSelected();

        DeliveryInfo deliveryInfo = new DeliveryInfo(0, name, phoneNumber, email, province, instructions, address, chooseRushOrder);
        DeliveryInfo.setInstance(deliveryInfo);

        if (chooseRushOrder) {
            FXMLLoader loader = new FXMLLoader(AimsApplication.class.getResource("RushShipping.fxml"));
            Scene scene = new Scene(loader.load(), 1920, 1080);
            Stage stage = (Stage) confirmDeliveryButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } else {
            FXMLLoader loader = new FXMLLoader(AimsApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(loader.load(), 1920, 1080);
            Stage stage = (Stage) confirmDeliveryButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        }
    }

    private void setShippingFee(double fee) {
        shippingFeeField.setText(String.format("%.3f vnd", fee));
    }
}
