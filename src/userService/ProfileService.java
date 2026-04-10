package userService;

public class ProfileService {

    public String loadUserProfile(int userId) throws InterruptedException {
        System.out.println("Loading user profile");
        Thread.sleep(2000);
        System.out.println("Completed loading user profile");
        return "Profile{name='User' + " + userId + ", age=" + (10 + userId) + "}";
    }
}
