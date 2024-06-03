package subsystem;

import model.payment.Payment;
import subsystem.VNPay.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

/***
 * The {@code InterbankSubsystem} class is used to communicate with the
 * Interbank to make transaction.
 */

public class VNPaySubsystem implements VNPayInterface {
    private VNPayController ctrl;
    /**
     * Initializes a newly created {@code InterbankSubsystem} object so that it
     * represents an Interbank subsystem.
     */
    public VNPaySubsystem() {
        this.ctrl = new VNPayController();
    }

    public String generatePayUrl(int amount, String contents) {
        try {
            return ctrl.generatePayOrderUrl(amount, contents);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Payment makePaymentTransaction(Map<String, String> response) throws ParseException {
        return ctrl.makePaymentTransaction(response);
    }
}