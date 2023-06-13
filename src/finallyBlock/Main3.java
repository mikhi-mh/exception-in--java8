package finallyBlock;

public class Main3 {

    static void foo(){

        foo2();

    }

    static void foo2(){

        try{
            System.out.println("division : " + 10/0);
        }
        // we hav enot written catch exce
        // no exception handling still finally gets executed
        catch (Exception e){
            System.out.println();
        }
        finally {
            System.out.println("always executed");
        }
    }
    public static void main(String[] args) {

        System.out.println("start");

        foo();

        System.out.println("end");
    }
}
