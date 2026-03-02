package uas.sistem;

import uas.display.Display;
import uas.layanan.Layanan;
import uas.transaksi.Transaksi;
import uas.pelanggan.Pelanggan;
import uas.transaksi.DetailTransaksi;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemLaundry implements Display {
    private List<Pelanggan> pelangganList = new ArrayList<>();
    private List<Layanan> layananList = new ArrayList<>();
    private List<Transaksi> transaksiList = new ArrayList<>();
    
    public List<Layanan> getLayananList() {
        return layananList;
    }
    
    public List<Pelanggan> getPelangganList() {
        return pelangganList;
    }
    
    public List<Transaksi> getTransaksiList() {
        return transaksiList;
    }

    public void tambahData(Object obj) {
        if (obj instanceof Pelanggan) {
            pelangganList.add((Pelanggan) obj);
        } else if (obj instanceof Layanan) {
            layananList.add((Layanan) obj);
        } else if (obj instanceof Transaksi) {
            transaksiList.add((Transaksi) obj);
        }
    }
    
    public boolean hapusData(Object obj) {
        if (obj instanceof Pelanggan) {
            // Menghapus objek Pelanggan dari pelangganList
            return pelangganList.remove((Pelanggan) obj);
        } else if (obj instanceof Layanan) {
            // Menghapus objek Layanan dari layananList
            return layananList.remove((Layanan) obj);
        } else if (obj instanceof Transaksi) {
            // Menghapus objek Transaksi dari transaksiList
            return transaksiList.remove((Transaksi) obj);
        }
        // Jika objek bukan salah satu dari tipe di atas
        return false;
    }

    public Transaksi prosesTransaksi(Pelanggan pelanggan, Layanan layanan, Date tanggal) {
        DetailTransaksi detail = new DetailTransaksi(layanan.getHarga(), new Date());
        Transaksi newTransaksi = new Transaksi(
            "TRX" + String.format("%04d", transaksiList.size() + 1),  tanggal, pelanggan, layanan, detail
        );
        transaksiList.add(newTransaksi);
        return newTransaksi;
    }
    
    public void printInfoDisplay(Display d) {
        d.printDetail();
    }

    @Override
    public String getInfo() {
        return "Sistem Laundry - Transaksi: " + transaksiList.size() + ", Pelanggan: " + pelangganList.size();
    }

    @Override
    public void printDetail() {
        System.out.println("--- Detail Sistem Laundry ---");
        System.out.println(getInfo());
    }
}