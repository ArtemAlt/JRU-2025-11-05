package providers;

public abstract class AuthProvider {
    private final String providerUrl;
    private final String providerToken;

    public AuthProvider(String providerUrl, String providerToken) {
        this.providerUrl = providerUrl;
        this.providerToken = providerToken;
    }

    public abstract User authenticate(String username);

    public abstract void refreshToken();

    public abstract ProviderName getProviderName();

    public void log() {
        System.out.println("[AuthProvider] " + getProviderName());
        System.out.println("[AuthProviderInfo] " + providerUrl + " " + providerToken);
    }
}
