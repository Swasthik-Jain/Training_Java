public class Invoice {
    String id;
    String desc;
    int qty;
    double unitPrice;
    public  Invoice(String id,String desc,int qty,double unitPrice){
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    public String toString(){
        return "InvoiceItem[id="+id+",desc="+desc+",qty="+qty+",unitPrice="+unitPrice+"]";
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    public String getID(){
            return id;
    }
    public String getDesc(){
        return desc;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public double getTotal(){
        return qty*unitPrice;
    }
    public int getQty(){
        return qty;
    }
    public static void main(String args[]){
        Invoice inv1 = new Invoice("A101","Pen Red",888,0.08);
        System.out.println(inv1);
        inv1.setQty(999);
        inv1.setUnitPrice(0.99);
        System.out.println(inv1);
        System.out.println("id is : "+inv1.getID());
        System.out.println("desc is "+inv1.getDesc());
        System.out.println("qty is : "+ inv1.getQty());
        System.out.println("unit price is :"+inv1.getUnitPrice());
        System.out.println("The total is : "+inv1.getTotal());


    }
}
