package exceptionhandling;

public class ChainedExceptionExample {

    protected static void nullPointerGiver(){
        try{
            String str = null;
            System.out.println(str.length());
        }catch (NullPointerException npe){
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {
        try{
//            System.out.println(10/0);
            nullPointerGiver();
        }catch (ArithmeticException ae){
            ae.printStackTrace();
        }
    }
}
