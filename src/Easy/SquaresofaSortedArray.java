package Easy;

import java.util.Arrays;

public class SquaresofaSortedArray {

    public static void main(String[] args) {
        SquaresofaSortedArray s = new SquaresofaSortedArray();

    }

    public int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).mapToDouble(x-> (int) Math.pow(x, 2)).sorted().mapToInt(x-> (int) x).toArray();
    }
}
