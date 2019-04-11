import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        System.out.println("Masukkan Suhu : ");
        Scanner scan = new Scanner(System.in);
        int suhu;
        suhu = scan.nextInt();

        switch (suhu){
            case 20 :
                System.out.println("Dingin"); break;

        case 30 :
            System.out.println("Normal"); break;
            default:
                System.out.println("Suhu Tidak Terdeteksi");



        }
    }
}
