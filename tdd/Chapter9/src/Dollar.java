/**
 * Created by hamdan on 12/26/14.
 */
public class Dollar extends Money{

    private String currency;

    public Dollar(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
