package providers;

import static providers.ProviderName.ESIA;

public class ESIAAuthProvider extends AuthProvider {

    public ESIAAuthProvider(String providerUrl, String providerToken) {
        super(providerUrl, providerToken);
    }

    @Override
    public User authenticate(String username) {
        System.out.println("[AuthProvider] AUTH " + username);
        log();
        /*
            providerURL + providerToken + GET() -> ESIAName", "ESIAPassword", "user@yandex.com
         */
        return new User("ESIAName " + username, "ESIAPassword", "user@yandex.com");
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
        return ESIA;
    }
}
