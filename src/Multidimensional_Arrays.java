public class Multidimensional_Arrays {
    public static void main(String[] args) {
        int [] number = {1,2,3};
        System.out.println(number[1]);

        int [][] matrice = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);

        int [] number1 = new int[5]; // напомню как мы декларировали пустой одномерный массив
                                    // и указывали его размер будущий
        String [][] strings = new String[2][3]; // создадим так же двумерный
        // пустой непроинициализированный массив только со строками

        strings[0][1] = "Привет";
        System.out.println(strings[0][1]);

//        двумерный массив это таблица в которой мы обращаемся к каждому элементу указывая его две координаты

//        как вывести двумерный массив на экран в виде таблицы
//        понадобятся два цикла один внутри другого.
//        Один цикл будет проходить по строками, другой будет проходить по столбцам

        for (int i=0; i< matrice.length; i++) {
            for (int j=0; j< matrice.length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }


    }
}
