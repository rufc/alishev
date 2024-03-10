public class Animal {
    String name = "Some animal"; //если задекларировать как private, то в классе наследнике доступ к этой переменной не получим
    public void eat() {
        System.out.println("I am eating");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }
}