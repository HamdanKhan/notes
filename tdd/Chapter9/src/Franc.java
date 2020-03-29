/**
 * Created by hamdan on 12/26/14.
 */
public class Franc extends Money{

    private String currency;

    public Franc(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

}
