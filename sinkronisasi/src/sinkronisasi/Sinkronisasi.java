/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sinkronisasi;
import java.lang.Thread;


/**
 *
 * @author sharziel
 */

class TestSinkronisasi {
    private java.util.Random random = new java.util.Random();
    synchronized public void callMe (String data) {
            System.out.print("[");
            try {
                Thread.sleep(random.nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(data);
            try {
                Thread.sleep(random.nextInt(200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("]");
    }
}

class CobaThread extends Thread {
    private String data;
    private TestSinkronisasi obj;
    public CobaThread (TestSinkronisasi obj, String data) {
        this.obj = obj;
        this.data = data;
        start();
    }
    public void run() {
        obj.callMe (data);
    }
}
class Sinkronisasi {
    public static void main(String[] args) {
        TestSinkronisasi data = new TestSinkronisasi();
        CobaThread Thread1 = new CobaThread(data, "Komputer");
        CobaThread Thread2 = new CobaThread(data, "Laptop");
        CobaThread Thread3 = new CobaThread(data, "Flashdisk");
        try {
            Thread1.join();
            Thread2.join();
            Thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread utama diinterupsi" + e);
        }
        
    }
    
}
