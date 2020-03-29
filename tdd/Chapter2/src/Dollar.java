/**
 * Created by Hamdan on 12/26/14.
 * Testing this one with junit.
 */
public class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    /**
     * now the internal state does not change.
     * @param multiplier
     * @return
     */
    Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
