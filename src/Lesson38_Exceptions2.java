import java.io.IOException;
import java.util.Scanner;

public class Lesson38_Exceptions2 {
    public static void main(String[] args) throws Lesson38_Exception2_ScannerExcetion { //throws IOException
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(scanner.nextLine());


//            if (x != 0) {
//                throw new IOException();
//            }


//            либо


//            if (x != 0) {
//                try {
//                    throw new IOException();
//                } catch (IOException e) {
//                    System.out.println("Пользватель ввёл что-то кроме нуля");
//                }
//            }


//            свой Exception:

            if (x != 0) {
                    throw new Lesson38_Exception2_ScannerExcetion("Пользователь ввёл что-то кроме нуля");
                    //передали в аргументы описание, вывод будет красным (в StackTrace), как в стандартных конструкторах
            }
        }
    }
}
