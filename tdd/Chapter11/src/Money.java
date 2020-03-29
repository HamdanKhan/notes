/**
 * Created by hamdan on 12/26/14.
 */
 class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    String currency(){
        return currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount , "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public String toString() {
        return amount + " " + currency();
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }
}
