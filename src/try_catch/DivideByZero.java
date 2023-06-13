package try_catch;

public class DivideByZero {
    public static void main(String[] args) {

        System.out.println("this is start of program");

        int n1, n2, n3;
        n1 = 10;
        n2 = 2;
        try{
            n3 = n1/n2;
            System.out.println(n3);
        }
        catch (Exception e){
            System.out.println("custom exception");
        }


        System.out.println("\n\n");
        int a, b,c;
        a = 5;
        b = 0;

        try{
            c = a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e); // System.out.println(e.toString());
            // this line is not compulsory
        }

        System.out.println("see the difference");


        System.out.println("\n\n");
        int x = 10, y= 0, z;
        try{
            z = x / y;
            System.out.println(x);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("\n\n");
        int x1 = 10, y1= 0, z1;
        try{
            z1 = x1 / y1;
            System.out.println(x1);
        }
        catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }


        System.out.println("\n\n");
        int x2 = 10, y2= 0, z2;
        try{
            z2 = x2 / y2;
            System.out.println(x2);
        }
        catch (Exception e){
            System.out.println(e.getStackTrace());
        }

        System.out.println("this is end of program");

    }
}
