import java.awt.*;
import java.util.Scanner;
public class vucutendex {
    public static void main(String[] args) {
        int boy, kilo;
        System.out.print("Boyunu gir: ");
        Scanner input = new Scanner(System.in);
        boy = input.nextInt();

        System.out.print("Kilonu gir: ");
        Scanner input1 = new Scanner(System.in);
        kilo = input1.nextInt();

        double endex = boy / kilo * kilo;
        System.out.println("Boyunuz: " + boy);
        System.out.println("Kilonuz: " + kilo);
        System.out.print("Vücut kitle indeksiniz: " + endex);
    }
}
