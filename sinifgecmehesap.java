import java.util.Scanner;
public class sinifgecmehesap {
    public static void main(String[] args) {
        double mat, kimya, astronomi, ingilizce, mantik, sonuc;
        System.out.print("Mantık notu gir: ");
        Scanner input = new Scanner(System.in);
        mantik = input.nextInt();
        System.out.print("Mat notu gir: ");
        mat = input.nextInt();
        System.out.print("Kimya notu gir: ");
        kimya = input.nextInt();
        System.out.print("Astronomi notu gir: ");
        astronomi = input.nextInt();
        System.out.print("İngilizce notu gir: ");
        ingilizce = input.nextInt();
        sonuc = (mat + astronomi + kimya + ingilizce + mantik) / 5;
        System.out.println("Ortalamanız: " + sonuc);
        if (sonuc > 85) {
            System.out.print("Takdir alıyorsunuz!");
        } else if (sonuc > 75 && sonuc < 85){
            System.out.print("Teşekkür alıyorsunuz!"); }
            else if (sonuc < 50) {
                System.out.print("Sınıfta kaldın!");
        }
    }
}
