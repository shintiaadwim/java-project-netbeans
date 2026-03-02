/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas.transaksi;

import java.text.SimpleDateFormat;
import java.util.Date;
import uas.display.Display;

/**
 *
 * @author sharziel
 */
    public class DetailTransaksi implements Display {
        private double totalHarga;
        private Date tglAmbil;

        public DetailTransaksi(double totalHarga, Date tglAmbil) {
            this.totalHarga = totalHarga;
            this.tglAmbil = tglAmbil;
        }
        
        public double getTotalHarga() {
            return totalHarga;
        }

        private String getTglAmbilFormatted() {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy, HH:mm");
            return sdf.format(this.tglAmbil);
        }

        @Override
        public String getInfo() {
            return
            "Total Harga : Rp " + totalHarga + "\n" +
            "Tgl. Ambil  : " + tglAmbil.toString();
        }

        @Override
        public void printDetail() {
            System.out.println(getInfo());
        }
    }
