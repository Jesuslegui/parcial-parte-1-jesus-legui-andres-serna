import java.util.Scanner;

public class VerificadorNumeroPerfecto_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Dame un número y te digo si es perfecto: ");
            int numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Por favor, introduce un número positivo.");
            } else {
                int sumaDivisores = calcularSumaDivisores(numero);

                if (sumaDivisores == numero) {
                    System.out.println(numero + " es un número perfecto!");
                } else {
                    System.out.println(numero + " no es un número perfecto.");
                }
            }

            System.out.print("¿Quieres verificar otro número? (s/n): ");
            String respuesta = scanner.next();
            continuar = respuesta.equalsIgnoreCase("s");
        }

        scanner.close();
    }

    public static int calcularSumaDivisores(int num) {
        int suma = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
