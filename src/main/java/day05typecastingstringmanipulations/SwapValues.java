package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer degistirmek. 1. kap:patates 2.kap : domates ==>swap ==> 1. kap: domates 2. kap : patates


    public static void main(String[] args) {

      int a= 12;
      int b= 5;//Swap'den sonra ==> a=5 ve b=12
       int temp= 0;

        System.out.println("a:"+a);//12
        System.out.println("b:"+b);//5

      //1.Yol:
      // I. Adim
      temp = a;
      a=b;
      b= temp;

        System.out.println("a:"+a);//5
        System.out.println("b:"+b);//12

      //2.yol:

        int x = 12;
        int y = 5;

        x = x + y;
        // 12 + 5 = 17 ==> x=17
        y = x - y;
        // 17 - 5 = 12 ==> y=12
        x = x - y;
       // 17 - 12 = 5 ==> x=5







    }
}
