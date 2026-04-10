import userService.OrderService;
import userService.ProfileService;
import userService.UserDetailsService;
import userService.UserInfoAggregator;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        SimulationProperties simulationProperties = SimulationProperties.getInstance();
//        simulationProperties.configInfo();
        OrderService orderService = new OrderService();
        ProfileService profileService = new ProfileService();
        UserDetailsService userDetailsService = new UserDetailsService();
        UserInfoAggregator aggregator = new UserInfoAggregator(orderService, profileService, userDetailsService);
        aggregator.loadUserInfo(5);
    }
}