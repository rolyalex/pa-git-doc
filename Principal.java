public class Principal {
    public static void main(String[] args) {
        // Crear y probar un objeto de la clase Elipse
        Elipse elipse = new Elipse(5, 3);
        System.out.println(elipse);
        System.out.printf("Área de la elipse: %.2f%n", elipse.calcularArea());
        System.out.printf("Perímetro de la elipse: %.2f%n", elipse.calcularPerimetro());

        // Crear y probar un objeto de la clase Triangulo
        Triangulo triangulo = new Triangulo(6, 6, 8);
        System.out.println(triangulo);
        System.out.printf("Área del triángulo: %.2f%n", triangulo.calcularArea());
        System.out.printf("Perímetro del triángulo: %.2f%n", triangulo.calcularPerimetro());
        System.out.println("Tipo de triángulo: " + triangulo.determinarTipo());
    }
}
