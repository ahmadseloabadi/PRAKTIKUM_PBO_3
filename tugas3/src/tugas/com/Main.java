package tugas.com;

public class Main {

    public static void main(String[] args) {

        Persegi PERSEGI = new Persegi(12);
        System.out.println("\n == Persegi");
        System.out.println("Luas : " + PERSEGI.luas());
        System.out.println("Keliling : " + PERSEGI.kel());

        Lingkaran lingkaran = new Lingkaran(10);
        System.out.println("\n == Lingkaran");
        System.out.println("Luas : " + lingkaran.luas());
        System.out.println("Keliling : " + lingkaran.kel());

        PersegiPanjang PERSEGIPANJANG = new PersegiPanjang(8,6);
        System.out.println("\n == Persegi Panjang");
        System.out.println("Luas : " + PERSEGIPANJANG.luas());
        System.out.println("Keliling : " + PERSEGIPANJANG.kel());

        Segitiga SEGI3 = new Segitiga();
        SEGI3.setAlas(8);
        SEGI3.setTinggi(12);
        System.out.println("\n == Segitiga");
        System.out.println("Luas : " + SEGI3.luas());
        System.out.println("Keliling : " + SEGI3.kel());

        Kubus KUBUS = new Kubus(PERSEGI.getSisi());
        System.out.println("\n == Kubus");
        System.out.println("Volume : " + KUBUS.volume());

        Balok BALOK = new Balok(PERSEGIPANJANG.getPanjang(),PERSEGIPANJANG.getLebar());
        BALOK.setTinggi(10);
        System.out.println("\n == Balok");
        System.out.println("Volume : " + BALOK.volume());

        Silinder SILINDER = new Silinder(lingkaran.getR());
        SILINDER.setTinggi(5);
        System.out.println("\n == Silinder");
        System.out.println("Volume : " + SILINDER.volume());
    }
}
