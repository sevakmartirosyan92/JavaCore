package classwork.lessons2451011161718.lesson18;

public class NoWhiteSpaseException extends  RuntimeException{
    public NoWhiteSpaseException() {
    }

    public NoWhiteSpaseException(String message) {
        super(message);
    }

    public NoWhiteSpaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoWhiteSpaseException(Throwable cause) {
        super(cause);
    }

    public NoWhiteSpaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
