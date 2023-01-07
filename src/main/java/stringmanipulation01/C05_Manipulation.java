package stringmanipulation01;

public class C05_Manipulation {

    public static void main(String[] args) {

       /*
         Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
         ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
         yazdırınız.
         */

        String sehirIsmi="angara";
        String str=sehirIsmi.trim().toLowerCase();
        str=str.substring(0,1).toUpperCase()+str.substring(1);
        System.out.println(str);

    }
}



