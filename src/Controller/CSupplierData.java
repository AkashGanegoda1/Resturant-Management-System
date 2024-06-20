package Controller;

public class CSupplierData {
    private final String supid;
    private final String supname;
    private final int supcn;
   

    public CSupplierData(String supid, String supname, int supcn) {
        this.supid = supid;
        this.supname = supname;
        this.supcn = supcn;
        
    }
    
     public String getsupid() {
        return supid;
    }

    public String getsupname() {
        return supname;
    }

    public int getsupcn() {
        return supcn;
    }

}
