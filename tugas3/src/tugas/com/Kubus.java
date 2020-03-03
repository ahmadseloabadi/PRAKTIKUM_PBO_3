package tugas.com;

public class Kubus extends Persegi {
    public Kubus(double sisiKubus){
        super(sisiKubus);
    }

    public double volume() {
        return Math.pow(getSisi(),3);
    }
}
