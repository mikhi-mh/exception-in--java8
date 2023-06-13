package finallyBlock;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("start");

        try{
            System.out.println("division : " + 10/0);
        }
        // we hav enot written catch exce
        // no exception handling still finally gets executed

        finally {
            System.out.println("always executed");
        }
        System.out.println("end");
    }
}
