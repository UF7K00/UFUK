import java.util.Scanner;
public class taximetr {
    public static void main(String[] args) {
        int gidilenYol, girisUcreti = 10, kmBasiFiyat = 7, taxiciMaliyeti = 5;
        double ucretT, taxiKazanci;
        System.out.print("Gidilen yolu km cinsinden giriniz: ");
        Scanner input = new Scanner(System.in);
        gidilenYol = input.nextInt();
        ucretT = girisUcreti + (gidilenYol * kmBasiFiyat);
        // giriş fiyatı + km başı tutar
        taxiKazanci = (gidilenYol * kmBasiFiyat) - (taxiciMaliyeti * gidilenYol) + (girisUcreti / 2);
        System.out.println("Gidilen yol: " + gidilenYol);
        System.out.println("Toplam ücret: " + ucretT);
        System.out.println("Taxicinin sizden kazandığı: " + taxiKazanci);
    }
}
