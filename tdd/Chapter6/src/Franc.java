/**
 * Created by hamdan on 12/26/14.
 */
public class Franc extends Money{

    public Franc(int amount){
        this.amount = amount;
    }

    public boolean equals(Object object){
        Money money= (Money) object;
        return amount == money.amount;
    }
}
