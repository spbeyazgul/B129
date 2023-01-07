package buddy;

public class C03 {
    public static void main(String[] args) {
        // Bir String’ in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod
        //yazınız.
        //  Örnek:‘Ali’ için kodunuz konsolda false yazdırmalıdır
        // ‘ali.’ için kodunuz konsolda false yazdırmalıdır
        //‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
        // ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
        //  ‘ALI.’ için kodunuz konsolda true yazdırmalıdır

        String s = "Tom Hanks.";
        char ilkKrk = s.charAt(0); char sonKrk = s.charAt(s.length()-1);
        Boolean ilkKrkBuyukMu = ilkKrk >='A' && sonKrk <='Z';
        Boolean sonKrkNoktaMi= sonKrk =='.';
        Boolean ilkKrkBuyukSonKrkNoktaMi = ilkKrkBuyukMu && sonKrkNoktaMi;
        System.out.println("Ilk karakter buyuk harf, son karakter nokta mi? "+ilkKrkBuyukSonKrkNoktaMi);



    }
}
