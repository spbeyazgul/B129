package day16multidimensionalarrys;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {

        //Ex 1:  Bir multi-dimensional array olusturunuz ve bir dimensionalli array donusturunuz.
        //        [ [2, 5], [3] , [4,7,11] ] ==> [2, 5, 3, 4, 7, 11]

        int a[][] = { {2,5}, {3}, {4,7,11} };
        //"a" arrayindeki toplam eleman sayisini bulunuz
        int totalEleman =0;

        for (int[] w:a) {
            totalEleman=totalEleman + w.length;

        }
        //"b" isimli tek dimonsional'li bir array olusturunuz.
        int b[]= new int[totalEleman];
        System.out.println(Arrays.toString(b));//[0, 0, 0, 0, 0, 0]

        //"a" array'indeki elemanlari "b" array'ine transfer ediniz
        int idx = 0;

        for (int[] w : a) {
            for (int k :w ) {
                b[idx] = k;

                idx++;

            }

        }

        System.out.println(Arrays.toString(b));//[2, 5, 3, 4, 7, 11]
    }
}
