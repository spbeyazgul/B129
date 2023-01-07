package memorykullanimiascii4;

public class AsciiValue03 {
    public static void main(String[] args) {

       /*
            a
            a b
            a b c
            a b c d
            a b c d e
       şeklini yazdırınız.
       */
       char input = 'f';
        for (int i = 'a'; i <input ; i++) {


            for (int j = 'a'; j <=i; j++) {
                System.out.print(j+ " ");
            }

            System.out.println("");

        }
    }
}
