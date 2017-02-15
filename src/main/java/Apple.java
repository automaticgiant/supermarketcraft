/**
 * Created by krm158 on 2/15/17.
 */
public class Apple {
    // does 3 for 2 deal
    static int singlePrice = 1;
    static int priceFor3 = 2;
    public static int subtotal(int qty) {
        //naive
//        return singlePrice*qty;
        if (qty==3) {
            return 2;
        } else if (qty==4) {
            return 3;
        } else {
                return singlePrice*qty;

        }
    }
}//asdf
