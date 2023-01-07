package day11loops;

public class KarekteriTekerTekeryazdiran {

    //       INTERWIEN QUESTIONS
    public static void main(String[] args) {

        //String karakterleri teker teker yazdiran;
        // Eger 'a' karakterini gorurse yazdirmayi durduran kodu yaziniz
        
        String cumle="ogrenmek yasamin tek kanitidir";

        for (int i = 0; i <cumle.length()-1;     i++) {
            if (cumle.charAt(i) == 'a'){
                break;

            }//if bady

            System.out.print(cumle.charAt(i)+"  ");


        }



    }
}
