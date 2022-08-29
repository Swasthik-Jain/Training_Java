package monday;

public class classcastexception {
    public static void main (String[] args)
    {
        Object obj=new Integer(100);
       // System.out.println((String) obj);
        System.out.println(obj.toString());
    }
}
