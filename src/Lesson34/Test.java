package Lesson34;

import java.util.ArrayList;
import java.util.List;

public class Test {
//    Wildcards (Generics)
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>(); //в этом листе могут храниться только объекты класса Animal
        listOfAnimal.add(new Animal(1)); // добавим в лист Animals еще животное
        listOfAnimal.add(new Animal(2)); // добавим в лист Animals еще животное

        List<Dog> listOfDogs = new ArrayList<>(); //создадим еще один лист объектов класса Dog
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal); //запустим код и у нас появились id родителей
        test(listOfDogs);
    }

    private static void test(List<? extends Animal> List) { // на вход будет принимать лист Animals.
        // Если поставим вопрос вместо Animal в <>, то есть уберем какой-то конкретный тип,
//        то при вызове метода test(listOfDogs); ошибка пропадает.
//        Знак ? говорит, что в этот метод ты можешь передать лист любых объектов
//        но теперь появилась ошибка ниже, потому что содержимое класса List мы не можем рассматривать как Animal
//        то есть содержимое объекта List (который за вопросом выше) будет рассматриваться как массив объектов потому что сюда мы можем передать любой объект
//                и у всех этих объектов будет один общий родитель - объект класса Object
//        и в теле мы можем рассматриваь методы определенные у класса Object
//        что же если мы хотим вызывать методы, определённые у Animal. Для этого определим у Animal метод eat
//        Соответственно у класса Dog теперь тоже есть этот метод, потому что он унаследовался.
//        Теперь добавим extends Animal чтобы дать понять Java, что мы хотим в метод тест листы Animal или любого другого класса,
//        который наследуется от Animal
        for (Animal animal : List) { //выведем на экран каждое животное на листе
            animal.eat();
        }
    }
    еще можно делать вот так:
//    private static void test(List<? super Animal> List) таким образом даём понять Java, что все элементы либо класса
//    Animal либо выше
}

/*
У нас иерархия наследования такая:
Object
Animal
Dog

при extends мы хотим видеть в листе который подаем в качестве аргументов Animal и Dog (Animal и все потомки этого класса)
при super мы хотим видеть в листе который подаем в качестве аргументов Object (классы выше Animal в иерархии наследования),
то есть мы хоти видеть всех родителей класса Animal
 */