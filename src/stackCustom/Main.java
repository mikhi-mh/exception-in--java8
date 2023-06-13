package stackCustom;

public class Main {

    public static void main(String[] args) {


        Mystack mystack = new Mystack(5);

        try{
            mystack.popData();
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("now add");

        try{
            mystack.pushData(10);
            mystack.pushData(10);
            mystack.pushData(10);
            mystack.pushData(10);
            mystack.pushData(10);
            mystack.pushData(10);
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("end");

    }
}
