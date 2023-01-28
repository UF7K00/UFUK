import java.util.Scanner;
public class gunonerisi {
    public static void main(String[] args) {
        int cevap;
        System.out.print("Bugün hava kaç derece? : ");
        Scanner input = new Scanner(System.in);
        cevap = input.nextInt();

        if (cevap >= 25) {
            System.out.println("Bugün hava " + cevap + " derece!");
            System.out.print("Biraz yüzmeye ne dersin?");
        } else if ((cevap < 25) && (cevap >= 15)) {
            System.out.println("Bugün hava " + cevap + " derece!");
            System.out.print("Piknik yapmak iyi gelebilir.");
        } else if ((cevap) < 15 && (cevap > 5)) {
            System.out.println("Bugün hava " + cevap + " derece!");
            System.out.print("Sinemaya gidebilirsin.");
        } else if (cevap <= 5) {
            System.out.println("Bugün hava " + cevap + " derece!");
            System.out.print("Bugün hava soğuk. Kayak yapmanı öneririm.");
        }
    }
}
