public class Lesson25 {
    public static void main(String[] args) {
        // наследование
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        System.out.println("--------------------");

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
//        так как Dog это Animal, то он наследует все методы Animal

        dog.bark();

        dog.showName();

    }
}
