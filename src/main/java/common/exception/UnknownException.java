package common.exception;;

public class UnknownException extends RuntimeException {
    public UnknownException() {
        super("ERROR: Something went wrowng!");
    }
}
