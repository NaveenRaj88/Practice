package Easy;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 3;
        int prev = 0;
        int curr =1;
        int i = 1;

        while(i< n){
          int temp = curr;
          curr = prev+  curr;
          prev = temp;
          i++;
        }
        System.out.println(prev+curr);
    }
}
