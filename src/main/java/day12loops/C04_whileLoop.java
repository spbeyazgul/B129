package day12loops;

public class C04_whileLoop {
    public static void main(String[] args) {

        // 3'den 10' a kadar tamsayilari ayni satira yazdiran kodu yazdirin.

        for (int i = 3; i <11; i++) {
            System.out.print(i+" ");

        }
        //2.yol

        System.out.println();// birlesmemesi icin

        int i=3;//baslangic degeri

        while (i<11){//bitis degeri
            System.out.print(i+" ");
            i++;//artirma while loopun icinde

        }

        System.out.println();
        // 17'den 4'e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz

        int k =17;
        while (k>3){
            if (k%2==0){
                System.out.print(k+" ");
            }//if

            k--;
        }//while
    }//main
}//class
