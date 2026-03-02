package uas.transaksi;

import uas.display.Display;
import uas.layanan.Layanan;
import uas.pelanggan.Pelanggan;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Transaksi implements Display {
    private String idTransaksi;
    private Date tglTransaksi;
    private Pelanggan pelanggan;
    private Layanan layanan;
    private DetailTransaksi detail;

    public Transaksi(String idTransaksi, Date tglTransaksi, Pelanggan pelanggan, Layanan layanan, DetailTransaksi detail) {
        this.idTransaksi = idTransaksi;
        this.tglTransaksi = tglTransaksi;
        this.pelanggan = pelanggan;
        this.layanan = layanan;
        this.detail = detail;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }
    public String getTransaksi() {
        return "ID Transaksi: " + idTransaksi;
    }
    
    public Pelanggan getPelanggan() {
        return pelanggan;
    }
    
    public Layanan getLayanan() {
        return layanan;
    }
    
    public DetailTransaksi getDetail() {
        return detail;
    }

    private String getTglTransaksiFormatted() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy, HH:mm");
        return sdf.format(this.tglTransaksi);
    }

    @Override
    public String getInfo() {
        return String.format(
            "ID Transaksi   : %s\n" + 
            "Tgl. Transaksi : %s", 
            this.idTransaksi, this.getTglTransaksiFormatted()
        );
    }

    @Override
    public void printDetail() {
        System.out.println(getInfo());
        System.out.println("\n");
        System.out.println("### DETAIL PELANGGAN");
        pelanggan.printDetail();
        System.out.println("\n");
        System.out.println("### DETAIL LAYANAN");
        layanan.printDetail();
        System.out.println("\n");
        System.out.println("### TOTAL BIAYA");
        detail.printDetail();
        System.out.println("\n");
    }
}