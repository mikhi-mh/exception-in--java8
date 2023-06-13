package rectangle;

class AnotherException2 extends Exception{

        public AnotherException2(String msg){
            super(msg);
        }
//    @Override
//    public String toString(){
//        return " this is my custom exception ...dimensions should not be negatives";
//    }


}
public class Main3 {

    static int area(int length, int breadth) throws AnotherException2{
        if(length<0 || breadth <0){
            throw new AnotherException2("dimensions should not be negatives");
        }
        return length * breadth;
    }

    static void meth1() throws AnotherException2{
        System.out.println(" area is : " + area(-10,5));
    }

    public static void main(String[] args) throws AnotherException2{
        System.out.println("start");

        try{
            meth1();
        }
        catch(AnotherException2 e){
            System.out.println(e);
        }

        System.out.println("end of program");

    }
}
