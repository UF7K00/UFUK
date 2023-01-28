import java.util.Scanner;
public class kullanicigirisi {
    public static void main(String[] args) {

        String kullanici, sifre;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı ismini gir: ");
        kullanici = input.nextLine();

        System.out.print("Şifreyi gir: ");
        sifre = input.nextLine();

        if (kullanici.equals("UF7K") && sifre.equals("deneme123"))
        {
            System.out.print("Giriş yapılıyor...");
        }
        else {
            System.out.println("Hatalı giriş denemesi! Yeni şifre oluşturmak ister misiniz?(yes or no)");
            String cevap = input.nextLine();
            if (cevap.equalsIgnoreCase("yes")) {
                System.out.println("Lütfen yeni şifrenizi girin:");
                String yeniSifre = input.nextLine();
                // burada yeni şifreyi veritabanına veya diğer bir yere kaydedebilirsiniz
                System.out.println("Yeni şifreniz kaydedildi. Lütfen tekrar giriş yapın.");
            }
            else {
                System.out.println("Giriş yapılamadı. Program sonlandırılıyor.");
            }
        }
    }
}
