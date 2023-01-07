package Scanner4;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("lutfen yasinizi giriniz.");

        int yas=input.nextInt();
        System.out.println("yasiniz :"+ yas);
    }
}
