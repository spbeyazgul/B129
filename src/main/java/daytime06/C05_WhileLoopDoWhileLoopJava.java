package daytime06;

public class C05_WhileLoopDoWhileLoopJava {
    public static void main(String[] args) {

        //0'dan baslayip 6'ya kadar  1'er 1 'er artarak yazdiran kodu olusturunuz.

     int i = 0;
     while (i<6){

         System.out.print("i ="+i+" ");
         i++;

     }
        System.out.println();

     int b = 0;
      do {
          System.out.print("b ="+b+ " ");
          b++;
      }while (b<6);//kontrol en sonda yapildi
    }

}
