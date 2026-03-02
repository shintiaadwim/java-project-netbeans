/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package output;

/**
 *
 * @author sharziel
 */

//import java.io.IOException;
public class Output {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) throws IOException{
//        System.out.println("Pemrograman Java");
//        System.out.print("Belajar");
//        System.out.print("Input Output");
//    }
    
    public static void main(String[] args) {
        int varInt = 45;
        float varfloat = 6.97f;
        double varDouble = 7.98845;
        char varChar = 'X';
        String varString = "ini sebuah String";
        
        System.out.printf("%d\n", varInt);
        System.out.printf("%e\n", varDouble);
        System.out.printf("%c\n", varChar);
        System.out.printf("%.3s\n", varString);
        System.out.printf("%s\n", varString);
        
        System.out.println();
        
        System.out.println("Ini adalah string yang dicetak dari println;" +varString);
    }
    
}
