package Easy;

import java.util.Arrays;

public class LongestPrefix {

    public static void main(String[] args) {

       String[]  strs = {"flower","flow","flight"};

//        Arrays.sort(strs,  (s1,s2)-> Integer.compare(s1.length(),s2.length()));
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
      int minLength = Math.min(first.length(),last.length());
      int i =0;
      String commonPrefix ="";
      while(i < minLength){
          if(first.charAt(i) == last.charAt(i)){
              commonPrefix = commonPrefix + first.charAt(i);
              i++;
          }
          else{
              break;
          }
      }
        System.out.println(commonPrefix);

    }
}
