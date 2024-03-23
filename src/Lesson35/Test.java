package Lesson35;

class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class OtherAnimal extends Animal {
    public void eat(){
        System.out.println("Other animal is eating");
    }
}

interface AbleToEat {
    public void eat();
}

class Animal3 implements AbleToEat {
    @Override
    public void eat() {
        System.out.println("Eating");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        OtherAnimal otherAnimal = new OtherAnimal();
        otherAnimal.eat();

        Animal animal2 = new Animal() { //объект который здесь создается это не Animal, это наследник класса Animal
            public void eat(){
                System.out.println("Other animal2 is eating");
            }
        };
        animal2.eat();

        AbleToEat ableToEat = new Animal3();
        ableToEat.eat();


        AbleToEat ableToEat1 = new AbleToEat() { // если хотим создать объект класса только на один раз
            @Override
            public void eat() {
                System.out.println("Someone is eating");
            }
        };

        ableToEat1.eat();

    }
}