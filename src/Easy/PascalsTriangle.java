package Easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));

    }
    public static  List<List<Integer>> generate(int numRows) {
        int i =1;
        List<List<Integer>> pascalList = new ArrayList<>();
        while(i<= numRows){
            int[] pascalNums = new int[i];
            pascalNums[0]=1;
            pascalNums[i-1] =1;
            int j=1;
            while(j<=i){

                j++;
            }

        i++;
        }
        return pascalList;
    }
}
