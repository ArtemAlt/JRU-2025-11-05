package userService;

import java.time.LocalDateTime;
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

        Future<String>submit1 = executorService.submit(() -> orderService.loadUserOrders(userId));
        Future<String> submit2 = executorService.submit(() -> profileService.loadUserProfile(userId));
        Future<String> submit3 = executorService.submit(() -> userDetailsService.loadUserProfile(userId));

        List<Future<String>> allFutures = new ArrayList<>(Arrays.asList(submit1, submit2, submit3));
        List<String> results = new ArrayList<>();
        LocalDateTime start = LocalDateTime.now();
        System.out.println("Start running time: " + start);

        while (!allFutures.isEmpty()) {
            Iterator<Future<String>> iterator = allFutures.iterator();
            while (iterator.hasNext()) {
                Future<String> next = iterator.next();

                if (next.isDone()) {
                    try {
                        String result = next.get();
                        results.add(result);
                        iterator.remove(); // Удаляем завершённую задачу
                    } catch (Exception e) {
                        e.printStackTrace();
                        iterator.remove();
                    }
                }
            }
            Thread.sleep(100);
        }

        LocalDateTime end = LocalDateTime.now();
        System.out.println("End running time: " + end);
        System.out.println("All results: " + results);
        System.out.println("results " + results.size());
        executorService.shutdown();
    }
}
