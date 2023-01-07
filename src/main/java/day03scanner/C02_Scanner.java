package day03scanner;

import java.util.Scanner;

public class C02_Scanner {

    //Scanner kullaici ile etkilesim kurmamızı saglar.
    //Scanner bir class'tır Java util kutuphanesinden getirildigi icin import ister..


    public static void main(String[] args){

        //Kullanicidan Data Almak icin
        //1.Adimda Scanner Class'indan Object olusturun.

        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);


        //2.adim kullaniciya ne yapacagini soyle.
        System.out.println("Lutfen yasinizi giriniz");

        //3. Adim Kullanicidan aldiginiz datayı variable icine koyunuz.
        byte age= input.nextByte();




        // Kullaniciya ad,memleket,yas , boy
        // yasadigi yeri sevip sevmedigi program yaziniz.

        Scanner Scan= new Scanner(System.in);


        System.out.println( "lutfen kullaici adini giriniz");
        String isim= scan.nextLine(); // kullanicidan String bir deger istedik tum satiri olmasi icin nexline sectik.
        System.out.println("Lutfen memleket giriniz....");
        String memleket= scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println("lutfen boyunuzu giriniz.");
        short boy= scan.nextShort();
        System.out.println("lutfen yasadıiniz yeri sevip sevmediginizi yaziniz.");
        boolean seviyorum = scan.hasNextBoolean();
        System.out.println("******************");
        System.out.println("isim="+ isim);
        System.out.println("memleket="+ memleket);
        System.out.println("yas="+ yas);
        System.out.println("boy="+boy);
        System.out.println("seviyorum = " + seviyorum);


        }
}
