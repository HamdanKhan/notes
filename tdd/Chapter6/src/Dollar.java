/**
 * Created by hamdan on 12/26/14.
 */
public class Dollar extends Money{

    public Dollar(int amount){
        this.amount = amount;
    }

    public boolean equals(Object object){
        Money money= (Money) object;
        return amount == money.amount;
    }
}
