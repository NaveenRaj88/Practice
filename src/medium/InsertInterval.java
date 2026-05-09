package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public static void main(String[] args) {
        int[][] intervals = {{1,5}};
        int[] newInterval = {2,7};
        int[][] testArray = new int[1][1];
        testArray[0] = newInterval;
//        System.out.println(Arrays.deepToString(testArray));
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));
    }

    public static int[][] inserts(int[][] intervals, int[] newInterval){
        int i=0;
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            i++;
        }
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        int[][] result = new int[intervals.length - (i-1) + 1][2];
        System.arraycopy(intervals, 0, result, 0, i-1);
        result[i-1] = newInterval;
        System.arraycopy(intervals, i, result, i, intervals.length - i);
        return result;
    }

    public static int[][] insert(int[][] intervals, int[] newInterval ){
        int[][] newArray = Arrays.copyOf(intervals, intervals.length+1);
        newArray[intervals.length] = newInterval;
        Arrays.sort(newArray, (a,b)-> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        int index =0;
        list.add(intervals[0]);
        boolean isAdditionDone = false;
        for(int j=1; j<newArray.length; j++){
           if(list.get(index)[1] >= newArray[j][0]){
                list.get(index)[1] = Math.max(list.get(index)[1], newArray[j][1]);
            }else{
                index++;
                list.add(index, newArray[j]);
            }
        }
        int[][] newIntervals = new int[list.size()][2];
        for(int i=0; i< list.size(); i++){
            newIntervals[i] = list.get(i);
        }
        return newIntervals;
    }

}
