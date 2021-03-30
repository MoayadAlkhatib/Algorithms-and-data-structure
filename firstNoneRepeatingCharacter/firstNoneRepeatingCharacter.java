
import java.util.HashMap;
import java.util.Scanner;

/*
This program finds the first none repeated character in a string and returns it.
@author Moayad Alkhatib
@date 2021-03-30
*/

public class firstNoneRepeatingCharacter{
    
    /*
    The main method aims to test the program.
    Type exit to exit the program else type a string.
    */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        
        while(!(name.equals("exit"))){
          System.out.println(firstNoneRepeatingChar(name));  
          System.out.print("Enter a string: ");
          name = sc.nextLine();
        }
        
        
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
    @return firstChar the first none repeated character.
    */
    public static char firstNoneRepeatingChar(String input){
        HashMap<Character, Integer> charCount = createHashMap(input);
        for(int i=0; i<input.length(); i++){
            char charTobeProcessed = input.charAt(i);
            if(charCount.get(charTobeProcessed)==1){
                return charTobeProcessed;
            }
        }
        return '-';
    }
}