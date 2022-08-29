package monday;
class person{
    public String personName;
    public String getPersonName(){
      return personName;
    }


public void setPersonName(String personName){
    this.personName=personName;
}
}
public class nullpointerexception{ 
    public static void main(String[] args){
        person personObj=null;
        try{
            String name=personObj.personName;
            personObj.personName="ramesh fadatare";
        }
        catch(NullPointerException e)
        {
            System.err.println("NulpointerException caught!");
            e.printStackTrace();
        }
        }
    }
  

