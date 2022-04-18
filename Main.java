import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
double armutFıyat=2.14,elmaFıyat=3.67,domatesFıyat=1.11,muzFıyat=0.95,patlıcanFıyat=5.00;
double armutKg,elmaKg,domatesKg,muzKg,patlıcanKg;
Scanner input= new Scanner(System.in);
        System.out.print("Alınan armutun kg değeri:");
        armutKg= input.nextDouble();
        System.out.print("Alınan elmanın kg değeri:");
        elmaKg= input.nextDouble();
        System.out.print("Alınan domatesin kg değeri:");
        domatesKg= input.nextDouble();
        System.out.print("Alınan muzun kg değeri:");
        muzKg= input.nextDouble();
        System.out.print("Alınan patlıcanın kg değeri:");
   patlıcanKg= input.nextDouble();
   double toplamFıyat= (armutFıyat*armutKg)+(elmaFıyat*elmaKg)+(domatesFıyat*domatesKg)+(muzFıyat*muzKg)+(patlıcanFıyat*patlıcanKg);
        System.out.println("toplam ücret="+toplamFıyat);
    }
}
