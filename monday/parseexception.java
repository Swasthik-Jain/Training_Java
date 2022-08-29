package monday;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class parseexception {
    public static void main(String[] args)
    {
          DateFormat format=new SimpleDateFormat("mm,dd,yyyy");
          try{
            format.parse("01,,2010");

          }catch(ParseException e)
          {
              System.err.println("parseexception caught!");
              //e.printStackTrace();
          }
    }
    
}
