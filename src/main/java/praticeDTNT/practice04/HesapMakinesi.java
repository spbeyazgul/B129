package praticeDTNT.practice04;

public class HesapMakinesi {

    public  void  toplama(int...a){
        int toplam=0;
        for (int w :a) {

            toplam+=w;
        }

        System.out.println(toplam);
    }

    public  void  cikarma(int...a){
        int fark
                =0;
        for (int w :a) {

            fark-=w;
        }

        System.out.println("fark:"+fark);
    }
    public  void  carpma(int...a){
        int carpma =1;
        for (int w :a) {
             carpma*=w;
        }

        System.out.println("carpma:"+carpma);
    }
    public  void  bolme(int a,int b ){

        if (b==0){


        System.out.println("Hicbir sayi sifira bolunemez");

        }else {
            System.out.println("Bolme:"+ a/b);
        }


    }

}
