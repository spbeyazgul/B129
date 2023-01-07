package day11loops;

public class Birden100Kadar6HaricBolunen {
    public static void main(String[] args) {

  //Ex:1'den 100'e kadar 6 ile bolunenler harictum tam sayilari
  //ekrana yazdiriniz.

        for (int i = 1; i <101 ; i++) {

            if (i%6 == 0 ){
                continue;//bosver


            }//if bady

            System.out.print(i+ " ");

        }//for body

        System.out.println();

        //Interwiew
        //Size verilen bir ismi String'i ters ceviren kodu yazdirini.

        String str="Sumeyye";
        String ters="";//yeni bir conteryner olusturduk

        for (int i = str.length()-1; i >-1; i--) {

            char harf=str.charAt(i);
          //  ters=ters+harf;
            ters+=harf;

        }
        System.out.println(ters);
    }
}
