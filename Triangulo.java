public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public String determinarTipo() {
        if (lado1 == lado2 && lado2 == lado3) return "Equilátero";
        if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) return "Isósceles";
        return "Escaleno";
    }

    @Override
    public String toString() {
        return "Triangulo{lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "}";
    }
}
