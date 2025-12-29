public class InvalidEmailFormatException extends RuntimeException {
    public InvalidEmailFormatException(String wrongEmailFormat) {
        super(wrongEmailFormat);
    }
}
