/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tampilkan;

/**
 *
 * @author sharziel
 */
class tampil implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ini angka " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e ) {
                e.printStackTrace();
            }
        }
    }
}

class tampil1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ini angka " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e ) {
                e.printStackTrace();
            }
        }
    }
}

public class Tampilkan {

    public static void main(String[] args) {
        Thread tampil1 = new Thread(new tampil());
        tampil1.start();
        
        Thread tampil2 = new Thread(new tampil());
        tampil2.start();
    
        tampil1 tampil3 = new tampil1();
        tampil3.start();
        
        tampil1 tampil4 = new tampil1();
        tampil4.start();
    }
}