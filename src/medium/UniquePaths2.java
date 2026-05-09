package medium;

import java.util.Arrays;

public class UniquePaths2 {

    public static void main(String[] args) {
        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int result = uniquePathsWithObstacles(obstacleGrid);
        System.out.println("Number of unique paths: " + result);
    }

    public static int uniquePathsWithObstacles(int[][] matrix){
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] dp = new int[m][n];
            for(int i = 0; i < m; i++) {
                if (matrix[i][0] == 1) {
                    break;
                }
                dp[i][0] = 1;
            }
            for(int j = 0; j < n; j++) {
                if (matrix[0][j] == 1) {
                    break;
                }
                dp[0][j] = 1;
            }
        System.out.println(Arrays.deepToString(dp));

        for (int i = 1; i < m ; i++) {
            for(int j =1; j<n;j++){
                if(matrix[i][j] == 1){
                    dp[i][j] =0;
                }else{
                    dp[i][j] = dp[i-1][j]+ dp[i][j-1];
                }

            }
        }

        return dp[m-1][n-1];


//            for (int i = 1; i < m; i++) {
//                for (int j = 1; j < n; j++) {
//                    if(matrix[i][j] == 1) {
//                        dp[i][j] = 0;
//                    } else {
//                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
//                    }
//                }
//            }
//            return dp[m-1][n-1];
    }
}
