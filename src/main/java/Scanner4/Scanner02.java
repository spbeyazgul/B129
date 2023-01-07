package Scanner4;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        //  uzunluk, genişlik, yükseklik olan dikdörtgenler prizmasının hacmini hesaplayan bir program yazıniz
        // İpucu: dikdörtgenin hacmi= width*height*length;

        Scanner input=new Scanner(System.in);
        System.out.println("uzunluk giriniz");
        int length= input.nextInt();

        System.out.println("genislik giriniz");
        int width= input.nextInt();

        System.out.println("uzunluk giriniz");
        int height=input.nextInt();

        System.out.println("dikdortgen hacmi:"+ length*width*height);

    }
    public static int dikdortgenHacmi(int lenght,int width, int height){
        return lenght*width*height;
    }

}
