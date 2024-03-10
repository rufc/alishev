public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Tom");
        human1.setAge(19);
        human1.getInfo();
    }
}

class Human{
    String name;
    int age;

//    public void setName(String myName) {
//        name = myName;
//    }

//    чтобы логично назвать name и не было непонимания у java можно использовать this
//    еще раз чтобы внутри метода в классе обратиться к переменной класса нужно написать this.поле(имя атрибута класса)
//    поле класса и атрибут класса это синонимы
//    так обычно делают в set-методах
//    и на будущее this.name вызывает именно объект, то есть human1.name или human1.age,
//    то есть this это способ обратиться внутри класса к объекту этого класса
public void setName(String name) {
    this.name = name;
}

// то же самое сделаем с age
    public void setAge(int age) {
        this.age = age;
    }

//    public void setAge(int myAge) {
//        age = myAge;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo(){
        System.out.println(name + ", " + age);
    }
}