package userService;

import java.util.HashMap;
import java.util.Map;

public class UserDetailsService {

    public Map<String,String> loadUserProfile(int userId) throws InterruptedException {
        Thread.sleep(1000);
        Map<String,String> map = new HashMap<>();
        map.put("passport","46544");
        map.put("phone","8999456485");
        return map;
    }
}
