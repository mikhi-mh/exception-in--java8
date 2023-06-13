package try_catch;

public class ArrayOutOfBounds {

    public static void main(String[] args) {
        System.out.println("Start");

        int[] arr = {4,2,3,0,5};
        try{
            int c = arr[0] / arr[1];
            System.out.println("division is : " + c);

            System.out.println(arr[5]);
        }
        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("\n\n");
        int[] arr2 = {4,2,3,0,5};
        try{
            int c = arr2[0] / arr2[1];
            System.out.println("division is : " + c);

            System.out.println(arr2[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }


        System.out.println("\n\n");
        int[] arr3 = {4,2,3,0,5};
        try{
            int c = arr3[0] / arr3[3];
            System.out.println("division is : " + c);

            System.out.println(arr2[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

    }
}
