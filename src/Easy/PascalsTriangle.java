package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));

    }
    public static  List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascalList = new ArrayList<>();
        if(numRows >=1){
            pascalList.add(Arrays.asList(1));
        }
        if(numRows  >=2) {
            pascalList.add(Arrays.asList(1, 1));
        }

        int i=3;
        while(i<= numRows){
            Integer[] pascalRow = new Integer[i];
            pascalRow[0] = 1;
            pascalRow[i-1] =1;
            for(int j=1; j< i-1; j++){
                int val = pascalList.get(i-2).get(j-1)  + pascalList.get(i-2).get(j);
                pascalRow[j]=val;
            }

            pascalList.add(Arrays.asList(pascalRow));
            i++;
        }
        return pascalList;
    }
}
