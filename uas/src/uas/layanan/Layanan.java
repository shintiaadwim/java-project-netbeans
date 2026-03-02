package uas.layanan;

import uas.display.Display;

public class Layanan implements Display {
    private String kode;
    private String nama;
    private double harga;
    private int durasi;

    public Layanan(String kode, String nama, double harga, int durasi) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.durasi = durasi;
    }

    public String getKode() {
        return kode;
    }
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    public Layanan getLayanan() {
        return this;
    }

    @Override
    public String getInfo() {
        return String.format(
            "Kode Layanan : %s\n" +
            "Nama Layanan : %s\n" +
            "Harga        : Rp %d\n" +
            "Durasi       : %d hari",
            this.kode, this.nama, (int) this.harga, this.durasi
        );
    }

    @Override
    public void printDetail() {
        System.out.println(getInfo());
    }
}