/*
 * Chau Nguyen
    This program will check if 2 strings are permutations of each other other
 */
package permutationfinder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chaunguyen
 */
public class PermutationFinder {

    /**
     * @param args the command line arguments
     */
    public boolean Permutation(String a, String b){
       final Map<Character, Integer> mapA = new HashMap<Character,Integer>(){};
       final Map<Character, Integer> mapB = new HashMap<Character,Integer>(){};
       mapA.clear();
       mapB.clear();
        //If 2 strings have different length then False
       if(a.length()!=b.length()){
           return false;
       }else{
           //Add all the char of A in MapA
           for(int i=0; i<a.length();i++){
               char c=a.charAt(i);
               if(mapA.containsKey(c)){
                   int counter =mapA.get(c)+1;
                   mapA.put(c,counter);
               }else
                   mapA.put(c, 1);
            }
           //Add all the char of B in MapB
           for(int i=0; i<b.length();i++){
               char c=b.charAt(i);
               if(mapB.containsKey(c)){
                   int counter =mapB.get(c)+1;
                   mapB.put(c,counter);
               }else
                   mapB.put(c, 1);
            }
           
           //Compare 2 maps if 2 maps are the same, return true, else return false
           System.out.println(Collections.singletonList(mapB));
           System.out.println(Collections.singletonList(mapA));
           if(mapA.equals(mapB)){
               return true;
           }else 
               return false;
           
       }
    }
    public static void main(String[] args) {
        String a = "hello";
        String b = "ohlle";
        String c = "a";
        String d = "helor";
        PermutationFinder p = new PermutationFinder();
        // TODO code application logic here
       
        System.out.println(p.Permutation(a,b));
        System.out.println(p.Permutation(a,c));
        System.out.println(p.Permutation(a,d));
       
        
        
        
    }
    
}
