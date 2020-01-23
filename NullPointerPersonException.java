package Exception;

/**
 * @ClassName NullPointerPersonException
 * @Description TODO
 * @Auther danni
 * @Date 2019/10/25 23:01]
 * @Version 1.0
 **/

public class NullPointerPersonException extends Throwable {
    public NullPointerPersonException() {
    }

    public NullPointerPersonException(String message) {
        super(message);
    }

    public NullPointerPersonException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullPointerPersonException(Throwable cause) {
        super(cause);
    }

    public NullPointerPersonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
