import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson37_Exceptions1 {
    public static void main(String[] args) {
        File file = new File("путь к файлу"); //    src//testInt
        try {
            Scanner scanner = new Scanner(file);    //alt+enter на Scanner и выбираем два варианта исключений стандартный и свой
            System.out.println("Здесь в блоке try если не указан правильный путь к файлу, то код не выполнится и перейдёт к catch.");
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("Файл не найден");
        }
        System.out.println("Здесь код после блока try catch и в случае если исключение обработано или если верно указан путь к файлу, то код корректно выполнится.");

        try {
            readFile(); // Здесь тоже нужно вызвать исключение, добавили в сигнатуру метода main это исключение либо try catch
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }

    }

    // вообще хорошо исключения обрабатывать так, чтобы пользователю было понятно и не страшно, а не стандартный красный текст

    public static void readFile() throws FileNotFoundException {
        File file2 = new File("путь к файлу");
            Scanner scanner = new Scanner(file2);
    }

}
