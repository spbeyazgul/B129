package day16multidimensionalarrys;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

      //MultiDimensional Array nasil olusur?
        int a[][]= new  int[3][2];

      // MultiDimensional Array nasil yazdirilir?
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]

      //MultiDimensional Array'lere eleman nasil eklenir?
        a[0][0]=5;
        a[0][1]=12;
        a[1][0]=81;
        a[1][1]=45;
        a[2][0]=123;
        a[2][1]=0;
        //Note: Array'lere non-primitive data konulamaz.
        // Array'lere primitive data veya reference konulur.
       // Ama siz bir array'i yazdirmak istediginizde Java adres'ler yardimi ile non-primitive data'ya ulasir
       // ve o non-primitive data'yi sanki array'in icindeymis gibi gosterir.

        // MultiDimensional Array'lerdeki belli elemanlara nasil ulasilir?

        System.out.println(Arrays.toString(a[2]));//[123, 0]
        System.out.println(a[1][0]);//81
        System.out.println(Arrays.toString(a[0]));//[5, 12]
        System.out.println(a[2][1]);//0








    }
}
