package day11forloop;

public class ForLoop04 {
    public static void main(String[] args) {

        // Ex 1: 5'den 8' e kadar tamsayilarin toplamini veren kodu yaziniz
        //       5 + 6 + 7 + 8 ==> 26

        int sum =0;

        for (int i = 5; i <9 ; i++) {
          sum =  sum + i;

        }
        System.out.println(sum);//26

        // Ex 1: 7'den 9' a kadar tamsayilarin carpimini veren kodu yaziniz
        //        7 * 8 * 9  ==> 504

        int Multiply =1;
        for (int i = 7; i <10 ; i++) {

           Multiply = Multiply * i;

        }
        System.out.println(Multiply);//504

    }
}
