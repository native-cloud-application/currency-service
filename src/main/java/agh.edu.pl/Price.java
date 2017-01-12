package agh.edu.pl;


import java.io.Serializable;
import java.math.BigDecimal;

public class Price implements Serializable{

    public static final long serialVersionUID = 42L;

    private Currency currency;

    private BigDecimal amount;

    public Price(Currency currency, BigDecimal amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Price() {
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
