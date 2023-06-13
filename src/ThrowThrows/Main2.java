package ThrowThrows;

public class Main2 {

    public static void main(String[] args){

        System.out.println("this is start");

//        try{
//            foo2();
//        }
//        catch(Exception e){
//            System.out.println(e.getLocalizedMessage());
//            e.printStackTrace();
//            System.out.println(e);
//        }

        foo2();


        System.out.println("this is end");

    }

    static int foo(){
        return 10/0;
    }

    static void foo1(){
        foo();
    }

    static void foo2(){

                try{
            foo1();
        }
        catch(Exception e){
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("end of foo2");
    }
}
