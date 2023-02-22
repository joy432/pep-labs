
import java.util.ArrayList;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
      int max =0;
      int secondMax = 0;

      for(int value: nums){
        secondMax = max;
        max = value;
          if(value > secondMax && value<=max){
        secondMax = value;     
          }
        }
        return max+secondMax;
    }
}