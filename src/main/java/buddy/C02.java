package buddy;

public class C02 {
    public static void main(String[] args) {

        // :‘ Ali ’ için kodunuz konsolda false yazmalıdır
        // ‘Ali’ için kodunuz konsolda true yazmalıdır
        String s = " Tom ";
        String trimlenmis = s.trim();
        Boolean sonuc = s.equals(trimlenmis);
        System.out.println("basinda ve sonunda bosluk var mi : " + !sonuc);



    }
}
