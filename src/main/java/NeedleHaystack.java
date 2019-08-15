public class NeedleHaystack {

    /*
    Implement strStr().
    Return the index of the first occurrence of
    needle in haystack, or -1 if needle is not part of haystack.

    //FASTER THAN 52% of all submissions
    88% on memory

    // TODO: SHORTEN THIS TO NESTED FOR LOOP
     */

    public static int strStr(String haystack, String needle) {

        //Think about edge cases
        if ((needle.length() == 0) && (haystack.length() == 0)){return 0;}


        if (needle.length() == 0){return 0;}
        if (haystack.length() == 0){return -1;}


        if (needle.length() > haystack.length()){return -1;}

        int pointer = 0;
        int second_pointer;


        while(pointer < haystack.length() && ((haystack.length()  - pointer) >= needle.length() )){

            if (haystack.charAt(pointer) == needle.charAt(0)){
                //we need to check the rest of the characters
                for(second_pointer = 1; second_pointer < needle.length(); second_pointer++){

                    if (!(haystack.charAt(pointer + second_pointer) == needle.charAt(second_pointer))){ break;}
                }

                // we need to have a check here
                if (second_pointer  == needle.length() ) return pointer;
            }

            pointer ++;

        }

        return -1;
    }

    public static void main(String[] args){
        System.out.println(strStr("", ""));
    }
}
