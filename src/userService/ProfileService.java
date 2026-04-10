package userService;

public class ProfileService {

    public String loadUserProfile(int userId) throws InterruptedException {
        Thread.sleep(2000);
        return "Profile{name='User' + " + userId + ", age=" + (10 + userId) + "}";
    }
}
