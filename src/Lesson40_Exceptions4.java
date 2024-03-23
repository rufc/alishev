import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Lesson40_Exceptions4 {
    public static void main(String[] args) {
        //        на этом уроке покажу то, что забыл показать на предыдущих занятиях.
        try {
            run();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);  //также можем обрабатывать несколько разных исключений несколькими catch блоками
        }


//        multicatch - когда у нас несколько типов исключений выбрасывается и мы хотим их все обрабатывать одинаково
        try {
            run();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }

//        еще вариант елси ловишь в catch Exception, то последующий блок не имеет смысла,
//        потому что он класс-родитель всех исключений в Java, они все наследуются от Exception:
        try {
            run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } //далее выбрасывать catch (любой Exception) не имеет смысла


    }
    //        Первое это, то что метод может выбрасывать сколько угодно разных исключений
    //        и если будете вызывать метод в других методах, то их нужно будет выбрасывать или обрабатывать во всех вызывающих методах
    public static void  run() throws IOException, ParseException, IllegalArgumentException { // выбросили несколько разных исключений в методе

    }
}
