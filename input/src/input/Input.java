/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input;

/**
 *
 * @author sharziel
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
        System.out.print("Masukkan satu karakter:");
        char ch;
        InputStreamReader input =  new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(input);
        ch = (char) buff.read();
                
        System.out.print("Masukkan Nama Anda: ");
        String nama;
        InputStreamReader input1 =  new InputStreamReader(System.in);
        BufferedReader buff1 = new BufferedReader(input1);
        nama = buff1.readLine();
        System.out.println("Karakter yang dimasukkan adalah \'" + ch + "\' \nSelamat datang, " + nama);
    }

}
  