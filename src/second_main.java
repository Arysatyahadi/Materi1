public class second_main {
    public static void main(String[] args) {
        //rumus luas persegi = panjang x lebar
        double panjang = 5.0;
        double lebar = 3.8;
        double luas = panjang*lebar;

        System.out.println("Hasil luas persegi adalah " + luas);

        //rumus luas lingkaran = 3,14 x r2
        double phi = 3.14;
        double jari = 7;
        double hasil = phi*jari*jari;

        System.out.println("Hasil luas lingkaran adalah " + hasil);

        //rumus luas lingkaran versi bu Pradita
        double rr = 7;
        System.out.println("Hasil luas lingkaran adalah " + Math.PI * Math.pow(rr,2));
    }
}