import Forest.Squirell;
import Forest.Tree;
import java.util.Scanner;

//        урок 27 пакеты
public class Test {
    public static void main(String[] args) {
        Tree tree1 = new Tree(); // компилятор JVM не видит класс Tree -> надо импортировать класс Tree (пакет.класс)
        Squirell squirell1 = new Squirell(); // можно нажать на ошибку alt+enter и автоматически импортировать класс
        Scanner scanner = new Scanner(System.in);
//        В пакете мб еще пакет, например import java.util.Scanner (пакет.пакет.класс)
//        если в пакете много классов, то их можно импортировать все *: import Forest.*; или import java.util.*;

    }
}
