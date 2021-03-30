
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
        String name = "mmooaayyaadd";
        System.out.println(firstNoneRepeatingChar(name, createHashMap(name)));
    }
    
    /*
    Add characters and values to the hashmap.
    @param input to be added by user.
    @return charCount the hash map for characters in the string.
    */
    private static HashMap<Character, Integer> createHashMap(String input){
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
    
    /*
    Get the first none repeated character.
    @param input to be added by user.
    @param charCount the hash map for characters in the string.
    @return firstChar the first none repeated character.
    */
    public static char firstNoneRepeatingChar(String input, HashMap<Character, Integer> charCount){
        for(int i=0; i<input.length(); i++){
            char charTobeProcessed = input.charAt(i);
            if(charCount.get(charTobeProcessed)==1){
                return charTobeProcessed;
            }
        }
        return '-';
    }
}