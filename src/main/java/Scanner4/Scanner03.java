package Scanner4;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
//  Kullanıcıdan ad, ikinci ad, soyadı, SSN’yi alın ve ardından aşağıdaki gibi yazdırın
        //Ali Mert Can
        //kkno:123456789

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen adinizi giriniz");
        String name=input.next();

        System.out.println("lutfen ikinci adinizi giriniz");
        String name1= input.next();

        System.out.println("lutfen soy adinizi giriniz");
        String name2= input.next();

        System.out.println("lutfen kimlik numaranizi giriniz");
        int kkno = input.nextInt();


        System.out.println(name1+ " "+name2 + " "+kkno);

        System.out.println("Kkno : "+kkno);


    }
}
