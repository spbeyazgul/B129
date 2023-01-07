package day15arrayss;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //Bir stringdeki sesli harflerin sayisini bulan kodu yaziniz
        // a-e-i-o-u-A-E-I-O-U
        
        String str="Java ogrenince para kazanmak ne kolay,ogrenmeyince ne kadar zor";
        str=str.toLowerCase();
       String harfler[]= str.split("");
        System.out.println(Arrays.toString(harfler));//[j, a, v, a,  , o, g, r, e, n, i, n, c, e,  , p, a, r, a,
        // , k, a, z, a, n, m, a, k,  , n, e,  , k, o, l, a, y, ,, o, g, r, e, n, m, e, y, i, n, c, e,
        // , n, e,  , k, a, d, a, r,  , z, o, r]

        int counter =0;
        //iter==for each loop
        for (String w : harfler) {

            switch (w){
                case "a":
                case "e":
                case "o":
                case "u":
                case "i":
                    counter++;
            }
        }//for each
        System.out.println(counter);
    }
}
