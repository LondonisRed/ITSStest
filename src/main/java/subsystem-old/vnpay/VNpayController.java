package subsystem.vnpay;

import entity.CreditCard;
import entity.PaymentTransaction;

import java.io.UnsupportedEncodingException;

public class VNpayController {
    public static PaymentTransaction payOrder(CreditCard card, int amount, String contents) throws UnsupportedEncodingException {
        String url = Request.buildQueryUrl("asd", "other", null, "vn", 1000000);
        VNpayBoundary.processTransaction(url);
        return null;
    }

    public PaymentTransaction refund(CreditCard card, int amount, String contents) {
        return null;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        payOrder(null, 100, null);
    }
}
