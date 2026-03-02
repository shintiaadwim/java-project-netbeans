/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kegiatanthread;

/**
 *
 * @author sharziel
 */
public class KegiatanThread {
    public static void main(String[] args) {
        Thread CobaThread = new Thread() {
            public void run() {
                int jumlah = 16;
                try {
                    for (int i = 1; i <= jumlah; i++) {
                        System.out.println("Proses " + i);
                        sleep(500);
                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            
        };
        CobaThread.start();
    }
}