package email;

public class EmailService {
    private final String host;
    private final int port;

    public EmailService(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void sendEmail(EmailDto dto) {
        System.out.println("Sending email " + dto.getInfo());
    }
}
