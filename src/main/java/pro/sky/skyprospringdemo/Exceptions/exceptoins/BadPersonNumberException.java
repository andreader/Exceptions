package pro.sky.skyprospringdemo.Exceptions.exceptoins;

public class BadPersonNumberException extends RuntimeException {
    public BadPersonNumberException(String message) {
        super(message);
    }
}
