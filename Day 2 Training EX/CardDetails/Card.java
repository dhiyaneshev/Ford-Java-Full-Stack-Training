package CardDetails;

public abstract class Card {
    protected String holderName;

    protected String cardNumber;

    protected String expiryDate;

    public Card(String holderName, String cardNumber, String expiryDate) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}