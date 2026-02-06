package email;

public class EmailDto {
    private final String to;
    private final String from;
    private final String subject;
    private final String body;
    private final String title;
    private final String attachment;
    private final String copy;

    public EmailDto(String to, String from, String subject, String body,
                    String title, String attachment, String copy) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.title = title;
        this.attachment = attachment;
        this.copy = copy;
    }

    public String getTo() {
        return to;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public String getAttachment() {
        return attachment;
    }

    public String getCopy() {
        return copy;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("To: ").append(to).append("\n");
        sb.append("From: ").append(from).append("\n");
        sb.append("Body: ").append(body).append("\n");
        if (title != null) {
            sb.append("Title: ").append(title).append("\n");
        }
        return sb.toString();
    }
}
