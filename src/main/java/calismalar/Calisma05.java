package calismalar;

import java.util.Arrays;

public class Calisma05 {
    public static void main(String[] args) {

        // sogratif sorusu

        int arr[][] = {{5, 12}, {3, 8, 4}, {6, 3}};

        System.out.println(m(arr));
    }
    public static int m(int[][] arr) {
        int r, c;
        int i, k = 0;
        for (r = 0; r < arr.length ;r++) {
            for (c = 0; c < arr[0].length; c++) {
                i = arr[r][c];
                if (i > k)

                    k = i;
            }
        }
        return k;
    }
}



