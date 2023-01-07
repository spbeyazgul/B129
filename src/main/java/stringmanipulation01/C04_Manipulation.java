package stringmanipulation01;

public class C04_Manipulation {
    public static void main(String[] args) {

/*
        soru 4)Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
         */
        String str="omer faruk ";
        int sonkarakterindex=str.trim().length()-1;
        String sonkarakter=str.substring(sonkarakterindex,sonkarakterindex+1);
        System.out.println("son karakter : " +sonkarakter);


    }
}





