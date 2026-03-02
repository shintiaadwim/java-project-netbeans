/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author sharziel
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);
        String nama, jurusan, alamat;
        int NIS;
        System.out.print("Masukkan NIS: ");
        NIS = Integer.parseInt(input.readLine());
        System.out.print("Masukkan nama: ");
        nama = input.readLine();
        System.out.print("Masukkan jurusan: ");
        jurusan = input.readLine();
        System.out.print("Masukkan alamat: ");
        alamat = input.readLine();
        System.out.println();
        System.out.println("--- Data yang anda masukkan ---");
        System.out.println("NIS: " + NIS);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }
    
}
