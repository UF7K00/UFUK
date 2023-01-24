import java.util.Scanner;
public class kdvhesap {
    public static void main(String[] args)
    {
        double KDVO = 0.18, safDeger, maliyet, KDVTutari;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürünün satış fiyatını giriniz: ");
        maliyet = input.nextDouble();
        safDeger = maliyet - (maliyet * KDVO);
        KDVTutari = maliyet - safDeger;
        System.out.println("Toplam maliyet: " + maliyet);
        System.out.println("KDVsiz tutar: " + safDeger );
        System.out.println("KDV tutarı: " + KDVTutari );
    }
}