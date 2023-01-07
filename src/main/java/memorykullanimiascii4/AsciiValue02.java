package memorykullanimiascii4;

public class AsciiValue02 {
    public static void main(String[] args) {

        //soru=2:  kucuk a dan kucuk z kadar ascci degerli toplyan bir program yziniz


        int toplam=0;
        for (int i = 'a'; i <='z'; i++) {
            System.out.println(i+" ");
            toplam=toplam+i;
        }
        System.out.println("Adan z ye kadar toplami : "+toplam);//2847
    }
}
