import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
//        if (age==10){
//            System.out.println("Ты учишься в школе");
//        } else if (age ==18){
//            System.out.println("Ты закончил школу");
//        }
        // итд здесь у нас получается много if поэтому удобнее операором switch который нужен когда много условий
    switch(age){
        case 0 :
            System.out.println("Ты родился");
            break; // если не поставить то будут выполняться все остальные кейсы
        case 7 :
            System.out.println("Ты пошёл в школу");
            break;
        case 18 :
            System.out.println("Ты закончил школу");
            break;
        default :
            System.out.println("Ни одно из предыдущих условий не подошло");
            // если ни один из предыдущих не выполнился
    }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Введи возраст строкой");
        String ageS = scanner2.nextLine();

        switch(ageS){
            case "ноль" :
                System.out.println("Ты родился");
                break; // если не поставить то будут выполняться все остальные кейсы
            case "семь" :
                System.out.println("Ты пошёл в школу");
                break;
            case "восемнадцать" :
                System.out.println("Ты закончил школу");
                break;
            default :
                System.out.println("Ни одно из предыдущих условий не подошло");
                // если ни один из предыдущих не выполнился
        }


    }
}
