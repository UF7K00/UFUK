import java.util.Scanner;
// kullanıcıdan veri alma
public class Main {

    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin dik kenarlarından birini yaz: ");
        a = input.nextInt();
        System.out.print("Üçgenin diğer dik kenarını yaz: ");
        b = input.nextInt();
        c = Math.sqrt((a * a) + (b * b));
        System.out.print(c);
    }
}