/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inijframe;
import javax.swing.JFrame;

/**
 *
 * @author sharziel
 */
public class iniJFrame {
        private final JFrame contohFrame;
        public iniJFrame() {
            contohFrame = new JFrame("Contoh JFrame");
        }
        public void launchFrame() {
            contohFrame.setSize(400,300);
            contohFrame.setResizable(false);
            contohFrame.setVisible(true);
        }
        public static void main(String[] args) {
            iniJFrame a = new iniJFrame();
            a.launchFrame();
        }
    
}
