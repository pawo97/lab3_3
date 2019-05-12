package lab3_3;

import org.junit.Before;
import org.junit.Test;

import edu.iis.mto.time.Clock;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;

public class OrderTest1 {

    public Order order;
    public Clock clock;

    @Before
    public void setUp() {
        this.clock = new Clock();
        this.order = new Order(clock);
    }

    @Test(expected = OrderExpiredException.class)
    public void isReturnExceptionWithTwoDays() {
        clock.addDateToReturn(2019, 6, 6, 6, 6);
        clock.addDateToReturn(2019, 6, 8, 6, 6);
        order.submit();
        order.confirm();
    }

    @Test(expected = OrderExpiredException.class)
    public void isReturnExceptionWithTwentyFourHourse() {
        clock.addDateToReturn(2019, 6, 6, 6, 6);
        clock.addDateToReturn(2019, 6, 7, 7, 6);
        order.submit();
        order.confirm();
    }

}
