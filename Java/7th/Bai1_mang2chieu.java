import java.util.*;

public class Bai1_mang2chieu {
    public static int[][] inputMatrix(Scanner reader) {
        int n = reader.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = reader.nextInt();
        return arr;
    }

    public static boolean isDiagDominant(int[][] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr[0].length; j++)
                if (arr[i][j] != 0)
                    return false;
        return true;
    }

    public static int[] findColumns(int[][] arr) {
        int n = arr.length;
        int[] minInCol = new int[n];
        int trueMin = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
            minInCol[i] = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (arr[i][j] < minInCol[j])
                    minInCol[j] = arr[i][j];

        int cnt = 0;

        for (int val : minInCol)
            if (val > trueMin) {
                trueMin = val;
                cnt = 1;
            } else if (val == trueMin)
                cnt++;

        int[] res = new int[cnt];
        cnt = 0;

        for (int i = 0; i < n; i++)
            if (minInCol[i] == trueMin)
                res[cnt++] = i;
        return res;
    }

    public static void main(String[] args) {

    }

}
