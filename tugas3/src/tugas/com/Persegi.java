package tugas.com;

public class Persegi extends BangunDatar {
    private double sisi;

    public double getSisi() {
        return sisi;
    }

    @Override
    public double luas() {
        return sisi*sisi;
    }

    @Override
    public double kel() {
        return 4*sisi;
    }

    public Persegi(double sisi){
        this.sisi = sisi;
    }
}
