import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        double cevre, alan, u;

        Scanner inp = new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a = inp.nextInt();

        System.out.print("2. kenarı giriniz: ");
        b = inp.nextInt();

        System.out.print("3. kenarı giriniz: ");
        c = inp.nextInt();

        u = (a + b + c) / 2;
        cevre = 2 * u;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);
    }
}