package entity;

import java.util.Date;

public class CreditCard {
    int id;

    String cardCode;

    String owner;

    String issuingBank;

    String cvvCode;

    Date dateExpired;

    public CreditCard(String cardCode, String owner, String issuingBank, String cvvCode, Date dateExpired) {
        this.cardCode = cardCode;
        this.owner = owner;
        this.issuingBank = issuingBank;
        this.cvvCode = cvvCode;
        this.dateExpired = dateExpired;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getIssuingBank() {
        return issuingBank;
    }

    public void setIssuingBank(String issuingBank) {
        this.issuingBank = issuingBank;
    }

    public String getCvvCode() {
        return cvvCode;
    }

    public void setCvvCode(String cvvCode) {
        this.cvvCode = cvvCode;
    }

    public Date getDateExpired() {
        return dateExpired;
    }

    public void setDateExpired(Date dateExpired) {
        this.dateExpired = dateExpired;
    }
}
