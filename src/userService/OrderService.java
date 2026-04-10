package userService;

import java.util.Arrays;
import java.util.List;

public class OrderService {

    public List<String> loadUserOrders(int userId) throws InterruptedException {
        Thread.sleep(3000);
        return Arrays.asList("Order#1", "Order#2", "Order#3");
    }
}
