package uas.pelanggan;

public class PelangganVIP extends Pelanggan {
    private double diskon;

    public PelangganVIP(String id, String nama, String telepon, String alamat, double diskon) {
        super(id, nama, telepon, alamat);
        this.diskon = diskon;
    }

    public double getDiskon() {
        return diskon;
    }
    
    public double getPelangganVIPDiskon() {
        return diskon; 
    }

    @Override
    public String getInfo() {
        return String.format(
            "Status: VIP | Diskon: %.0f%%", this.diskon * 100
        );
    }

    @Override
    public void printDetail() {
        System.out.println(getInfo());

    }
}