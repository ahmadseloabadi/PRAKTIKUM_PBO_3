package tugas.com;

public class Silinder extends Lingkaran {
    private double t;

    public double getTinggi() {
        return t;
    }

    public void setTinggi(double t) {
        this.t = t;
    }

    public Silinder(double rSilinder){
        super(rSilinder);
    }
    public double volume(){
        return (Math.PI*Math.pow(getR(),2)*t);
    }
}
