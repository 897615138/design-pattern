package proxy.db;

/**
 * @author jill
 */
@SuppressWarnings("ALL")
public interface IOrderService {
    /**
     * create
     * @param order order
     * @return return
     */
    int createOrder(Order order);
}
