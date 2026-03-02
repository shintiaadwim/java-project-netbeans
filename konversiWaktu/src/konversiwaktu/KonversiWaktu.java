/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversiwaktu;
import java.util.Scanner;

/**
 *
 * @author sharziel
 */
public class KonversiWaktu {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int detik, jam, menit, sisaDetik;
        
        System.out.print("Masukkan detik : ");
        detik = read.nextInt();
        sisaDetik = detik % 86400;

        jam = sisaDetik / 3600;
        sisaDetik = sisaDetik % 3600;

        menit = sisaDetik / 60;
        sisaDetik = sisaDetik % 60;
        System.out.println(detik + " detik = " + jam + " jam " + menit + " menit " + sisaDetik + " detik");
    }
}
