import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String s = new String("dgdd");
        Scanner x = new Scanner(System.in); // System.in - это стандартный поток входных данных
        System.out.println("Введите что-нибудь");
        String string = x.nextLine(); // у объекта класса Scanner вызвали метод который считает одну строку с клавиатуры. Строка продолжается до тех пор пока не нажмем Enter.
        System.out.println("Вы ввели: " + string);
        System.out.println("Введите число");
        int n = x.nextInt();
        System.out.println("Вы ввели число: " + n);
    }
}
//все классы пакета java.lang импортируются по умолчанию даже если его не импортировать,
// поэтому String работает без проблем в отличие от Scanner, который сработает при импорте java.util
//еще раз Scanner это класс, а с помощью new мы создаем новый объект класса Scanner и теперь x ссылается на объект класса Scanner
