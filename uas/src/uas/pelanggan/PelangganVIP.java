package uas.pelanggan;

public class PelangganVIP extends Pelanggan {
    public PelangganVIP(String id, String nama, String telepon, String alamat) {
        super(id, nama, telepon, alamat);
    }
    
    public void setDiskon(double diskon) {
        super.setDiskon(diskon);
    }

    @Override
    public String getInfo() {
        return String.format(
            "Status: VIP | Diskon: %.0f%%", super.getDiskon() * 100
        );
    }

    @Override
    public void printDetail() {
        System.out.println(getInfo());

    }
}