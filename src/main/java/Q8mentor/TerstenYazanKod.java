package Q8mentor;

import java.beans.JavaBean;

public class TerstenYazanKod {
    public static void main(String[] args) {
        String str= "Java";
        String ters="";

        for (int i = str.length()-1; i>-1; i--) {
            char harf = str.charAt(i);
            ters+=harf;
            System.out.println("Java");
        }
        System.out.println( ters);
    }
}
