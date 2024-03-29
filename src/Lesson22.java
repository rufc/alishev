public class Lesson22 {
    public static void main(String[] args) {
//        Test.CONSTANT = 10;
        final int X = 10;
        System.out.println(X);
//        X = 5; нельзя присвоить значение переменной final
    }

//final - переменная которая не может изменяться.
//то есть эта переменная получает какое-то значение и в дальнейшем не может изменить своё значение.
//другими словами final мы обозначаем константу

class Test {
    public static final int CONSTANT = 0; // не обязательно называть CONSTANT, но по традиции все константы пишутся ПРОПИСНЫМИ буквами
//обычно переменные final бывают и static потому что всегда имеет одно значение
// и нет смысла для каждого объекта заводить отдельную переменную
//если переменная final будет не static, то мы будем иметь дело с растратой памяти,
// потому что одно и то же значение будет копироваться для каждого объекта
//    поэтому делаем одну переменную static чтобы она была одна и делилась между всеми объектами
//    теперь так как мы сделали переменную static мы должны её инициализировать не через объект, а через имя класса
//    то есть мы проинициализировали переменную через конструктор, то мы инициализируем её когда создаём новый объект
//            и передаём значения этой переменной в параметры
//    если у нас переменная статическая, то мы её инициализируем таким образом:
//    Test.CONSTANT = 10; но выйдет ошибка так как мы не можем поменять значение константе

//    поэтому закомментировали конструктор

//    public Test(int CONSTANT){
//        this.CONSTANT = CONSTANT;
//    }
    // создали конструктор в параметры которого мы будем передавать переменную CONSTANT
    // и этой констант мы назначим то значение которое придёт в параметрах конструктора

//    public void setCONSTANT(int x){
//        this.CONSTANT = x;
    } // здесь мы попытаемся изменить нашу константу, но не можем назначить ей какое-то другое значение
}      // поэтому сеттеры в контексте констант мы создать не можем
// потому что один раз назначив значение константе в конструкторе, создавая объект Test, мы не можем его изменить в дальнейшем


//final нужно использовать тогда, когда мы хотим иметь значение в программе, которое не будет изменяться в ходе выполнения программы