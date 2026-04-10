package userService;


public class OrderService {

    public String loadUserOrders(int userId) throws InterruptedException {
        System.out.println("Loading user orders");
        Thread.sleep(3000);
        System.out.println("Completed loading user orders");
        return "Order#1" + "Order#2" + "Order#3";
    }
}
