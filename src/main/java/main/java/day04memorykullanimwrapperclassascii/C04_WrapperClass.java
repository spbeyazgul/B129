package main.java.day04memorykullanimwrapperclassascii;

public class C04_WrapperClass {


    /*
    Non-primitive Data turleri sadece data barindirmak icin degil ayni zamanda methodlarda bulundurur.
    primitive Data turleri ise  sadece deger saklar.
    Java bu duruma bir cozum uretmıstir.
    Her primitive data turunu Nom-primitivelere method ekleyerek
    olustururlar bu yeni yapiya Wrapper Class adini vermiştir.

    Primitive        Wrapper
        byte      ==>    Byte
        shart     ==>    Short
        int       ==>    Interger *****
        long      ==>    Long
        float     ==>    Float
        double    ==>    Double
        boolean   ==>    Boolean
        char      ==>    Character *****

     */

    public static void main(String[] args) {

        byte primitiByte= 12;// primitive data type larinda nokta koydugumuzda hic bir method gelmez.
        Byte wrapperByte = 12;//wrapper classlarda nokta koydugunuzda bir cok method kullanabilirz.

        //Ex : byte data type'inde en kucuk ve en buyuk degerleri ekrana yazdirin.

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        // Ex  : short , int , long data type'larinin max ve min degerlerini hesaplatan kodu yaziniz

        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767
        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647
        System.out.println(Long.MIN_VALUE);//-9223372036854775808
        System.out.println(Long.MAX_VALUE);//9223372036854775807

        //*********Primitiv'ler Wrapper Classlara nasil cevrilir (Autuboxing)*******

       float f1 = 13.99F; // kucuk kutu primitive
         Float wrapperF1 = f1;

       // ******** Wrapper Class'lari primitive ve Data typelarina nasil cevrilir? ( Unboxing)*****

        Character W1 = 's';
        char primitiveW1 = W1;


        //Note : Autoboxing ve Unboxing Java tarafindan otomatik yapilir
        //Extra kod yazmaya gerek yoktur

        //Ex : Verilen iki String datatnin toplamini veren kodu yaziniz
        String str1 = "12345";
        String str2 = "6789";
        System.out.println(str1 + str2); //123456789 yan yana yazdirir.

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));//19134



    }
}
