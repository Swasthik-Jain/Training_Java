package monday;

public class classnotfoundexception {
                       public static void main(String[] args){
                        try{
                            Class.forName("com.example.corejava.demo");
                            ClassLoader.getSystemClassLoader().loadClass("com.example.corejava.demo");

                        }catch(ClassNotFoundException e){
                            System.out.println("pakage name"+"and class file are not there");
                            //e.printStackTrace();
                        }
              }
}
