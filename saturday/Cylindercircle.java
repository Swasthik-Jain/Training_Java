package saturday;


class Circle{
     double radius =1.0;
     String color = "red";
     public Circle(){}
     public Circle(double radius){
         this.radius=radius;
     }
     public Circle(double radius,String color){
         this.radius=radius;
         this.color=color;
     }
     double getRadius(){
         return radius;
     }
     void setRadius(double radius){
         this.radius=radius;
     }
     String getColor(){
         return this.color;
     }
     void setColor(String color){
         this.color=color;
     }
    double getArea(){
        return (3.14*radius*radius);
    }
    public String toString(){
        return ("Circle[radius="+radius+",color="+color+"]");
    }
    
}

class Cylinder extends Circle{
     double height=1.0;
      public Cylinder(){}
    public Cylinder(double radius){
        this.radius=radius;
    }
    public Cylinder(double radius, double height){
        this.radius= radius;
        this.height= height;
    }
    public Cylinder(double radius, double height,String color){
        this.radius= radius;
        this.height= height;
        this.color=color;
    }
    double getHeight(){
        return height;
    }
    void setHeight(double height){
        this.height=height;
    }
    double getVolume(){
        return (3.14*radius*radius*height);
    }
    
}
public class Cylindercircle{
    public static void main(String args[]){
        Cylinder c1=  new Cylinder();
        System.out.println("Cylinder: "+" radius="+c1.getRadius()+" height="+c1.getHeight()+" base area="+c1.getArea()+" volume="+c1.getVolume()+" color="+c1.getColor());
        Cylinder c2=  new Cylinder(2.0,2.0);
        System.out.println("Cylinder: "+" radius="+c2.getRadius()+" height="+c2.getHeight()+" base area="+c2.getArea()+" volume="+c2.getVolume()+" color="+c2.getColor());
        Cylinder c3=  new Cylinder(3.0,4.0,"Blue");
        System.out.println("Cylinder: "+" radius="+c3.getRadius()+" height="+c3.getHeight()+" base area="+c3.getArea()+" volume="+c3.getVolume()+" color="+c3.getColor());
        
    }
} 

