package finallyBlock;

public class Main {

    public static void main(String[] args) {

        System.out.println("start");

        try{
            System.out.println("division : " + 10/0);
        }
        catch(Exception e){
            System.out.println();
        }
        //  // now finally is irrelavent
        finally {
            System.out.println("always executed");
        }
        System.out.println("end");
    }
}
