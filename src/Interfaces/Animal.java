package Interfaces;

public class Animal implements Info{   //implements Info означает что класс обязан реализовывать в себе метод showInfo()
                                        //любой класс может реализовывать любое количество интерфейсов, через запятую,
                                        //но класс может наследовать (extends) только один другой класс
                                        //если класс реализует какой-то интерфейс, то он обязан иметь методы этого интерфейса
    public  int id;

    public Animal(int id){
        this.id = id;
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is "+ this.id);
    }
}
