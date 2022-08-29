package monday;

public class exparth{
    public static void main(String[] args){
       try{ 
        int result=30/0;
       }
    catch(ArithmeticException e){
        System.err.println("ArithmeticException caught!");
        //e.printStackTrace();
    }


    }
}






    