package rectangle;

public class Main {

    static int area(int length, int breadth) throws Exception{
        if(length<0 || breadth <0){
            throw new Exception();
        }
        return length * breadth;
    }

    static void meth1() throws Exception{
        System.out.println(" area is : " + area(-10,5));
    }

    public static void main(String[] args) throws Exception{
        System.out.println("start");

        try{
            meth1();
        }
        catch(Exception e){

        }

        System.out.println("end of program");

    }
}
