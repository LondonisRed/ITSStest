package subsystem;
//
//import common.exception.InternalServerException;
//import common.exception.InvalidCardException;
//import common.exception.NotEnoughBalanceException;
import entity.CreditCard;
import entity.PaymentTransaction;
import subsystem.vnpay.VNpayController;

import java.io.UnsupportedEncodingException;

/***
 * The {@code VnpaySubsystem} class is used to communicate with the
 * Vnpay to make transaction.
 *
 * @author hieud
 *
 */
public class VnpaySubsystem implements IPaymentInterface {

    /**
     * Represent the controller of the subsystem
     */
    private VNpayController ctrl;

    /**
     * Initializes a newly created {@code VnpaySubsystem} object so that it
     * represents a Vnpay subsystem.
     */
    public VnpaySubsystem() {
        String str = new String();
        this.ctrl = new VNpayController();
    }

    /**
     * @see IPaymentInterface#payOrder(entity.CreditCard, int,
     *      java.lang.String)
     */
    public PaymentTransaction payOrder(CreditCard card, int amount, String contents) throws UnsupportedEncodingException {
        PaymentTransaction transaction = ctrl.payOrder(card, amount, contents);
        return transaction;
    }

    /**
     * @see IPaymentInterface#refund(entity.CreditCard, int,
     *      java.lang.String)
     */
    public PaymentTransaction refund(CreditCard card, int amount, String contents) {
        PaymentTransaction transaction = ctrl.refund(card, amount, contents);
        return transaction;
    }
}
