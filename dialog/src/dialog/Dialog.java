/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dialog;
import javax.swing.*;

/**
 *
 * @author sharziel
 */
public class Dialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f2;
        f2 = new JFrame (" Perhatian ");
        f2.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        f2.setVisible (true);
        JOptionPane.showConfirmDialog (f2, "Kode Tersebut Telah Digunakan", "Perhatian", JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
    }
}