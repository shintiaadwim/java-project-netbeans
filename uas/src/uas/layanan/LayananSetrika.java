package uas.layanan;

public class LayananSetrika extends Layanan {
    private String jenisCucian;

    public LayananSetrika(String kode, String nama, double harga, int durasi, String jenisCucian) {
        super(kode, nama, harga, durasi);
        this.jenisCucian = jenisCucian;
    }

    public String getJenisCucian() { 
        return jenisCucian;
    }
    public String getSetrika() { 
        return jenisCucian;
    }

    @Override
    public void printDetail() {
        String hargaNormalFormatted     = String.format("Rp %,.0f", (double) super.getHarga());
        String totalHargaFormatted      = String.format("Rp %,.0f", (double) this.getHarga());

        System.out.println("----------------------------------------");
        System.out.println("         Detail Layanan Setrika         ");
        System.out.println("----------------------------------------");
        System.out.printf("%-15s : %s%n", "Kode Layanan", this.getKode());
        System.out.printf("%-15s : %s%n", "Nama Layanan", this.getNama());
        System.out.printf("%-15s : %s%n", "Harga Normal", hargaNormalFormatted); 
        System.out.printf("%-15s : %s%n", "Jenis Cucian", this.jenisCucian);
        System.out.println("----------------------------------------");
        System.out.printf("%-13s   : %s%n", "Total Biaya", totalHargaFormatted);
    }
}