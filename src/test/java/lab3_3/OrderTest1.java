package lab3_3;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.time.FakeClock;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;

public class OrderTest1 {

    public Order order;
    public FakeClock fakeClock;

    @Before
    public void setUp() {
        this.fakeClock = new FakeClock();
        this.order = new Order(fakeClock);
    }

    @Test(expected = OrderExpiredException.class)
    public void isReturnExceptionWithTwoDays() {
        fakeClock.addDateToReturn(2019, 6, 6, 6, 6);
        fakeClock.addDateToReturn(2019, 6, 8, 6, 6);
        order.submit();
        order.confirm();
    }

    @Test(expected = OrderExpiredException.class)
    public void isReturnExceptionWithTwentyFourHourse() {
        fakeClock.addDateToReturn(2019, 6, 6, 6, 6);
        fakeClock.addDateToReturn(2019, 6, 7, 7, 6);
        order.submit();
        order.confirm();
    }

}
