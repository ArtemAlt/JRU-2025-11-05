package exception;

public class DuplicateException extends RuntimeException {
    private final String MESSAGE = "Create not possible, because object already exist";

}