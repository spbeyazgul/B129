package day16multidimensionalarrys;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

   //Ex 1: Bir integer multi-dimensional array olusturunuz
   //      Toplam eleman sayisini consal'a yazdiriniz.
   int a[][]={{13,213,4},{12,87},{4,7,1,9},{99}};
        System.out.println(Arrays.deepToString(a));//[[13, 213, 4], [12, 87], [4, 7, 1, 9], [99]]

        // for'un icine data tipini yazmamiz gerekiyor
       // artik int, integer degil. artik o arrays integer
       // o nedenle asagidaki sekilde yazdik
        // for (int[] w : a)

        int sum=0;
        for (int[] w : a) {

            sum=sum + w.length;
        }
        System.out.println(sum);
    }
}
