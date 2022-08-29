package monday;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class illegalstateeception {
         public  static void main (String[] args)
         {
            List<Integer> inList=new ArrayList<>();
            for(int i=0;i<10;i++)
            {
                inList.add(i);

            }
            Iterator<Integer> inListIterator=inList.iterator();
            try{
                inListIterator.remove();
            }
            catch(IllegalStateException e){

                System.err.println("illegalStateException caught!");
               // e.printStackTrace();
            }
            }
        
         }

