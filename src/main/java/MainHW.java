import java.util.ArrayList;

public class MainHW {
     int n;
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает
    // true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    // HW 3.2.Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов.
    // Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь
    // админскими правами. Протестируйте данную функцию.

    public Boolean EventOrNot(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public  Boolean isInInterval(int n) {
        ArrayList array = new ArrayList();

        for (int i = 25; i < 100; i++) {
            array.add(i);
        }

        if (array.contains(n)) {
            return true;
        } else {
            return false;
        }
    }
}
