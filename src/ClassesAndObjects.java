public class ClassesAndObjects {
    public static void main(String[] args) {



//    метод main - это входная точка программы, где начинается исполнение программы
//    класс это шаблон, экземпляр
//        у класса мб:
//        данные - ПОЛЯ
//        действия, которые он может совершать - МЕТОДЫ



Person person1 = new Person();
//переменная person1 типа данных Person мы ссылаем на новый объект класса Person

//        дадим этой переменной (person1) имя и возраст (поля). Это объект со своим именем и возрастом
//        person1.name = "Роман";
//        person1.age = 50;
        person1.setName("Какое-то имя Person1");
        person1.setAge(17);
//        System.out.println("Меня зовут " + person1.name + ", " + "мне " + person1.age + " лет"); // в 15 уроке переместили в Person
//        создадим еще одного человека и дадим ему имя и возраст
        person1.speak();
        person1.sayHello();




        Person person2 = new Person();
//        person2.name = "Вова";
//        person2.age = 25;
        person2.setName("Какое-то имя Person2");
        person2.setAge(18);
//        System.out.println("Меня зовут " + person2.name + ", " + "мне " + person2.age + " лет"); // в 15 уроке переместили в Person

//        вызовем метод speak(), метод вызывается с параметрами, то есть со скобками


        System.out.println("Выводим значение возраста Person1 в main методе: " + person1.getAge());
        System.out.println("Выводим значение возраста Person2 в main методе: " + person2.getAge());


        person2.speak();
        person2.sayHello();

//        каждый их этих людей является объектом класса Person

//        через точку мы получаем доступ к полям объекта, но так в программировании напрямую не делается, об этом расскажу через 2 урока


        person1.calculateYearsToRetirement();
        person2.calculateYearsToRetirement();

//        значение, полученное от второго метода
        int year1 = person1.calculateYearsToRetirement2();
        System.out.println("Первому человеку до пенсии " + year1 + " лет");

        person1.setNameAndAge("John", 28);
        person1.speak();

        //можно так еще:
        String s2 = "Bob";
        person2.setNameAndAge(s2,42); // то что здесь должно быть String, а username не важно он используется только внутри метода
        person2.speak();

    }
}


//а теперь поместим представление персон в класс Person
// чтобы потом все объекты класса Person могли представляться и не нужно каждый раз писать





class Person {
    private String name;
    private int age;
//    сделали private чтобы не было доступа вне класса

//    теперь создадим гетеры и сеттеры для безопасного доступа из вне
//    благодаря этому мы можем менять внутреннюю переменную name и age на любую другую,
//    но обычный пользователь этого не узнает!
//    в этом основная идея инкапсуляции, по возможности поля дб в пределах только одного класса
//    в котором эти поля задекларированы. и доступ к этим полям должны осуществлять через сеттеры и через геттеры
//    помимо этого мы можем внутри геттеров и сеттеров проверять корректность ввода
//    например проверка не ввёл ли нам пользователь пустое имя на вход
    public void setName(String userName) {
        if (userName.isEmpty()){
            System.out.println("Введено пустое имя");
        } else {
            name = userName;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        age = userAge;
    }

    public int getAge() {
        return age;
    }

    //добавим метод speak. согдасно конвенции методы с маленькой буквы (если 2 и более слов то camelCase).
// классы называем с большой буквы
void speak(){
    for (int i = 0; i < 3; i++) {
        System.out.println("Меня зовут " + name + ", " + "мне " + age + " лет");
    }
}
    // тут методы и поля видят друг друга
    //    теперь у каждого объекта класса Person имеется метод speak
    //        для примера сделали в цикле чтобы вывести 3 раза
    void sayHello(){
        System.out.println("Hello!");
        }


    void calculateYearsToRetirement(){
        int years = 65 - age;
        System.out.println("Лет до пенсии: " + years);
    }

//    метод имеет:
//    void имя (параметры) {тело}
//void - тип возвращаемого значения, пустота или ничто


//теперь переделаем тип возвращаемого значения на int чтобы метод возвращал целое число
    int calculateYearsToRetirement2(){
        int years = 65 - age;
        return years;
    }
//как только программа натыкается на return она сразу же выходит из метода
//то есть после return нет смысла что-то писать


    void setNameAndAge(String username, int userage) {
        //  имя переменной в данном случае username важно только в пределах метода!
        //  в параметрах принимает строку String и в теле метода считает что эта строка называется username
        //  параметров мб сколько угодно и они мб разных типов! через запятую можно даже массив int []
        name = username;
        age = userage;
        //  то есть у каждого объекта его поле name будет равно значению которое поступило в параметры,
        //  которое воспринимается в этом методе как username
    }
    }



