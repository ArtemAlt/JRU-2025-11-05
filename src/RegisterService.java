import java.util.HashMap;
import java.util.Map;

public class RegisterService {

    private final Map<String, String> map;

    public RegisterService() {
        this.map = new HashMap<>();
    }

    public void register(String username, String email) {
        try {
            verifyEmail(email);
        } catch (InvalidEmailFormatException e) {
            System.out.println(e.getMessage());
            email = "default@email.com";
        }
        map.put(username, email);
    }

    public void showAll() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private void verifyEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new InvalidEmailFormatException("Wrong email format");
        }
    }
}
