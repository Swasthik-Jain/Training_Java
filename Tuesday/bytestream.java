package Tuesday;


import java.io.*;

public class bytestream {
     public static void main(String[] args) throws IOException{

     
             FileReader in=null;
             FileWriter out=null;
             try{
             in=new FileReader("C:\\Users\\swast\\sample\\Tuesday\\input.txt");
             out=new FileWriter("C:\\Users\\swast\\sample\\Tuesday\\output.txt");
             int c;
             while((c=in.read())!=-1)
             {
                     out.write(c);
             }

            }  
            finally{
                if(in!=null){
                    in.close();
            
                }
                if(out!=null){
                    out.close();
            
                }

            }
            System.out.println("sucess");
     }
}