package controller;

/*import app.aims_store.AimsApplication;
import dao.RushOrderDAO;
import entity.Invoice;
import entity.Order;
import entity.RushOrder;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class RushShippingFormController {

    @FXML
    private TextField instructionsField;

    @FXML
    private ChoiceBox<String> timeField;

    @FXML
    private DatePicker dateField;

    @FXML
    private Button confirmButton;

    private Order order;

    @FXML
    public void initialize() {
        List<String> timeSlots = List.of("8:00 - 10:00", "10:00 - 12:00", "12:00 - 14:00", "14:00 - 16:00", "16:00 - 18:00", "18:00 - 20:00");
        timeField.getItems().addAll(timeSlots);
        confirmButton.setOnAction(e -> {
            try {
                handleConfirmButtonAction();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
    }

    @FXML
    private void handleConfirmButtonAction() throws SQLException, IOException {
        String time = timeField.getValue();
        LocalDate selectedDate = dateField.getValue();
        String timeInterval = selectedDate.toString() + " " + time;
        String intructions = instructionsField.getText();
        RushOrderDAO rushOrderDAO = new RushOrderDAO();
        int latestRushOrderId = rushOrderDAO.getLatestRushOrderId() + 1;
        RushOrder rushOrder = new RushOrder(latestRushOrderId, intructions, timeInterval);
        RushOrder.setInstance(rushOrder);

        Invoice invoice=new Invoice(order);
        InvoiceScreenController controller= new InvoiceScreenController(invoice,"Invoice.fxml");
        controller.show();
    }
}*/
