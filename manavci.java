import java.util.Scanner;
public class manavci {
    public static void main(String[] args) {

        double brokoli = 14.9, elma = 12.3, hCevizi = 27.3, erik = 18.7;
        double brokoliKG, elmaKG, hCeviziKG, erikKG, toplam;

        System.out.println("Rüstem bakkala hoşgeldiniz...");

        System.out.print("Brokolinin kilosunu giriniz: ");
        Scanner input = new Scanner(System.in);
        brokoliKG = input.nextDouble();

        System.out.print("Elmanın kilosunu giriniz: ");
        Scanner input2 = new Scanner(System.in);
        elmaKG = input2.nextDouble();

        System.out.print("Hindistan cevizinin kilosunu giriniz: ");
        Scanner input3 = new Scanner(System.in);
        hCeviziKG = input3.nextDouble();

        System.out.print("Eriğin kilosunu giriniz: ");
        Scanner input4 = new Scanner(System.in);
        erikKG = input4.nextDouble();

        toplam = (brokoliKG * brokoli) + (hCeviziKG * hCevizi) + (elmaKG * elma) + (erikKG * erik);
        System.out.print("Toplam fiyat: " + toplam);
    }
}
