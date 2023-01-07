package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable olusturmak
        //Java cumlesi = statement
        //Java'da esittir demek "==",Java"da "=="
        //Java'da "=" "assigment operator"dir.Sagdaki degeri alır soldaki kutuya koyar
        //Access Modifier yazmazsanız "access modifer" "default" demekti
        //Data Type + Variable Name ==> veriable Declaration
        //Assigment Operator (Atama Operator)+ Variable degeri ==> Assigment
        //Eger Variable Declaration yapar, Assigment yapmazsanız Java kendi degerini (default)koyar
        //Default degerler sayılar icin sifirdir
        //Data Type'ini yazınız   Variable i//ismi yazınız Assigment (Atama Operatoru) Variable degeri ingilizcedeki nokta gibi
        int                          age             =                                13                 ;
        //ornek 1: ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String'ler icin "default value" "null"dir.

        String studentName= "Ali Can";

      /*
      Java'da iki tip data vardır;
       1)pirimitive data type:
       char: Tek karakterlrt icin kullanilir. A, x, ?, 5
       boolean: boolean'lar sadece iki farkli deger alabilirler; true(dogru) veya false (yanlis)
       byte:128 den +127 e kadar tamsayi degerleri icin kullanilir. (1byte)
       short: -32768 ile 32767 arasindaki tam sayilar icin kullanilir.(2byte)
       int: -2,147,483,648 ile 2,147,483,648 arasindaki sayilar icindir.(4byte)
       long :-9,223,372,036,854,775,808 ile +9,223,372,036,854,775,807 arasında ki sayılar içindir
       flaat:
       double:
       2)non-  pirimitiv data type:
       */

     // ornek 1: char data type'inda ilk ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
     // Note : char data type'inda degerler tek tirnak icine konulmalidir.
     char isminİlkHarf='A';

     // ornek2: boolean data type'inde ilk ismin ilk harfi olarak bir variable olusturunuz ve deger atayiniz
        boolean emeklimisin = false;

     // ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
     byte studentAge=23;

     // ornek5: Site nufusu icin bir variable olusturup bir gerer atayınız.
        short siteNufusu =1200;

     // ornek6: ulke nufuslari icin bir variable olusturup deger atamasi yapiniz.
     int countryPopulation = 1864184648;

     // ornek7: insan vucudundaki hucre sayisi icin veriable olusturup deger atamasi yapiniz.
         long cellNamberInHumanBody = 876543256788L;
         // not : bir deger long ise sonuna "L" veya "l" konulur.
        // Eger long'a atadiginiz deger int'lerin arasinda ise sonuna "L" koymaya gerek yok.
        long weightofsun = 1234567;


    }




    }