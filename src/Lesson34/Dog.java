package Lesson34;

public class Dog extends Animal{
//    Мы создали свой конструктор в классе Animal => дефолтный конструктор в Animal, который не принимает по умолчанию
//    никаких аргументов он у нас пропал, потому что мы создали свой конструктор
//    и здесь так как в классе Dog не определён свой конструктор, то по умолчанию здесь пустой конструткор Dog,
//    который на вход не принимает аргументов. и этот конструктор по умолчанию вызывает конструктор родителя:
//    public Dog(){
//        super();
//    }
//    но у родителя уже нет конструктора по умолчанию => либо здесь в super() что-то передавать родителю, например id
//    либо вручную создать дефолтный конструктор в Animal, который на вход не принимает ничего, тогда мы можем убрать код выше
}
