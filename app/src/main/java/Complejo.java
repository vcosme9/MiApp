public class Complejo {
    private double real, imaginario;

    public Complejo(double r, double i) {
        this.real = r;
        this.imaginario = i;
    }

    public void suma(Complejo a, Complejo b){
        //-Otra forma de hacerlo:
        //  return new Complejo (a.real + b.real, a.imaginario + b.imaginario);
        this.real = a.real + b.real;
        this.imaginario = a.imaginario + b.imaginario;
    }
    public String toString() {
        return real + "," + imaginario;
    }
}
