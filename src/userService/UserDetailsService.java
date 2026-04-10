package userService;

public class UserDetailsService {

    public String loadUserProfile(int userId) throws InterruptedException {
        System.out.println("Loading user details");
        Thread.sleep(1000);
        System.out.println("Completed loading user details");
        return ("passport - 46544") + ("phone - 8999456485");
    }
}
