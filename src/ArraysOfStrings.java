public class ArraysOfStrings {
    public static void main(String[] args) {
    int[] numbers = new int[5];     //создали 5 пустых ячеек
    numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] strings = new String[3];

//        все примитивные типы данных пишутся с маленькой буквы
//        все ссылочные типы данных пишутся с большой буквы, так как являются классами
//        по конвенции Java принято писать все классы с большой буквы

//        проинициализируем
strings[0] = "привет";
strings[1] = "пока";
strings[2] = "джава";

for (int i=0; i<strings.length; i++){
    System.out.println(strings[i]);
}

        System.out.println();

for(String string:strings){     //тип данных _пробел_ имя переменной:массив
    System.out.println(string);
}

int[] numbers1 = {1,2,3}; // создали массив из 3 чисел
        int sum = 0;
        for(int x:numbers1){
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0; // когда мы создаём переменную int мы выделяем 32 бита памяти
//        теперь задекларируем переменную String
        String s; // не знаем сколько памяти выделять под строку, так как букв может быть разное количество
//        в данном случае мы выделили память ТОЛЬКО под ссылку, наппример адрес дома, а не сам дом
        // данная переменная указывает на null

//        а вот здесь уже под строку:
        String s1 = "asdf";
        String s2 = null; // null - это пустота, ничто
    }
}