package relationship;

public class car {
    private String color;
    private int maxspeed;
    public void carInfo(){
        System.out.println("car Color  = "+color+"max Speed "+maxspeed);

    }
    public void setColor(String color){
        this.color=color;
    }
    public void setmaxspeed(int maxspeed){
        this.maxspeed=maxspeed;
    }
}
