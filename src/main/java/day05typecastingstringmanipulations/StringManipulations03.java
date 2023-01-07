package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {


    public static void main(String[] args) {
/*
Example 1: Aşağıdaki kurallara göre kullanıcının girdiği password ü kontrol ediniz
1) En az 8 karakter olsun
2) Space karakteri password de olmasın
3) En az bir tane büyük harf olsun
4) En az bir tane küçük harf olsun
5) En az bir tane sembol olsun
6) En az bir tane rakam olsun

 */
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen pasapotrunuzu giriniz");
        String pwd = input.nextLine();


        //1) En az 8 karakter olsun

      boolean first =  pwd.length()>7;
        System.out.println(first);//Ac123?Sd //true


        //2) Space karakteri password de olmasın

       boolean second = !pwd.contains(" ");
        System.out.println(second);//Ac123?Sd //true

        //3) En az bir tane büyük harf olsun
        //Note: Buyuk harf olmayanlari sil,
        //      Kalan character sayisina bak
        //      Character sayisi sifir ise buyuk harf yok demektir,
        //      sifirdan buyuk ise buyuk harf var demektir.
       boolean third= pwd.replaceAll("[^A-Z]","").length()>0; // Methodlari ayni satird kullanmaya
        System.out.println(third);//Ac123?Sd //true

        //4) En az bir tane küçük harf olsun

       boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(fourth);//Ac123?Sd //true


        //5) En az bir tane sembol(harf ve rakam harici her sey ) olsun

       boolean fifth= pwd.replaceAll("[a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);//Ac123Sde //false


        //6) En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);//Ac123?Sd //true


        System.out.println("pasword geçerli mi= "+ (first && second && third && fourth && fifth && sixth));




    }
}
