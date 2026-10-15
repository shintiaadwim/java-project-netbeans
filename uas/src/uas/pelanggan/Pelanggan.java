package uas.pelanggan;

import uas.display.Display;

public class Pelanggan implements Display {
    private String id;
    private String nama;
    private String telepon;
    private String alamat;
    private double diskon = 0.0;

    public Pelanggan(String id, String nama, String telepon, String alamat) {
        this.id         = id;
        this.nama       = nama;
        this.telepon    = telepon;
        this.alamat     = alamat;
    }
    
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public String getId() {
        return id; 
    }
    public String getNama() {
        return nama; 
    }
    public Pelanggan getPelanggan() {
        return this;
    }
    
    public String getTelepon() {
        return telepon;
    }
    
    public double getDiskon() {
        return diskon; 
    }

    @Override
    public String getInfo() {
        return String.format(
            "ID Pelanggan : %s\n" +
            "Nama         : %s\n" +
            "Telepon      : %s\n" +
            "Alamat       : %s",
            this.id, this.nama, this.telepon, this.alamat
        );
    }

    @Override
    public void printDetail() {
        System.out.println(getInfo());
    }
    
    @Override
    public String toString() {
        // Asumsi Anda punya method getId() dan getNama()
        // Ini akan menghasilkan format: "P001 - Budi"
        return this.getId() + " - " + this.getNama(); 
    }
}