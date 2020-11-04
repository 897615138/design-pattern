package proxy.db;


import proxy.db.proxy.OrderServiceDynamicProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author jill on 2019/3/10.
 */
public class DbRouteProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            order.setCreateTime(System.currentTimeMillis());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());
            orderService.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
