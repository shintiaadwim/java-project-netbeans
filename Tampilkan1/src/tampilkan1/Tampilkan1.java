/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tampilkan1;

/**
 *
 * @author sharziel
 */
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
public class Tampilkan1 {

    public static void main(String[] args) {
        tampil1 tampil1 = new tampil1();
        tampil1.start();
        
        tampil1 tampil2 = new tampil1();
        tampil2.start();
    }
}

