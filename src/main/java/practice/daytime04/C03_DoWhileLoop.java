package practice.daytime04;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

/*
     INTERWIER SORUSU
    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */

        int numberofbananas=165;//4  12.........164 ==> geriye 1 muz kaldi
        int survivaldays=1;     //1  2  3        41 ==> 42. gun oldu
        boolean monkeyalive=true;

        do {
            System.out.println("********maymunlar gunde 4 muz yer**************");

            numberofbananas -=4 ;//Toplam muz sayisindan hergun 4 muz eksiktir.
            System.out.println("Kalan muz sayisi"+numberofbananas);
            survivaldays++;
            if (numberofbananas<4){
                monkeyalive=false;

                System.out.println("Bugun"+survivaldays+".gun yeterli muz kalmadi.Maymun rahmetli.Rest in peace");
                System.out.println("Maymun"+survivaldays+".gun oldu");
            }else{
                System.out.println("Bugun"+survivaldays+".gun maymun hala yaziyor ");
            }
        }while (monkeyalive);//do while
    }//main
}
