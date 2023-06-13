package try_catch;

public class NestedTryCatch {

    public static void main(String[] args) {


        System.out.println("\n\n");
        int[] arr3 = {4,2,3,0,5};
        try{
            int c = arr3[0] / arr3[3];
            System.out.println("division is : " + c);

            try{
                System.out.println(arr3[2]);
            }

            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

            System.out.println("end of first try");
        }

        catch (ArithmeticException e){
            System.out.println("body of outer " + e);
        }
    }
}
