/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coba;
import java.io.DataInputStream;
import java.io.IOException;
/**
 *
 * @author sharziel
 */
public class Coba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String kata1 = "Shintia";
        String kata2 = "Aranzadwi";
        String kata3 = "Melati";
        System.out.println(kata1 + kata2 + kata3);
       
        System.out.println("\n");
        
        String kata = "ShintiaAaranzadwiMelati";
        char x = kata.charAt(2);
        char y = kata.charAt(4);
        System.out.println("Karakter ke-3 adalah " + x);
        System.out.println("Karakter ke-5 adalah " + y);
        
        System.out.println("\n");
        
        int posisi1 = kata.indexOf('a');
        System.out.println("Posisi huruf a = " + posisi1);
        
        System.out.println("\n");
        
        DataInputStream input = new DataInputStream(System.in);
        String nama, kelas, noabsen;
        int Noabsen;
        System.out.print("Nama: ");
        nama = input.readLine();
        System.out.print("Kelas: ");
        kelas = input.readLine();
        System.out.print("No.absen: ");
        Noabsen = Integer.parseInt(input.readLine());
        System.out.println();
        System.out.println("--- Data yang anda masukkan ---");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Noabsen: " + Noabsen);
    }
    
}
