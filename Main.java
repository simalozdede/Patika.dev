import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner inp = new Scanner(System.in);
        System.out.print("1. kenarı giriniz: ");
        a = inp.nextInt();

        System.out.print("2. kenarı giriniz: ");
        b = inp.nextInt();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("Hiotenüs: " + c);
    }
}