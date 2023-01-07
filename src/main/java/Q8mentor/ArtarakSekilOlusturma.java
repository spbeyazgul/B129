package Q8mentor;

public class ArtarakSekilOlusturma {
    public static void main(String[] args) {
        //1 den 10 a kadar her satırda bir artırarak aşağıdaki şekli oluşturan Java kodunu yazınız.


        int k=10;
        for (int i = 1; i <11 ; i++) {
            for (int j = 1; j<i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
