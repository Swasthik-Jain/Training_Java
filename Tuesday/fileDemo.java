package Tuesday;

import java.io.File;

public class fileDemo {
    public static void main(String[] args)
    {
        File f=null;
        String[]strs={"test1.txt","text2.txt" };
        try{
            //for each string  in string array
            for(String s:strs)
            {
                f=new File(s);
                f.createNewFile();//create new file
                boolean bool=f.canExecute();//true if the file is 
                String a=f.getAbsolutePath();//finfd the  absolute path
                System.out.println(a);//prints absolute path
                System.out.println("is excuteable: "+bool);
            }
        }catch(Exception e)
        {  
            e.printStackTrace();

        }
    }
    
}
