import java.util.Scanner;
public class cinzodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        String zodyak = "";
        System.out.print("Doğduğun yılı gir: ");
        yil = input.nextInt();

        switch (yil % 12) {
            case 0:
                zodyak = "maymun";
                break;
            case 1:
                zodyak = "horoz";
                break;
            case 2:
                zodyak = "köpek";
                break;
            case 3:
                zodyak = "domuz";
                break;
            case 4:
                zodyak = "fare";
                break;
            case 5:
                zodyak = "öküz";
                break;
            case 6:
                zodyak = "kaplan";
                break;
            case 7:
                zodyak = "tavşan";
                break;
            case 8:
                zodyak = "ejderha";
                break;
            case 9:
                zodyak = "yılan";
                break;
            case 10:
                zodyak = "at";
                break;
            case 11:
                zodyak = "koyun";
                break;
            default:
                System.out.print("Bir hata olutu.");
        }
        System.out.println("Doğduğun zodyak " + zodyak + " zodyağıdır.");
    }
}
