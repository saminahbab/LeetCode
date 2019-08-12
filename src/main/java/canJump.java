import java.util.*;

public class canJump {

    public boolean canJump(int[] nums) {
        if(nums.length == 1){return true;}
        int windex = nums.length - 1;
        Set<Integer> s = new HashSet<>();
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        int jumps = nums[0];
        int current_jump = 1;
        int current_index = 0;

        while((current_jump <= jumps) && (current_jump + current_index <= windex )){
            if(!s.contains(current_index + current_jump)) {
                q.add(current_index + current_jump);
                s.add(current_index + current_jump);
            }
            current_jump++;
        }

        while(!q.isEmpty()){
            current_index = q.remove();

            if(current_index == windex){
                System.out.println("YES");return true;}
            else{
                jumps = nums[current_index];
                current_jump = 1;

                while((current_jump <= jumps) && (current_jump + current_index <= windex )){
                    if(!s.contains(current_index + current_jump)) {
                        q.add(current_index + current_jump);
                        s.add(current_index + current_jump);
                    }
                    current_jump++;
                }
            }
        }

        return false;



    }

}
