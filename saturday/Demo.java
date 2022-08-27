package saturday;
abstract class sum{
         public abstract int sumoftwo(int n1,int n2);
         public abstract int sumofthree(int n1,int n2,int n3);
         public void display()
         {
            System.out.println("method of class sum");

         }
}
class Demo extends sum{
    public int sumoftwo(int num1,int num2)
    {
        return num1+num2;

    }
    public int sumofthree(int num1,int num2,int num3)
    {
        return num1+num2+num3;
        
    }
    public static void main(String[] args)
    {
        sum obj=new Demo();
        System.out.println(obj.sumoftwo(3,7));
        System.out.println(obj.sumofthree(4,3,19));
        obj.display();
    }
}
