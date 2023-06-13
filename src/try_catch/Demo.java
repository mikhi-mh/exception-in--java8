package try_catch;

public class Demo {
    public static void main(String[] args) {
        System.out.println("this is start of program");

        int a, b,c;
        a = 5;
        b = 0;

        try{
            c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("this will be error due to divide by zero");
            // this line is not compulsory
        }
        //this line will not be reached
        System.out.println("this is end of program");
    }
}
