package unchecked;

public class UncheckedChecked {

    static void f1() {
        System.out.println(10/0);
    }

    static void f2(){
        f1();
    }

    static void f3(){
        f2();
    }
    public static void main(String[] args) {
        System.out.println("start");

       // f3();


        System.out.println("\n\n other examples");

        fun3();
        System.out.println("end");





    }


    static void fun1(){
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
           System.out.println();
            //e.printStackTrace();
        }
    }

    static void fun2(){
        fun1();
    }

    static void fun3(){
        fun2();
    }









}
