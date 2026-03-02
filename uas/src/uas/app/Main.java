package uas.app;

import uas.sistem.SistemLaundry;
import uas.pelanggan.Pelanggan;
import uas.pelanggan.PelangganVIP;
import uas.layanan.Layanan;
import uas.layanan.LayananSetrika;
import uas.layanan.LayananExpress;
import uas.transaksi.Transaksi;
import java.util.Date;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final SistemLaundry sistem = new SistemLaundry();
    private static final List<Pelanggan> daftarPelanggan = new ArrayList<>();
    private static final List<Layanan> daftarLayanan = new ArrayList<>();
    
    public static void main(String[] args) {

        int pilihan;
        do {
            tampilkanMenu();
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    inputPelanggan();
                    break;
                case 2:
                    inputLayanan();
                    break;
                case 3:
                    prosesTransaksi();
                    break;
                case 4:
                    sistem.printDetail();
                    break;
                case 0:
                    System.out.println("\nTerima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("\n==========================================");
        System.out.println("            SISTEM LAUNDRY MENU           ");
        System.out.println("==========================================");
        System.out.println("1. Input Pelanggan Baru");
        System.out.println("2. Input Layanan Baru");
        System.out.println("3. Proses Transaksi");
        System.out.println("4. Tampilkan Status Sistem");
        System.out.println("5. Keluar");
        System.out.print("Pilih: ");
    }

    private static void inputPelanggan() {
        System.out.println("\n--- INPUT PELANGGAN ---");
        System.out.print("ID Pelanggan (Pxxx): ");
        String id = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Telepon: ");
        String telepon = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();
        System.out.print("Tipe (1: Biasa, 2: VIP): ");
        int tipe = scanner.nextInt();
        scanner.nextLine();

        Pelanggan p;
        if (tipe == 2) {
            System.out.print("Masukkan Diskon : ");
            String diskonStr = scanner.nextLine().trim();
            
            double diskon;
            try {
                diskonStr = diskonStr.replace("%", "").replace(",", ".").trim();
                double nilai = Double.parseDouble(diskonStr);

                if (nilai > 1.0 && nilai <= 100.0) {
                    diskon = nilai / 100.0;
                } else {
                    diskon = nilai;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input diskon tidak valid. Diskon diatur ke 0.0.");
                diskon = 0.0;
            }
            p = new PelangganVIP(id, nama, telepon, alamat, diskon);
        } else {
            p = new Pelanggan(id, nama, telepon, alamat);
        }

        sistem.tambahData(p);
        daftarPelanggan.add(p);
        System.out.println("Pelanggan " + nama + " berhasil ditambahkan.");
        p.printDetail();
    }

    private static void inputLayanan() {
        System.out.println("\n--- INPUT LAYANAN ---");
        System.out.print("Kode Layanan (Lxxx): ");
        String kode = scanner.nextLine();
        System.out.print("Nama Layanan: ");
        String nama = scanner.nextLine();
        System.out.print("Harga Dasar: ");
        double harga = scanner.nextDouble();
        System.out.print("Durasi (hari): ");
        int durasi = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tipe Layanan (1: Dasar, 2: Setrika, 3: Express): ");
        int tipe = scanner.nextInt();
        scanner.nextLine();

        Layanan l;
        if (tipe == 2) {
            System.out.print("Jenis Cucian Setrika: ");
            String jenis = scanner.nextLine();
            l = new LayananSetrika(kode, nama, harga, durasi, jenis);
        } else if (tipe == 3) {
            System.out.print("Tambahan Harga Express: ");
            double tambahan = scanner.nextDouble();
            scanner.nextLine();
            l = new LayananExpress(kode, nama, harga, durasi, tambahan);
        } else {
            l = new Layanan(kode, nama, harga, durasi);
        }

        sistem.tambahData(l);
        daftarLayanan.add(l);
        System.out.println("Layanan " + nama + " berhasil ditambahkan.");
        l.printDetail();
    }

    private static void prosesTransaksi() {
        if (daftarPelanggan.isEmpty() || daftarLayanan.isEmpty()) {
            System.out.println("ERROR: Data pelanggan atau layanan belum cukup.");
            return;
        }

        System.out.println("\n--- PROSES TRANSAKSI ---");
        System.out.println("Daftar Pelanggan:");
        for (int i = 0; i < daftarPelanggan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarPelanggan.get(i).getNama() + " (" + daftarPelanggan.get(i).getId() + ")");
        }
        System.out.print("Pilih nomor pelanggan: ");
        int idxPelanggan = scanner.nextInt() - 1;
        scanner.nextLine();

        if (idxPelanggan < 0 || idxPelanggan >= daftarPelanggan.size()) {
            System.out.println("Pilihan pelanggan tidak valid.");
            return;
        }
        Pelanggan pelangganTerpilih = daftarPelanggan.get(idxPelanggan);

        System.out.println("Daftar Layanan:");
        for (int i = 0; i < daftarLayanan.size(); i++) {
            System.out.println((i + 1) + ". " + daftarLayanan.get(i).getNama() + " (Harga: " + daftarLayanan.get(i).getHarga() + ")");
        }
        System.out.print("Pilih nomor layanan: ");
        int idxLayanan = scanner.nextInt() - 1;
        scanner.nextLine();
        
        if (idxLayanan < 0 || idxLayanan >= daftarLayanan.size()) {
            System.out.println("Pilihan layanan tidak valid.");
            return;
        }
        Layanan layananTerpilih = daftarLayanan.get(idxLayanan);
        Transaksi t = sistem.prosesTransaksi(pelangganTerpilih, layananTerpilih, new Date());
        
        System.out.println("\n");
        System.out.println("============================================");
        System.out.println("                ZIEL LAUNDRY                ");
        System.out.println("============================================");
        System.out.println("\n");
        System.out.println("### INFORMASI TRANSAKSI");
        t.printDetail();
    }
}