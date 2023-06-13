package ThrowThrows;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("this is start");

        try{
            foo2();
        }
        catch(Exception e){
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
            System.out.println(e);
        }



        System.out.println("this is end");

    }

    static int foo(){
        return 10/0;
    }

    static void foo1(){
        foo();
    }

    static void foo2(){
        foo1();
    }
}
