import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mensaje inicial
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Adivina el número entre 1 y 100");

        // Generar un número aleatorio entre 1 y 100
        int numeroSecreto = (int) (Math.random() * 100) + 1;

        int intentos = 0;
        int adivinanza = 0;

        // Mientras el jugador no adivine el número
        while (adivinanza != numeroSecreto) {
            System.out.print("Introduce tu adivinanza: ");
            adivinanza = scanner.nextInt();
            intentos++;

            // Dar pistas al jugador
            if (adivinanza > numeroSecreto) {
                System.out.println("Demasiado alto! Intenta de nuevo.");
            } else if (adivinanza < numeroSecreto) {
                System.out.println("Demasiado bajo! Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        }

        scanner.close();
    }
}
