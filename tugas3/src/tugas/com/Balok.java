package tugas.com;

public class Balok extends PersegiPanjang {
    private double t;

    public double getTinggi() {
        return t;
    }

    public void setTinggi(double t) {
        this.t = t;
    }

    public Balok(double panjangBalok, double lebarBalok){
        super(panjangBalok, lebarBalok);
    }


    public double volume() {
        return (getPanjang()*getLebar()*t);
    }
}
