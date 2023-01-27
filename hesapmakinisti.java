import java.util.Scanner;
public class hesapmakinisti {
    public static void main(String[] args) {
        int s1, s2, sec;
        System.out.print("İlk sayıyı gir: ");
        Scanner input = new Scanner(System.in);
        s1 = input.nextInt();

        System.out.print("İkinci sayıyı gir: ");
        Scanner input2 = new Scanner(System.in);
        s2 = input2.nextInt();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nİşlemlerinden birisini seçiniz: ");
        Scanner input3 = new Scanner(System.in);
        sec = input3.nextInt();

        if (sec == 1) {
            System.out.print(s1 + s2);
        }
        else if (sec == 2) {
            System.out.print(s1 - s2);
        }
        else if (sec == 3) {
                System.out.print(s1 * s2);
        }
        else if (sec == 4) {
            System.out.print(s1 / s2);
            if (s2 != 0) {
                System.out.print(s1 / s2);
            } else {
                System.out.print("Sayılar 0'a bölünemez?");
            }
        }
            else {
                System.out.print("bruh");
            }
    }
}
