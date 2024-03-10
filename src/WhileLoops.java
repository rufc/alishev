public class WhileLoops {
    public static void main(String[] args) {
        boolean t = 5==5;
        System.out.println(t);

        int value = 0;
        boolean x = value>5;
        System.out.println(x);

        while(value < 5){
            System.out.println("Hello " + value);
            value = value + 1;
        }
    }
}
