package monday;
import java.util.*;
public class garage{ 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       // System.out.println("enter the size");
        //int n;
        //n=sc.nextInt();

        //sc.nextLine();
          String str=sc.nextLine();
        String[] array=str.split(" ");
            int arr[]=new int[2];
           //for(int i=0;i<n;i++)
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.valueOf(array[i]);


        }
             int n=arr[0];
             int x=arr[1];
             int a=(n-1)*x;
            
      System.out.println(a);
}
}
