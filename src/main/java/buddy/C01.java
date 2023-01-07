package buddy;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

     Scanner input =new Scanner(System.in);
        System.out.println("Lutfen bir har isteyini");
        String harf = input.next().toUpperCase();

        if (harf.equals("P")){
            System.out.println("pazar,pazartesi,persembe");

        }
        if (harf.equals("C")){
            System.out.println( "cuma,cumartesi");

        }
        if (harf.equals("Ç")){
            System.out.println("çarsamba");

        }
        }

    }





