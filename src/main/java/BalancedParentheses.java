import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BalancedParentheses {

    /*
    Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
    For example, given n = 3, a solution set is:
     */
    public static List<String> generateParenthesis(int n) {

    List<String> result = new ArrayList<>();

    if(n == 0) return result;

    HashSet<String> seen = new HashSet<>();

    //recursively add PAIRS of parentheses and use the hashset to backtrack
    backtrack(seen, "()", (n-1), result);

    return result;
    }

    public static void backtrack(HashSet<String> seen, String string, int level, List<String> result){

        //if three sets are in: add to list
        if (level == 0) {

            result.add(string);

            return; }

        for(int i = 0; i <= string.length(); i++){

            String current_permutation = string.substring(0,i) + "()" + string.substring(i);

            //if this string is in the set that has been operated on, backtrack.
            if (!seen.contains(current_permutation)) {

                backtrack(seen, current_permutation, (level -1), result);

                seen.add(current_permutation);
                }
        }
    }


    public static void main(String[] args){
        List<String> r = generateParenthesis(100 );

        for(String s: r){
            System.out.println(s);
        }
    }
}
