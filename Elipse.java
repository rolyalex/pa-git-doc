public class Elipse {
    private double radioMayor;
    private double radioMenor;

    public Elipse(double radioMayor, double radioMenor) {
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * Math.sqrt((radioMayor * radioMayor + radioMenor * radioMenor) / 2);
    }

    @Override
    public String toString() {
        return "Elipse{radioMayor=" + radioMayor + ", radioMenor=" + radioMenor + "}";
    }
}
