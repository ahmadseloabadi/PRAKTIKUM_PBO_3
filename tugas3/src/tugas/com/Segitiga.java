package tugas.com;

import java.lang.Math;

public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double pi = 3.14;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double kel() {
        double miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + miring;
    }
}
