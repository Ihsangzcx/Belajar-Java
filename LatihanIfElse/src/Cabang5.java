import java.util.Scanner;

public class Cabang5 {

    public static void main(String[] args) {

        int suhu;
        System.out.println("Masukkan Kondisi suhu: ");
        Scanner nilai = new Scanner(System.in);

        suhu = nilai.nextInt();

        if (suhu <= 20 ) {
            System.out.println("Suhu Sekarang " + suhu + "/Dingin");
        }
        else if (suhu == 29 || suhu == 30){
            System.out.println("Suhu Sekarang " + suhu + "/Normal");
        }
        else if (suhu == 31){
            System.out.println("Suhu Sekarang " + suhu + " /Hangat");
        }
        else if (suhu > 32 || suhu == 100){
            System.out.println("Suhu Sekarang " + suhu + " /Panas");
        }
        else {
            System.out.println("Tidak Terdeteksi");
        }
    }
}
