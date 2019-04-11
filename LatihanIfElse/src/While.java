public class While {
    public static void main(String[] args) {

    int angka = 1;

    //batasan Looping
        while(angka <= 10){
            //Yang Mau di Looping
            if (angka == 8 || angka == 9 || angka == 10) {
                System.out.println("Angkot " + angka + " Rusak");
            }else {
                System.out.println("Angkot " + angka + " Berjalan");
            }


            // Operator Penambahan
            angka++;
        }

    }
}
