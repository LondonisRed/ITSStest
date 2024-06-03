package test;

import app.aims_store.AimsApplication;
import controller.InvoiceScreenController;
//import controller.RushShippingFormController;
import entity.DeliveryInfo;
import entity.Invoice;
import entity.Order;
import entity.OrderMedia;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import entity.Media.*;
import javafx.stage.Stage;

import java.io.IOException;

public class InvoiceTest extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Order order =new Order();
        DeliveryInfo deliveryInfo=new DeliveryInfo();
        deliveryInfo.setAddress("a");
        deliveryInfo.setName("a");
        deliveryInfo.setProvince("Ha Noi");
        order.setDeliveryInfo(deliveryInfo);
        Media me= new Media("ax","ax",10,10,10,null);
        OrderMedia om=new OrderMedia(me, 1, 10);
        order.addOrderMedia(om);
        order.setShippingFees(40000);
        Invoice invoice=new Invoice(order);
        InvoiceScreenController controller= new InvoiceScreenController(invoice,"Invoice.fxml");
        controller.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

