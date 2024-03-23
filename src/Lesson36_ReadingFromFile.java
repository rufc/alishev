import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson36_ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
//        укажем путь к нашему файлу
//        File file = new File(path);

//        String path = "/c/test"; //в windows слэш влево, в linux и macOS вправо
////        делегируем Java указывать разделитель в зависимости от системы

//        String separator = File.separator;
//        String path = separator + "c:" + separator + "test.txt";
//        File file = new File(path);

//        Важный совет ребятам у которых win10x64. separator работает.
//        Вам при вводе нужно начинать с диска и заканчивать названием.txt
//        Вот так:
//        separator + "C:" +separator + "Users" +separator +"Дмитрий" + separator +"Desktop" + separator + "test.txt"
//        В любых других случаях путь к файлу теряется

//        если файл в корне проекта, то гораздо проще:
        File file = new File("src\\testString"); //в mac и linux просто имя файла

        Scanner scanner = new Scanner(file); //нажали автоматически добавить исключение, если файл не был найден
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close(); //важно в конце закрывать scanner чтобы освобождались ресурсы и поток оставался открытым



//        другой пример считывания чисел, например считать 3 числа через пробел и поместить их в переменные типа int
//        String path2 = separator + "c:" + separator + "testint.txt";
//        File file2 = new File(path2);

        //        если файл в корне проекта, то гораздо проще:
        File file2 = new File("src\\testInt"); //в mac и linux просто имя файла

        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String [] numbersString = line.split(" ");

//        для Java эти числа все равно являются строками для этого переведём их числа методом parseInt
        int[] numbers = new int[3];
        int counter = 0;
        for (String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers)); // чтобы вывести массив надо использовать toString, без него получим массив как адрес ячейки в памяти
        scanner2.close();

    }
}
