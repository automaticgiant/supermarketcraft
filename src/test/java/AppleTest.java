import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 * Created by krm158 on 2/15/17.
 */
public class AppleTest {
    @Test
    public void singlePrice(){
        // expected, actual
        assertEquals(1, Apple.subtotal(1));
    }
    @Test
    public void priceFor2(){
        assertEquals(2, Apple.subtotal(2));
        //yay
    }
    @Test
    public void priceFor3(){
        // sale time
        assertEquals(2, Apple.subtotal(3));
        //oh noes
    }
    @Test
    public void priceFor4(){
        assertEquals(3, Apple.subtotal(4));
    }
}
