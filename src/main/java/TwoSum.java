import java.util.*;

public class TwoSum {

    public void main(){

        int[] nums = {2,7,11,15};
        int target = 9;

        List<Integer> indicies = new ArrayList<Integer>();

        // put this into a hashtable.
        Hashtable<Integer,Integer> h = new Hashtable<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            h.put(i, nums[i]);
            indicies.add(i);
        }


        // hashtable initialised.
        List<Integer> keys = new ArrayList<Integer>(h.keySet());

        for(Integer indicie: keys){
            List<Integer> sublist = new ArrayList<Integer>(indicies);
            sublist.remove(indicie);

            for(Integer i: sublist){

                if(nums[i] + h.get(indicie) == target){
                    int[] result = {i,indicie};

                }

            }
        }


    }
}
