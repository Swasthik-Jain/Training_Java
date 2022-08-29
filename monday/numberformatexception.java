package monday;

public class numberformatexception {
     public static  void main(String[] args)
     {
        String str1="100ABCD";
        try{
            int x=Integer.parseInt(str1);
        
        }catch(NumberFormatException e)
        {
     System.err.println("numberformatexception caught!");
      // e.printStackTrace();
       }
    }
 }
