package rectangle;

class AnotherException extends Exception{

    @Override
    public String toString(){
        return " this is my custom exception ...dimensions should not be negatives";
    }
}
public class Main2 {

    static int area(int length, int breadth) throws AnotherException{
        if(length<0 || breadth <0){
            throw new AnotherException();
        }
        return length * breadth;
    }

    static void meth1() throws AnotherException{
        System.out.println(" area is : " + area(-10,5));
    }

    public static void main(String[] args) throws AnotherException{
        System.out.println("start");

        try{
            meth1();
        }
        catch(AnotherException e){
            System.out.println(e);
        }

        System.out.println("end of program");

    }
}
