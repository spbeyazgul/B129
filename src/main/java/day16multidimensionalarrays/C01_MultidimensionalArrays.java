package day16multidimensionalarrays;

import java.util.Arrays;

public class C01_MultidimensionalArrays {
    public static void main(String[] args) {

        /*
        Bir Array'in icindeki data yine bir Array ise buna multidimensional Array denir.
         */

        //Multidimensional arrayler nasil olusturulur?

        int arr [][]=new  int[3][2];//auter array ==3  kat sayisi

        // inner array =2 olan bir Multidimensional array olusturduk.  katta 2 daire olusturmak
        //Bu yontemle inner arrayler sabit olmak zorunda

        System.out.println(Arrays.toString(arr));//[[I@48140564, [I@58ceff1, [I@7c30a502]
        //İcindeki data non-primitive oldugu icin ardesleri gorurum.

        System.out.println(Arrays.toString(arr[1]));//[0, 0]
        System.out.println(Arrays.toString(arr[2]));//[0, 0]
        System.out.println(Arrays.deepToString(arr));//MULTIDIMENSIONAL ARRAYLER BU SEKILDE YAZDIRILIR
        //[[0, 0], [0, 0], [0, 0]]

        //Arraylere eleman eklemenin 2.yontemi ile
        //hem declare edep hamle hemde deger atama yontemi

        int arr2[][]={ {2,3} ,{9} ,{78,6,4,5} };
        System.out.println("Hem declare hemde deger atamasi ile"+Arrays.deepToString(arr2));//[[2, 3], [9], [78, 6, 4, 5]]
        System.out.println("Hem declare hemde deger atamasi ile"+Arrays.toString(arr2[2]));//[78, 6, 4, 5]
        System.out.println("Hem declare hemde deger atamasi ile"+Arrays.toString(arr2[0]));//[2, 3]
        System.out.println("Hem declare hemde deger atamasi ile"+Arrays.toString(arr2[1]));//[9]

        //Multidimensional Arraylere eleman nasil eklenir?
        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        System.out.println(Arrays.deepToString(arr));//[[3, -4], [6, 18], [-7, 0]]
        System.out.println(Arrays.toString(arr[1]));//[6, 18]
        System.out.println(arr[1][0]);//6

        //Ex: String bir multidimensional Array olusturun
        //icerisine datalari ekleyin
        //toplam eleman sayisini ekrana yazdirin

        String brr [][]= new String[3][2];
        brr [0][0]="a";
        brr [0][1]="b";

        brr [1][0]="c";
        brr [1][1]="d";

        brr [2][0]="e";
        brr [2][1]="f";
        System.out.println(Arrays.deepToString(brr));//[[a, b], [c, d], [e, f]]

        int sum=0;//toplam kac daire oldugu bilgisi burada

        for (String[] w :       brr) {    // w=each(her bir) w=Array
            sum=sum+ w.length;

        }//for
        System.out.println(sum);//6

    }
}
