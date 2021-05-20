import java.util.Calendar;

public class Task_0 {
    static String doc = new String("1234-qwe-5678-rty-9a1b");

    static void task5() {
        // Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
        System.out.println();
        System.out.println("Задание 5");

        try {
        if (doc.contains("qwe")) {
            System.out.println("Документ содержит запрошенную подстроку");
        } else {
            throw new Exception("Документ не содержит запрошенную строку");
        }
        }catch (Exception e) {
            System.out.println("Документ не содержит запрошенную строку");

        } finally {
            System.out.println("End");
        }

    }
    static void task6() {
        // Проверить начинается ли номер документа с последовательности 555.
        System.out.println();
        System.out.println("Задание 6");
        try {
            if (doc.startsWith("555")) {
                System.out.println("Документ начинается с запрошенной подстроки");
            } else {
                throw new Exception("Документ не начинается с запрошенной подстроки");
            }
        }catch (Exception e){
            System.out.println("Документ не начинается с запрошенной подстроки");
        } finally {
            System.out.println("End");
        }

    }
    static void task7() {
        // Проверить заканчивается ли номер документа на последовательность 1a2b.
        System.out.println();
        System.out.println("Задание 7");
        try {
            if (doc.endsWith("9a1b")) {
                System.out.println("Документ заканчивается на запрошенную подстроку");
            } else {
                throw new Exception("Документ не начинается с запрошенной подстроки");
            }
        }catch (Exception e) {
            System.out.println("Документ не начинается с запрошенной подстроки");
        } finally {
            System.out.println("End");
        }
    }


    public static void main(String[] args) {
        System.out.println("Номер документа:");
        System.out.println("1234-qwe-5678-rty-9a1b");
        System.out.println("------------------------");
        task5();
        task6();
        task7();
    }
}