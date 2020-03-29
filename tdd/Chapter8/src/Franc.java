/**
 * Created by hamdan on 12/26/14.
 */
public class Franc extends Money{

    public Franc(int amount){
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
