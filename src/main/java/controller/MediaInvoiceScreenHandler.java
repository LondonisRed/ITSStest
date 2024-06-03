package controller;


import java.io.IOException;
import java.sql.SQLException;

import app.aims_store.AimsApplication;
import entity.OrderMedia;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class MediaInvoiceScreenHandler {

    @FXML
    private HBox hboxMedia;

    @FXML
    private VBox imageLogoVbox;

    @FXML
    private ImageView image;

    @FXML
    private VBox description;

    @FXML
    private Label title;

    @FXML
    private Label numOfProd;

    @FXML
    private Label labelOutOfStock;

    @FXML
    private Label price;

    private OrderMedia orderMedia;
    private AnchorPane content;

    public MediaInvoiceScreenHandler(String screenPath) throws IOException{
        FXMLLoader loader = new FXMLLoader(AimsApplication.class.getResource(screenPath));
        loader.setController(this);
        content = (AnchorPane) loader.load();
    }

    public void setOrderMedia(OrderMedia orderMedia) throws SQLException{
        this.orderMedia = orderMedia;
        setMediaInfo();
    }
    public AnchorPane getContent() {
		return this.content;
	}
    public void setMediaInfo() throws SQLException{
        title.setText(orderMedia.getMedia().getTitle());
        price.setText(String.format("%d vnd",orderMedia.getPrice()));
        numOfProd.setText(String.valueOf(orderMedia.getQuantity()));
        
    }

}
