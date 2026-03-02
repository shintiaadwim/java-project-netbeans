package uas.pelanggan;

import uas.display.Display;

public class Pelanggan implements Display {
    private String id;
    private String nama;
    private String telepon;
    private String alamat;

    public Pelanggan(String id, String nama, String telepon, String alamat) {
        this.id         = id;
        this.nama       = nama;
        this.telepon    = telepon;
        this.alamat     = alamat;
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
}