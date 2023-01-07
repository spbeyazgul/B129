package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {

    /*
    1) +,-,*,/ islemleri java'da matematik'te kullanildigi gibi kullanilir.
    Note 1: int / int ==> int olur.
    Note 2) double / int ==> double olur. cunku ; Java'da matematiksel islemlerde farkli data type'lari kullanilirsa sonuc buyuk data type'inda olur.

    2) Java'da "logical operaror" lar vardir.
     AND ve OR islemleri "logical operaror" lardir.
    İ )AND işleminden true alabilmek için her şey true olmalıdır.
       AND işlemi "perfectionist" tir.
       AND işleminde bir tane false sonucu false yapar.

     İİ)OR işleminde bir tane true sonucu true yapmaya yeter.(|| or symbol)
        OR işleminde sonucun false olması için her şey false olmalıdır.
        OR işlemi "polyanna" gibidir.
    İİİ) NOT Operatoru (!) true olani false , false alani true yapar.
         ! true = false
         ! false = true
         ! true = true

    3) Karsilastirma Operatorleri  (Comparison Operators)
       <,>, <= , >=, ==, !=

       Karsilastirma operatorleri.
< kucuktur
> buyuktur
<= kucuk esittir
>= buyuk esittir
== esittir (Java'da tek esittir atama operatorudur. karsilastirma degil)
!= esit degildir

  Note:Karşılaştırma Operatörlerini kullandığınız kesinlikle "boolean (true/false)" alırsınız
  Note: Biz AND islemi icin "&&" kullaniriz ama "&" kullanimda da gecerlidir.
        Farklari nedir?
         "&&" kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir.
          "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
           Bu yuzden biz hep "&&" kullaniriz.


     */

    public static void main(String[] args) {

        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5 >=19;

        System.out.println(first + "-" + second + "-" + third);
        System.out.println(first && second);

        System.out.println(first || second || third);


    }



}
