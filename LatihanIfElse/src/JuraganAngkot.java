import java.util.Scanner;
public class JuraganAngkot {
    public static void main(String[] args) {
        //* Memakai unary
        Scanner  nilai = new Scanner(System.in);
        for (int AwalMulai=1; AwalMulai<=10; AwalMulai++)
            if (AwalMulai == 8 || AwalMulai == 9 || AwalMulai == 10) {
                System.out.println("Angkot " + AwalMulai + " Rusak");
            }else {
                System.out.println("Angkot " + AwalMulai + "Sedang Berjalan");
            }
            }
        }



