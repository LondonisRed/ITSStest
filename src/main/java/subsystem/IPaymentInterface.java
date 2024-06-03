package subsystem;

import common.exception.PaymentException;
import common.exception.UnknownException;
import entity.CreditCard;
import entity.PaymentTransaction;

import java.io.UnsupportedEncodingException;

/**
 * The {@code InterbankInterface} class is used to communicate with the
 * {@link subsystem.VnpaySubsystem Vnpay Subsystem } to make transaction
 *
 * @author hieud
 *
 */
public interface IPaymentInterface {

    /**
     * Pay order, and then return the payment transaction
     *
     * @param card     - the credit card used for payment
     * @param amount   - the amount to pay
     * @param contents - the transaction contents
     * @return {@link entity.PaymentTransaction PaymentTransaction} - if the
     *         payment is successful
     * @throws PaymentException      if responded with a pre-defined error code
     * @throws UnknownException if responded with an unknown error code or
     *                               something goes wrong
     */
    public abstract PaymentTransaction payOrder(CreditCard card, int amount, String contents)
            throws PaymentException, UnknownException, UnsupportedEncodingException;

    /**
     * Refund, and then return the payment transaction
     *
     * @param card     - the credit card which would be refunded to
     * @param amount   - the amount to refund
     * @param contents - the transaction contents
     * @return {@link entity.PaymentTransaction PaymentTransaction} - if the
     *         payment is successful
     * @throws PaymentException      if responded with a pre-defined error code
     * @throws UnknownException if responded with an unknown error code or
     *                               something goes wrong
     */
    public abstract PaymentTransaction refund(CreditCard card, int amount, String contents)
            throws PaymentException, UnknownException;

}
