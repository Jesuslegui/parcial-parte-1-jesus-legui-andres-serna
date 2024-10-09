
import java.util.Scanner;

public class VerificadorArmstrong_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Verificador de Números de Armstrong");
        System.out.println("Ingrese un número: ");
        
        int numero = scanner.nextInt();
        int original = numero;
        int suma = 0;
        int digitos = 0;
        
        
        int temp = numero;
        while (temp != 0) {
            digitos++;
            temp = temp / 10;
        }
        
        
        while (numero != 0) {
            int digito = numero % 10;
            int potencia = 1;
            
            
            for (int i = 0; i < digitos; i++) {
                potencia = potencia * digito;
            }
            
            suma = suma + potencia;
            numero = numero / 10;
        }
        
        
        if (suma == original) {
            System.out.println(original + " es un número de Armstrong");
        } else {
            System.out.println(original + " no es un número de Armstrong");
        }
        
        scanner.close();
}
}
