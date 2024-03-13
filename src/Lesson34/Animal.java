package Lesson34;

public class Animal {
    private int id; // создали поле целочисленное id

    public Animal(){
    }

    public Animal(int id){ //создадим конструктор, который на вход будет принимать какое-то число, например id
        this.id = id; // присвоим id тот id который поставляется в качестве аргументов
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public String toString(){ // переопределили метод toString чтобы он возвращал id животного, строкой
        return String.valueOf(id); // конвертируем целое число в строку
    }
}
