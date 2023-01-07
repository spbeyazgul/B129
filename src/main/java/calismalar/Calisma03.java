package calismalar;

import java.util.Scanner;

public class Calisma03 {
    public static void main(String[] args) {

       // 1) Herhangi bir 3 öğenin fiyatları için double data tipinde değişkenler oluşturunuz. Fiyatların
      //  toplamını konsola yazdırınız.

        double a = 15.1;
        double b = 12.3;
        double c = 12.4;
        System.out.println(a+b+c);//39.8
      //  2) Herhangi bir 3 öğe için float, long ve integer data tipinde değişkenler oluşturunuz. Bu
     //   değişkenlerin değerlerinin çarpımını konsolda yazdırınız

        float x = 15.99F;
        long y = 13L;
        int z = 12;
        double carp = x*y*z;
        System.out.println(carp);//2494.43994140625

       // 3) Basit faizi bulmak için bir kod yazınız.
        //        Not: Basit faiz formülü = anapara * oran * yılDegeri /100

        int anapara=10000,oran= 6,yilDegeri=3;
        int basitFaiz=anapara*oran*yilDegeri/100;
        System.out.println("basitFaiz = " + basitFaiz);//basitFaiz = 1800

     //   4) Bir String ve iki long data tipinde değişken oluşturunuz. Konsolda bu long değişkenlerin
     //   toplamını ve çarpımını String ile yazdırınız

        String s = "Sonuc ";
        Long k = 123L;
        Long J = 9123456782L;
        System.out.println(s + (a+b));//Sonuc 27.4
        System.out.println(s + a*b);//Sonuc 185.73000000000002

    //    5) Değerleri farklı olan iki boolean data tipinde değişken oluşturunuz ve bu değerleri iki
    //    ardışık değer arasında boşluk bırakacak şekilde aynı satırda yazdırınız
boolean t=true;
boolean f=false;
        System.out.println(t+" "+f);//true false


        //     6) 3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
  //              Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız
        float kitap = 12.99F,defter=23.45F,laptop=32.12F;
        float toplamFiyat=2*kitap+4*defter+3*laptop;
        System.out.println(toplamFiyat);//216.14


        //     7) İki tamsayıyı değiştirmek için bir kod yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayi giriniz");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("degistirmeden once" +n1 +"-"+n2);//degistirmeden once10.0-12.0
        double temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("degisim sonrasi"+n1+"-"+n2);//degisim sonrasi12.0-10.0

    }
}
