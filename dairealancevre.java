import java.util.Scanner;
public class dairealancevre {
    public static void main(String[] args) {
        int r;
        System.out.print("Dairenin yarı çapını giriniz: ");
        Scanner input = new Scanner(System.in);
        r = input.nextInt();
        double pi = 3.14;
        double cevre = 2 * pi * r;
        double alan = pi * r * r;
        System.out.println("Dairenin alanı: " + alan);
        System.out.print("Dairenin çevresi: " + cevre);
    }
}
