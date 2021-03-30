
import java.util.HashMap;

/*
This program finds the first none repeated character in a string and returns it.
@author Moayad Alkhatib
@date 2021-03-30
*/

public class firstNoneRepeatingCharacter{
    
    /*
    The main method aims to test the program.
    */
    public static void main(String[] args){
        System.out.println(firstNoneRepeatingChar("welcome"));
    }
    
    /*
    Add characters and values to the hashmap.
    @return the hash map for characters in the string.
    */
    public static HashMap<Character, Integer> firstNoneRepeatingChar(String input){
        HashMap<Character, Integer> charCount = new HashMap();
        for(int i=0; i<input.length(); i++){
            char charTobeProcessed = input.charAt(i);
            if(charCount.containsKey(charTobeProcessed)){
                charCount.put(charTobeProcessed, charCount.get(charTobeProcessed) +1);
            }else{
               charCount.put(charTobeProcessed, 1);
            }
        }
        return charCount;
    }
}