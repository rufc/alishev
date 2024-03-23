import java.util.Scanner;

public class Lesson38_Exception2_ScannerExcetion extends Exception{ //создадим свой Exception если его нет в списке стандартных
        public Lesson38_Exception2_ScannerExcetion(String description){ //создали конструктор и в аргументы передалим строку,
            // потому что такой конструктор определён в родительском классе Exception
            super(description);
        }
}
