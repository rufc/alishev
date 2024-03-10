package Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("John");
        Info info1 = new Animal(1); // мы можем так делать потому что классы Animal и Person реализуют интерфейс Info
        Info info2 = new Person("Bob");

        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();

        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);

        //также мы можем наши объекты класса Animal и Person поместить в качестве аргументов поместить в наш outputInfo
        //только потому что объекты этих классов реализует интерфейс Info
        outputInfo(animal1);
        outputInfo(person1);
    }
    public static void outputInfo(Info info){ //этот метод принимает в качестве аргументов на вход нечто, что реализует имплементирует интерфейс Info
            info.showInfo(); //теперь он может действовать на любом из объектов класс которого реализует интерфейс Info
    }
}

//интерфейсы нужны для того, чтобы мы были уверены, что у каких-то классов есть определенные методы