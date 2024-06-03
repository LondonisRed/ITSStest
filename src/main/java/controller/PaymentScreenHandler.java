package controller;

import java.io.IOException;
import java.util.Map;

import app.aims_store.AimsApplication;
import entity.Cart.Cart;
import common.exception.PlaceOrderException;
import entity.Invoice;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class PaymentScreenHandler {

	@FXML
	private Button btnConfirmPayment;

	@FXML
	private ImageView loadingImage;

	private Invoice invoice;
	protected FXMLLoader loader;
	protected AnchorPane content;
	protected Stage stage;
	private Scene scene;

	public void show() {
		if (this.scene == null) {
			this.scene = new Scene(this.content);
		}
		this.stage.setScene(this.scene);
		this.stage.show();
		
	}

	public PaymentScreenHandler(String screenPath, Invoice invoice) throws IOException {
		this.loader = new FXMLLoader(AimsApplication.class.getResource(screenPath));
		// Set this class as the controller
		this.loader.setController(this);
		this.content = (AnchorPane) loader.load();
		this.invoice=invoice;
		this.stage = new Stage();
		this.invoice = invoice;
		
		btnConfirmPayment.setOnMouseClicked(e -> {
			try {
				confirmToPayOrder();
			} catch (Exception exp) {
				System.out.println(exp.getStackTrace());
			}
		});
	}

	@FXML
	private TextField cardNumber;

	@FXML
	private TextField holderName;

	@FXML
	private TextField month;
	
	@FXML
	private TextField year;

	@FXML
	private TextField bank;

	@FXML
	private TextField securityCode;

	void confirmToPayOrder() throws IOException{
	}

}