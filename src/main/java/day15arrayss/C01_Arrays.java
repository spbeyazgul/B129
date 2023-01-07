package day15arrayss;

import java.util.Arrays;
import java.util.Scanner;

public class C01_Arrays {
    public static void main(String[] args) {


        //Bir ogretmenini okulundaki ogrencilerin isimlerini application yuklemesini saglayan kodu yaziniz.

        Scanner input=new Scanner(System.in);
        System.out.println("kac ogrenci ismi gireceksiniz");
        int numofStd=input.nextInt();
        String names[] =new String[numofStd];
        System.out.println("Cikmak istiyorsan Q harfine basiniz");

        for (int i =1; i <=numofStd; i++) {
            System.out.println("Lutfen "+i+". ogrencinin ismini giriniz");

          String stdNames =  input.next();//Emir
            if (stdNames.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1]=stdNames;
        }
        System.out.println(Arrays.toString(names));
    }
}
