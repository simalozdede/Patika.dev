import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //  Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        //tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        double tutar;
        double kdv1 = 0.18, kdv2 = 0.08;
        double kdvliTutar, kdvTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = inp.nextDouble();

        kdvliTutar = (tutar > 1000) ? (tutar * kdv2 + tutar) : (tutar * kdv1 + tutar);

        System.out.println("KDV'siz Fiyat = "+ tutar);
        System.out.println("KDV'li Fiyat =  "+ kdvliTutar);

    }
}