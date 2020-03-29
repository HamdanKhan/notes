/**
 * Created by hamdan on 12/28/14.
 */
public class Bank {

    Money reduce(Expression source, String to) {
        if (source instanceof Money)
            return (Money) source.reduce(to);
        Sum sum= (Sum) source;
        return sum.reduce(to);
    }
}
