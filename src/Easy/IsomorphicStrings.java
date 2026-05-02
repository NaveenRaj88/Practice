package Easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s , String t){
        Map<Character, Character> s1 = new HashMap<>();
        Map<Character, Character> s2 = new HashMap<>();
        int i =0;
        while(i< s.length()){
            char is = s.charAt(i);
            char it = t.charAt(i);

            if(!s1.containsKey(is) && !s2.containsKey(it) ){
                s1.put(is, it);
                s2.put(it,is);

            }else if(!s1.get(is).equals(it) || !s2.get(it).equals(is)){
                return false;
            }
            i++;
        }

        return true;
    }
}
