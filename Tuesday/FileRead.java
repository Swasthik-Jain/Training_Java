package Tuesday;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
    public static void main (String[] args) throws IOException
    {
        File file=new File("hello1.txt");
        //createsth file
        FileWriter writer = new FileWriter(file);
        //writes the content to the file
        writer.write("this\n is \n an \n example\n");
        writer.flush();
        writer.close();
        //creates a filereader object
        FileReader fr=new FileReader(file);
        char[] a=new char[50];
        fr.read();//reads the content to the array
        for(char c:a)
           System.out.print(c);//prints the character one by one
           fr.close();



     }
}

