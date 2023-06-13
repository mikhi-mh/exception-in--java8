package custom;

public class Main {


    static void f1() throws MyCustomException{
        f2();
    }



    static void f2() throws MyCustomException{
        throw new MyCustomException();
    }
    public static void main(String[] args) {

        System.out.println("this is start");


        try{
            f1();
        }
        catch(Exception e){
            System.out.println(e);
        }


        System.out.println("this is middle");

        fun1();

        System.out.println("this is end");
    }

    public static void fun1(){
        try{
            throw new CutomException();
        }
        catch(CutomException e){
            System.out.println(e);
        }
    }
}
