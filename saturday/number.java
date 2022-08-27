package saturday;
import java.util.*;
public class number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rem=0,sum=0,product=1;
       int n=sc.nextInt();
       int temp=n;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            sum=sum+rem;
            product=rem*product;
        }
       if(temp==sum+product)
       {
        System.out.println("gratest");
       }

    }
    
}
