package Tuesday;

import java.io.IOException;
import java.io.InputStreamReader;

public class characterstream {

                      public static void main(String[] args)throws IOException
                      {
                        InputStreamReader cin=null;
                        try{
                            cin=new InputStreamReader(System.in);
                            System.out.println("press enter to quit");
                            char c;
                            do{
                                 c=(char) cin.read();
                                 System.out.print(c);
                                 

                                 
                            }while(c!='\n');

                        }
                      finally{
                        if(cin!=null){
                            cin.close();
                        }
                      }
                    }
}
