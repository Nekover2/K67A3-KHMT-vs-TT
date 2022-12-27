import java.util.Scanner;

public class Bai2_mang2chieu {

    public static int[][] inputMatrix(Scanner reader) {
        int n = reader.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = reader.nextInt();
        return arr;
    }

    public static boolean isUpperTriangle(int[][] arr) {
        for (int i = 1; i < arr.length; i++)
            for (int j = i - 1; j >= 0; j--)
                if (arr[i][j] != 0)
                    return false;
        return true;
    }

    public static int[] findRows(int[][] arr) {
        int n = arr.length;
        int[] maxInRow = new int[n];

        for (int i = 0; i < n; i++)
            maxInRow[i] = Integer.MIN_VALUE;

        int trueMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (arr[i][j] > maxInRow[i])
                    maxInRow[i] = arr[i][j];
        
        int cnt = 0;

        for (int val : maxInRow)
            if (val < trueMin) {
                cnt = 1;
                trueMin = val;
            } else if (val == trueMin)
                cnt++;

        int[] res = new int[cnt];
        cnt = 0;
        
        for (int i = 0; i < n; i++)
            if (maxInRow[i] == trueMin)
                res[cnt++] = i;
        return res;
    }

}
