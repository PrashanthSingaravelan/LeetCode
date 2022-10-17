package com.mycompany.practice;
import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        
        char chr1 = 'G';
        int asc1  = chr1;
        
        char chr2 = 'o';
        int asc2  = chr2;
        
        char[] chr3 = {'a','l'};
        int num1 = chr3[0];
        int num2 = chr3[1];
        
        int asc3 = num1 + num2;        
        
        HashMap<String, Integer> obj1 = new HashMap<>();
        obj1.put("G", asc1);
        obj1.put("()", asc2);
        obj1.put("(al)",asc3);
        
        String command    = "G()(al)";
        String[] command1 = command.split("");
        
        System.out.println(command);
        System.out.println(command1);
        
//        for(String i:command1) {
//            if (obj1.containsKey(i))      {
//            Integer a = obj1.get(i);
//            System.out.println(a);
//        }
//
//    }
  }
}
