/**
 * Created by hamdan on 12/26/14.
 */
 class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public String currency(){
        return currency;
    }

    public Expression plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount , "CHF");
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
