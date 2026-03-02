/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datacollection;

/**
 *
 * @author sharziel
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class DataCollcetion {
    public static void main(String[] args) {
        //List
        System.out.println("Ini Adalah List  : ");
        java.util.List<String> list1 = new ArrayList<>();
        list1.add("Class");
        list1.add("Method");
        list1.add("Object");
        list1.add("Class");
        for (String str1 : list1) {
            System.out.println(str1);
        }
        
        System.out.println("\n");
        
        //Set
        System.out.println("Ini Adalah Set : ");
        Set<String> set1 = new HashSet<>();
        set1.add("Class");
        set1.add("Method");
        set1.add("Object");
        set1.add("Class");
        for (String s : set1) {
            System.out.println(s);
        }

        System.out.println("\n");
        
        //Map
        System.out.println("Ini Adalah Data Siswa : ");
        Map<Integer, String> mapInt_String = new HashMap<>();
        mapInt_String.put(1001, "Obito");
        mapInt_String.put(1002, "Ziel");
        mapInt_String.put(1003, "Chuuya");
        mapInt_String.put(1001, "Laksono");

        for (Integer string : mapInt_String.keySet()) {
            System.out.println("Siswa dengan NIS " + string + " bernama " + mapInt_String.get(string));
        }
    }
}
        