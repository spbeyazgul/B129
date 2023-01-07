package buddy;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("gun ismi giriniz");
        String gun=input.nextLine();

        if (gun.equalsIgnoreCase("cuma")){

            System.out.println("muslumanların kutsal gunu");


        }else if (gun.equalsIgnoreCase("cumartesi")){
            System.out.println("yahudilerin kutsal gunu");

        } else if (gun.equalsIgnoreCase("pazar")) {
            System.out.println("hiristiyanların kutsal gunu");

        }else {
            System.out.println("gecerli gun giriniz");
        }

    }
}
