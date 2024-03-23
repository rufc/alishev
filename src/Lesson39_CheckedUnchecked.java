import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson39_CheckedUnchecked {
    public static void main(String[] args) {
        // Checked Exception (Compile time exception) = исключительные случаи в работе программы, которые нужно обрабатывать
        // Unchecked Exception (Runtime exception) = ошибка в работе программы,
        // например нельзя делить на 0 или например попытаемся вызвать метод класса String на переменную содержащую null
        // или например попытаемся посмотреть несуществующий индекс элемента в массиве, то есть вышли за пределы массива (ArrayIndexOutOfBoundsException)
        // и эти ошибки бессмысленно обрабатывать, их нужно исправлять

        // До этого мы имели дело с Checked Exception

        File file = new File("src//testInt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("message");
        }
    }
}
