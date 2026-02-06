package providers;

import static providers.ProviderName.GOOGLE;

public class GoogleAuthProvider extends AuthProvider {

    public GoogleAuthProvider(String providerUrl, String providerToken) {
        super(providerUrl, providerToken);
    }

    @Override
    public User authenticate(String username) {
        System.out.println("[AuthProvider] AUTH " + username);
        log();
        /*
            providerURL + providerToken + GET() -> "GoogleName", "googlePassword", "user@gmail.com
         */
        return new User("GoogleName" + username, "googlePassword", "user@gmail.com");
    }

    @Override
    public void refreshToken() {
        log();
        /*
            providerURL + providerToken + GET()
         */
        System.out.println("[AuthProvider] " + getProviderName() + " refreshing token");
    }

    @Override
    public ProviderName getProviderName() {
        return GOOGLE;
    }
}
