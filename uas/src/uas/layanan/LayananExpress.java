package uas.layanan;

public class LayananExpress extends Layanan {
    private double tambahanHarga;

    public LayananExpress(String kode, String nama, double harga, int durasi, double tambahanHarga) {
        super(kode, nama, harga, durasi);
        this.tambahanHarga = tambahanHarga;
    }

    public double getTambahanHarga() {
        return tambahanHarga;
    }
    
    @Override
    public double getHarga() { 
        return super.getHarga() + tambahanHarga;
    }

    @Override
    public void printDetail() {
        String hargaNormalFormatted     = String.format("Rp %,.0f", (double) super.getHarga());
        String tambahanHargaFormatted   = String.format("Rp %,.0f", (double) tambahanHarga);
        String totalHargaFormatted      = String.format("Rp %,.0f", (double) this.getHarga());

        System.out.println("----------------------------------------");
        System.out.println("         Detail Layanan Express         ");
        System.out.println("----------------------------------------");
        System.out.printf("%-18s  : %s%n", "Kode Layanan", super.getKode());
        System.out.printf("%-18s  : %s%n", "Nama Layanan", super.getNama());
        System.out.printf("%-18s  : %s%n", "Harga Normal", hargaNormalFormatted);
        System.out.printf("%-18s  : %s%n", "Tambahan Express", tambahanHargaFormatted);
        System.out.println("----------------------------------------");
        System.out.printf("%-16s : %s%n", "Total Harga Express", totalHargaFormatted);
    }
}