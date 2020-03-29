/**
 * Created by Hamdan on 12/26/14.
 */
public class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        this.amount *= multiplier;
    }
}
