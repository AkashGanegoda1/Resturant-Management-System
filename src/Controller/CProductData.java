package Controller;


public class CProductData {

    private final String proid;
    private final String proname;
    private final String supid;
    private final String quantity;
    private final double price;

    public CProductData(String proid, String proname, String supid, String quantity, double price) {
        this.proid = proid;
        this.proname = proname;
        this.supid = supid;
        this.quantity = quantity;
        this.price = price;
    }
    
     public String getproid() {
        return proid;
    }

    public String getproname() {
        return proname;
    }

    public String getsupid() {
        return supid;
    }

    public String getquantity() {
        return quantity;
    }

    public double getprice() {
        return price;
    }
    
}
