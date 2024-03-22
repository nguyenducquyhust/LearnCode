package Bai4;

public class LocalTrip extends Cartrip{
    private int sotuyen;
    private int sokimdidc;
    public  LocalTrip(){}
    public LocalTrip(String idtrip, String drivername, int soxe, int revenue,int sokimdidc,int sotuyen){
        super(idtrip,drivername,soxe,revenue);
        this.sokimdidc = sokimdidc;
        this.sotuyen = sotuyen;
    }

    public int getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(int sotuyen) {
        this.sotuyen = sotuyen;
    }

    public int getSokimdidc() {
        return sokimdidc;
    }

    public void setSokimdidc(int sokimdidc) {
        this.sokimdidc = sokimdidc;
    }
    @Override
    public int getRevenue(){
        return super.getRevenue();
    }

    }


