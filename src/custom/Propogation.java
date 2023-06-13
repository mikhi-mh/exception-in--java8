package custom;

public class Propogation {

    public static void main(String[] args) {

        System.out.println("this is start of the program");

        fun1(10,2);
    }

    static void fun1(int a, int b){
        fun2(a,b);
    }

    static void fun2(int x, int y){
        try{
            System.out.println(x/y);
            throw new OtherException();
        }
        catch(OtherException e){
            System.out.println();
        }
    }
}

class OtherException extends Exception{
    public String toString(){
        return "u cant divide by zero";
    }
}