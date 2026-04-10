package userService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UserInfoAggregator {

    private final OrderService orderService;
    private final ProfileService profileService;
    private final UserDetailsService userDetailsService;
    private final ExecutorService executorService = Executors.newFixedThreadPool(3);

    public UserInfoAggregator(OrderService orderService,
                              ProfileService profileService,
                              UserDetailsService userDetailsService) {
        this.orderService = orderService;
        this.profileService = profileService;
        this.userDetailsService = userDetailsService;
    }

    public void loadUserInfo(int userId) throws InterruptedException {
//        List<String> strings = orderService.loadUserOrders(userId);
//        String s = profileService.loadUserProfile(userId);
//        Map<String, String> stringStringMap = userDetailsService.loadUserProfile(userId);

        Future<List<String>> submit1 = executorService.submit(() -> orderService.loadUserOrders(userId));
        Future<String> submit2 = executorService.submit(() -> profileService.loadUserProfile(userId));
        Future<Map<String, String>> submit3 = executorService.submit(() -> userDetailsService.loadUserProfile(userId));

        List<Future> allFutures = Arrays.asList(submit1, submit2, submit3);
        Iterator<Future> iterator = allFutures.iterator();
        List<String> results = new ArrayList<>();
        while (iterator.hasNext()) {
            System.out.println("While running");
            Future next = iterator.next();
            if (next.isDone()) {
                System.out.println("Future is Done");
                try {
                    Object o = next.get();
                    results.add(o.toString());
                    System.out.println("Future result " + o.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                    iterator.remove();
                }
                iterator.remove();
            }
        }
        System.out.println("results " + results);
        executorService.shutdown();
    }
}
