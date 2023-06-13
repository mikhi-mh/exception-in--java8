package stackCustom;

class OverFlowException extends Exception{
    @Override
    public String toString(){
        return "Stack is full ---> Stack-overFlow exception";
    }
}

class UnderFlowException extends Exception{

    @Override
    public String toString(){
        return "Stack is Empty ---> Stack-underFlow exception";
    }
}

public class Mystack {

    int[] data;
    int indexPointer = -1;

    public void pushData(int myData) throws OverFlowException{

        if(indexPointer == data.length-1){
            throw new OverFlowException();
        }

        data[++indexPointer] = myData;
    }

    public int popData() throws UnderFlowException{
        if(indexPointer == -1){
            throw new UnderFlowException();
        }

        return data[indexPointer--];

    }
    public Mystack(){

    }

    public Mystack(int size){
        data = new int[size];
    }
}
