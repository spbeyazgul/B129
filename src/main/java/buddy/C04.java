package buddy;

public class C04 {
    public static void main(String[] args) {
      //  'A2b!' için kodunuz konsolda false yazdırmalıdır.
        //'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
       // '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
       // '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
       // '! a b 3 k' kodunuz konsolda false yazdırmalıdır.
                String sifre = "!1a23b4?es";
        Boolean enAzSekizKrkMi= sifre.replaceAll("\\s","").length()>=8;

        Boolean enAzBirSembolVarMi = sifre.replaceAll("\\s","").replaceAll("[A-Za-z0-9]","").length()>0;
        System.out.println("sifre gecerli mi ? " + (enAzSekizKrkMi && enAzBirSembolVarMi));



    }
}
