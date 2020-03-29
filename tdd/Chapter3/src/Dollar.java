/**
 * Created by Hamdan on 12/26/14.
 */
public class Dollar {

    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dollar dollar = (Dollar) o;

        if (amount != dollar.amount) return false;

        return true;
    }
}
