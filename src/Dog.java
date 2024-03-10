public class Dog extends Animal{
//extends Animal означает что теперь Dog наследуется от класса Animal, класс Animal является родителем класса Dog
//    и теперь у собаки есть методы sleep и eat

//    переопределим метод родителя Animal о том как собака кушает:
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void bark(){
        System.out.println("I am barking");
    }

    public void showName(){
        System.out.println(name);
    }
}
