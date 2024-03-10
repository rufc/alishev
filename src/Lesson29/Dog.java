package Lesson29;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");    //переопределили метод eat() класса Animal
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
}
