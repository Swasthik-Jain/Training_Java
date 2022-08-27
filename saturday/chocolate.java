package saturday;

import java.util.Scanner;

public class chocolate {
    public static void main(String[] args)
    {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int array[]=new int[n];
    int count=0;
    for(int i=0; i<array.length;i++)
    {
        array[i]=sc.nextInt();
          if(array[i]!=0)
          {
            System.out.println(array[i]+"");

          }
          else {
             count ++;
          }
    }
    for(int i=0;i<count;i++)
    {
        System.out.println("0"+"");
    }
    
    }

}
