/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inicombobox;
import javax.swing.*;
/**
 *
 * @author sharziel
 */
public class iniComboBox extends JFrame {
    JFrame frame = new JFrame ("Membuat ComboBox"); 
    JPanel panel = new JPanel();
    JComboBox<String> jurusan = new JComboBox<>();
    public iniComboBox(){
        frame.setSize(300,150);
        frame.setVisible(true);
        frame.setContentPane(panel);
        panel.add(jurusan);
        jurusan.addItem("RPL");
        jurusan.addItem("TKJ");
        jurusan.addItem("MM");
    }
    public static void main(String[] args) {
        new iniComboBox();
    }
    
}
