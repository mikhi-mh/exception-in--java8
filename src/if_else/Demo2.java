package if_else;

public class Demo2 {

    public static void main(String[] args) {
        System.out.println("Hello World !");
        System.out.println("this is start of program");

        int a, b,c;

        a = 5;
        b = 0;
        // not able to use if()
        c = a/b;
        System.out.println(c);
        //this line will not be reached
        System.out.println("this is end of program");
    }
}
