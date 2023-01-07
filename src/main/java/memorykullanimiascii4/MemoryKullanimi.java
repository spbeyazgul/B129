package memorykullanimiascii4;

public class MemoryKullanimi {
    public static void main(String[] args) {

        char ch='A';
        System.out.println(ch);

        //1.Yol
        System.out.println(ch+0);//65

        //2.Yol
        int ch1='a';
        System.out.println(ch1);//97
        int soruIsareti='?';

        //soru=1:  Buyuk A dan Buyuk Z kadar Tum ascci degerli  bir program yziniz

        for (int i = 'A'; i <='Z'; i++) {// A:65
            System.out.print(i+" ");


        }
        System.out.println();

        for (int i = 'a'; i <='z'; i++) {
            System.out.print(i+" ");

        }


        }
    }

