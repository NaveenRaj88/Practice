package Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n){
        Set <Integer> visited = new HashSet<>();
        while(n>0){
            visited.add(n);
            if(n == 1){
                return true;
            }

            int value = n;
            int sum =0;
            while(value != 0){
                sum= sum + (value%10)*(value%10);
                value = value/10;
            }
            n=sum;
            if(visited.contains(n)){
                return false;
            }
        }
        return false;
    }
}
