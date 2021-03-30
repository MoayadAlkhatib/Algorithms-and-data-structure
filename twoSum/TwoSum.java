
import java.util.HashMap;

/**
 * This program returns indices of the two numbers such that they add up to a target,
 * Given an array of integers nums and an integer target,
 * @author Moayad Alkhatib.
 * @date 2021-03-30
 */
public class TwoSum{
    public static void main(String[] args) {
         int[] nums = new int[]{2, 11, 15, 7};
         int target = 9;
         int [] res = twoIndices(nums, target);
         
        System.out.println(res[0] + " " + res[1]);
    }  
    
    /**
     * calculate the two indices that matches the target.
     * @param numArray to look through.
     * @param target to match.
     * @return an array of two indices.
     */
    public static int[] twoIndices(int[] numArray, int target){
        HashMap<Integer, Integer> differences = new HashMap();
        for(int i =0; i<numArray.length; i++){
            int difference = target - numArray[i];
            if(differences.containsKey(difference)){
                return new int[] {i, differences.get(difference)};
            }
            differences.put(numArray[i], i);
        }
        return new int [] {-1, -1};
    }
}