package Scanner4;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Kullanıcıdan bir tamsayı girmesini iste ve ardından
        // tamsayı çift ise “Çift” yazsin
        // tamsayı tek ise “Tek” yazsin

        Scanner input =new Scanner(System.in);
        System.out.println("ÇİFT veya TEK'i kontrol etmek için bir tamsayı girin:");

        int number = input.nextInt();
        /*
        if (number%2==0){
            System.out.println("sayı çift");
        }else if (number%2!=0){
            System.out.println("sayı tek");
        }else {
            System.out.println("geçersiz tamsayı");
        }


         */

        if (number %2==0)
            System.out.println("Cift");
        System.out.println("Tek");
        System.out.println("Tek");
        System.out.println("Tek");

    }
}
