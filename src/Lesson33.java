import java.util.ArrayList;
import java.util.List;

//Параметризация - Generics. Появились в 5-й версии Java.
//Класс ArrayList реализует такую концепцию как динамический массив - массив, который сам расширяется при добавлении новых элементов в него
public class Lesson33 {
    public static void main(String[] args) {
        List animals = new ArrayList(); // просто знайте, что есть такой класс ArrayList, есть интерфейс List -
        // это стандартные класс и интерфейс в пакете Java.util
        Animal5 ourAnimal = new Animal5();
        animals.add("cat"); // Метод с помощью которого мы можем добавить объект до тех пор, пока есть память на компьютере.
        // Это выгодно отличает ArrayList от массива
//    Потому что размер массива мы должны объявить при создании массива. Здесь же лист расширяется динамически.
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);
//        String animal = animals.get(1); // выдаст ошибку потому что элемент класса list хранит в себе объекты класса object
        //в этом arraylist могут храниться любые объекты, то есть объекты любых классов
        // и поэтому когда мы достаем объект из этого листа, нам нужно downcast'ить.
//        И чтобы получить объект класса String из этого ArrayList нужно сделать downcast - спуститься вниз по иерархии наследования:
        String animal = (String) animals.get(1);
        System.out.println(animal);
//        но каждый раз доставать объект downcast'ить объект из динамического массива неудобно,
//        поэтому в java 5 был придуман механизм параметризации классов
////////////////////////// всё, что выше это как было до появления java 5 //////////////////////////

////////////////////////// ниже с появлением Generics: //////////////////////////
List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
//в этом arraylist могут храниться только строки, только объекты класса String, больше ничего
//        И разница в том, что теперь нам не нужно использовать downcast'инг, это гораздо удобнее:
        String animal2 = animals2.get(1);

       /////////////// С появлением Java 7 /////////////////
    List<String> animals3 = new ArrayList<>(); // справа можно не указывать параметры параметризации (<String>)


    }

}
class Animal5{

}