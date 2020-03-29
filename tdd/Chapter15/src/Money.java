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

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
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

    Expression times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    public Money reduce(Bank bank, String to) {
        int rate = (currency.equals("CHF") && to.equals("USD"))
                ? 2
                : 1;
        return new Money(amount / rate, to);
    }
}
