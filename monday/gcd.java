package monday;

import java.util.Scanner;

public class gcd{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int num1=s.nextInt();
        int num2=s.nextInt();
        int gcd=1;
        int min=Math.min(num1,num2);
        for (int i=1;i<=min;i++)

        {
            if(num1%i==0 && num2%i==0)

            {
                       gcd=i;

            }
            
    }

    int lcm=(num1*num2)/gcd;
    System.out.println("gcd of"+num1+"and"+num2+"is"+gcd);
    System.out.println("lcm of"+num1+"and"+num2+"is"+lcm);
    }
}

