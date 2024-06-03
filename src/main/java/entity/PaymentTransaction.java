package entity;

import java.util.Date;

public class PaymentTransaction {
    int id;

    int invoiceId;

    int cardId;

    Date createdAt;

    String method;

    String content;

    public PaymentTransaction(int invoiceId, int cardId, Date createdAt, String method, String content) {
        this.invoiceId = invoiceId;
        this.cardId = cardId;
        this.createdAt = createdAt;
        this.method = method;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
