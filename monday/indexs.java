package monday;
import java.util.*;
public class indexs { 
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n;
        n=sc.nextInt();

        sc.nextLine();
          String str=sc.nextLine();
        String[] array=str.split(" ");
            int arr[]=new int[n];
           //for(int i=0;i<n;i++)
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.valueOf(array[i]);

        }
         
        int min=0;
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[min]>arr[i])
                 min=i;
           else if(arr[i]>arr[max])
                 max=i;


        }
         System.out.println("min index="+(min+1));
         System.out.println("max index="+ (max+1));
    }
    
}
