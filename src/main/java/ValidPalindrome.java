public class ValidPalindrome {

    public static boolean isPalindrome(String s){

        if (s.length() <2){return true;}

        //initialise pointers;
        int pointer_left = 0;
        int pointer_right = s.length() -1;

        /*
        set up while loop such that they consider only the

        two scenarios: even length OR odd length. ... handle this

         */

        while(pointer_left < pointer_right){

            if(!Character.isLetterOrDigit(s.charAt(pointer_right))) {pointer_right--;continue;}

            if(!Character.isLetterOrDigit(s.charAt(pointer_left))) {pointer_left++;continue;}

            if(!(Character.toLowerCase(s.charAt(pointer_left)) == Character.toLowerCase(s.charAt(pointer_right)))) {
                return false;}

            pointer_left ++;
            pointer_right--;

        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("a."));
    }
}
