package subsystem;

import exception.PaymentException;
import exception.UnrecognizedException;
import model.payment.Payment;

import java.text.ParseException;
import java.util.Map;

/**
 * The {@code InterbankInterface} class is used to communicate with the
 * {@link VNPaySubsystem InterbankSubsystem} to make transaction.
 *
 * @author quang
 */

public interface VNPayInterface {
    /**
     * Pay order and then return the payment transaction.
     */
    public abstract String generatePayUrl(int amount, String contents)
            throws PaymentException, UnrecognizedException;

    public Payment makePaymentTransaction(Map<String, String> response) throws ParseException;
}