/**
 * Создать класс, в котором будет статический метод.
 * Этот метод принимает на вход три параметра:
 *   login
 *   password
 *   confirmPassword
 * Все поля имеют тип данных String.
 * Длина login должна быть меньше 20 символов и не должен содержать пробелы.
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен содержать хотя бы одну цифру.
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
 * WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * Метод возвращает true, если значения верны или false в другом случае.
 */
package Task_1;

import java.util.Scanner;

public class Authorization {
    static Scanner sc = new Scanner(System.in);
    static String login;
    static String password;
    static String confirmPassword;
    static String passwordPattern = "[a-zA-Z ]*\\d+.*";

    private static void checkData(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (correctLogin(login)) {
            System.out.println("Логин - " + login);
        } else {
            throw new WrongLoginException();
        }

        if (correctPassword(password)) {
            System.out.println("Ваш пароль - " + password);
        } else {
            throw new WrongPasswordException("Неправильный логин или пароль");
        }

        if (password.equals(confirmPassword)) {
            System.out.println("Пароль подтвержден");
        } else {
            throw new WrongPasswordException("Пароль не подтвержден: Несовпадение пароля.");
        }
    }

    private static boolean correctLogin(String login) {
        return login.length() <= 20 || !login.contains(" ");
    }

    private static boolean correctPassword(String password) {
        return password.length() <= 20 && !password.contains(" ") && password.matches(passwordPattern);
    }

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        System.out.println("Введите логин(Имя пользователя): ");
        login = sc.nextLine();
        System.out.println("Введите пароль: ");
        password = sc.nextLine();
        System.out.println("Подтвердите пароль: ");
        confirmPassword = sc.nextLine();

        checkData(login, password, confirmPassword);
    }
}