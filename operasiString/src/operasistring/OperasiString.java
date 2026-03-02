/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operasistring;

/**
 *
 * @author sharziel
 */
public class OperasiString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String kata1 ="";
//        System.out.println(kata1);
//        String kata2 ="";
//        System.out.println(kata2);

    //UpperCase and LowerCase
          String kata1="HeLLo World";
          String kata2=kata1.toUpperCase();
          String kata3=kata1.toLowerCase();
          System.out.println(kata1);
          System.out.println(kata2);
          System.out.println(kata3);

          kata1=kata1.toUpperCase();
          System.out.println(kata1);
          
          System.out.println(kata1.length());
          
    //charArt   
          char karakter;
          karakter = "adi".charAt(2);
          System.out.println("karakter posisi 1 : " +karakter);
          
    //indexOf    
          int pos;
          pos = "object oriented".indexOf('e');
          pos = "object oriented".indexOf('e',4);
          pos = "object oriented".lastIndexOf('e');
          System.out.println(pos);
    
    //ethods equals
          boolean a,b,c;
          a = "Saya".equals("Saya");
          b = "Saya".equals("saya");
          c = "Saya".equalsIgnoreCase("Saya");
          System.out.println(a);
          System.out.println(b);
          System.out.println(c);
    
    //??
          String team="Bola";
          if(team.equalsIgnoreCase("bola")){
            System.out.println("Saya Bermain " +team);
        
          String motor1="honda";
          String motor2="yamaha";
          System.out.println(motor1.compareTo(motor2));
          System.out.println(motor2.compareTo(motor1));
          
          String gorengan1="bala bala";
          String gorengan2="bakwan";
          System.out.println(gorengan1.compareTo(gorengan2));
          System.out.println(gorengan2.compareTo(gorengan1));
          
    //methods substring
          String kalimat = kata1.substring(4,9);
          System.out.println(kalimat);
          String kalimat1 = kata1.substring(4);
          System.out.println(kalimat1);
          
    //methods concatnation
          String motor3="suzuki";
          int num=2;
          String motor = motor1 +" "+ motor2;
          String motor4 = motor1.concat(" "+motor2);
          System.out.println(motor);
          System.out.println(motor4);
          motor +=" "+ motor3;
          System.out.println(motor);
          motor +=" "+ num;
          System.out.println(motor);
          
    //methods trim
          String kata4=" saya bermain bola ";
          String kata5=kata4.trim();
          System.out.println(kata4);
          System.out.println(kata5);
          
          }  
    }
}