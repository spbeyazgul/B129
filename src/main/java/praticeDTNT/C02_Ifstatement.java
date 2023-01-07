package praticeDTNT;

import java.util.Scanner;

public class C02_Ifstatement {

    public static void main(String[] args) {
 /*

Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
dort islemden biri ile isleme koyup yazdiriniz

  */

        Scanner input =new Scanner(System.in);
        System.out.println("Lutfen \n topalama yapmak icin 1\n  cikarma yapmak icin 2 \n carpma yapmak icin 3 \n bolme yapmak icin 4\n giriniz");

        int islem=input.nextInt();
        System.out.println("lutfen iki tam sayi giriniz");
        double num1=input.nextDouble();// 1. sayi assign edildi
        double num2=input.nextDouble();// 2. sayi assign edildi


        if (islem==1){
            System.out.println("toplama isteminin sonucu :"+ num1+ "+"+num2+"="+(num1+num2));
        } else if (islem==2) {
            System.out.println("cikarma isteminin sonucu :"+ num1+ "-"+num2+"="+(num1-num2));

        } else if (islem==3) {
            System.out.println("toplama isteminin sonucu :"+ num1+ "*"+num2+"="+(num1*num2));

        } else if (islem==4) {
            System.out.println("toplama isteminin sonucu :"+ num1+ "/"+num2+"="+(num1/num2));
        }else
            System.out.println("hatali secim yaptiniz tekrar deneyiniz");
    }

}
