package main.java.day04memorykullanimwrapperclassascii;

public class C03_MantikOperatorleri {

    //10< sayi MantikOperatoru sayi<20;

    // == Esittir icin cift == kullanilir = tek esittir atama (assigmment) yapar.

    /*
    Java uclu karsılastirma kabul etmez.
    ikili karsılastirmalar yapip Mantik operatorleriyle birlestirmeliyiz.


    && == ve and || ar operatoru veya demek.
    &&

    cay  ve Limon
      +  && +       = true
      +  && -       = false
      -  && +       = false
      -  && -       = false

      && ile &
      && 'de boolen sonucta bir tane false bulunca durur
      & 'de ise tum satiri tarar sonra durur.
      buda && 'in &'den daha hizli calismasını saglar.



      // veya operatoru Polyanavidir.En ufak bir pozitiflikten true doner.

          cay  veya Limon
      +  //      +       = true
      +  //      -       = true
      -  //      +       = true
      -  //      -       = false





     */

    public static void main(String[] args) {

        System.out.println(5+2 == 8); // false

        boolean sonuc1 = 5>4 && 7<9 && 6+3 == 9 && 5+2 != 8;

        System.out.println(sonuc1); // true

        boolean sonuc2 = 5>4 && 7>9 && 6+3 == 9 && 5+2 ==7;
        System.out.println(sonuc2); // false


        int sayi1 = 15;

        System.out.println(10 < sayi1 && sayi1 < 20);// true

        int sayi2 = 5;

        System.out.println(sayi2<10  || sayi2 > 20);// true


    }


}
