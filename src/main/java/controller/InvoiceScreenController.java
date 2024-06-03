package controller;

import java.io.IOException;
import java.sql.SQLException;


import app.aims_store.AimsApplication;
import common.exception.ProcessInvoiceException;
import entity.DeliveryInfo;
import entity.Invoice;
import entity.OrderMedia;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InvoiceScreenController  {

	@FXML
	private Text name;

	@FXML
	private Text province;

	@FXML
	private Text address;

	@FXML
	private Text subtotal;

	@FXML
	private Text shippingFees;

	@FXML
	private Text total;

	@FXML
	private VBox vboxItems;

	@FXML
	private Button confirmButton;

	private Invoice invoice;

	protected FXMLLoader loader;
	protected AnchorPane content;
	protected Stage stage;
	private Scene scene;

	public InvoiceScreenController(Invoice invoice,String screenPath) throws IOException{
		this.loader = new FXMLLoader(AimsApplication.class.getResource(screenPath));
		// Set this class as the controller
		this.loader.setController(this);
		this.content = (AnchorPane) loader.load();
		this.invoice=invoice;
		this.stage = new Stage();
		setInvoiceInfo();
        
	}
	public void show() {
		if (this.scene == null) {
			this.scene = new Scene(this.content);
		}
		this.stage.setScene(this.scene);
		this.stage.show();
		
	}

	private void setInvoiceInfo(){
		DeliveryInfo deliveryInfo = invoice.getOrder().getDeliveryInfo();
		
		name.setText(deliveryInfo.getName());//deliveryInfo.getName())
		province.setText(deliveryInfo.getProvince());
		address.setText(deliveryInfo.getAddress());
		subtotal.setText(String.format("%d vnd",invoice.getOrder().getAmount()));
		shippingFees.setText(String.format("%d vnd", invoice.getOrder().getShippingFees()));
		int amount = invoice.getOrder().getAmount() + invoice.getOrder().getShippingFees();
		invoice.getOrder().getlstOrderMedia().forEach(orderMedia -> {
			try {
				MediaInvoiceScreenHandler mis = new MediaInvoiceScreenHandler("media_invoice.fxml");
				mis.setOrderMedia((OrderMedia) orderMedia);
				vboxItems.getChildren().add(mis.getContent());
			} catch (IOException | SQLException e) {
				System.err.println("errors: " + e.getMessage());
				throw new ProcessInvoiceException(e.getMessage());
			}
			
		});
		total.setText(String.format("%d vnd", amount));
		invoice.setAmount(amount);


	}

	@FXML
	void confirmInvoice(MouseEvent event) throws IOException {
		PaymentScreenHandler paymentScreen = new PaymentScreenHandler("Payment Form.fxml", invoice);
		paymentScreen.show();
		this.stage.close();
	}


}
