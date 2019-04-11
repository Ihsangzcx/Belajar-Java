import java.util.Scanner;

public class Temperator {
    public static void main(String[] args) {


        int suhu;
        System.out.println("Masukkan Suhu: ");
        Scanner Temperatur = new Scanner(System.in);

        suhu = Temperatur.nextInt();


        if (suhu == 30){
            System.out.println("Suhu " + suhu + " Celcius, Normal");
        }
        else if (suhu < 30){
            System.out.println("Suhu " + suhu + " Cecius, Dingin" );
        }
        else if(suhu >= 40){
            System.out.println("suhu " + suhu + " Celcius, Terlalu panas");
        }
        else {
            System.out.println("Suhu " + suhu + " Celscius, Terlalu Tinggi");

            }

    }
}
