package Task_1;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super("Неправильный логин или пароль");
    }

}