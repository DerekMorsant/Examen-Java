import java.util.Scanner;

public class examen2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("La suma de un numero y su doble");
        System.out.print("Elige tu numero:");
        int num1 = scanner.nextInt();

        int resultado = num1 + ( num1 * 2);

        System.out.println("El resultado es: " + resultado);

        System.out.println("");

        System.out.println("La diferencia entre el cuadrado de un numero y su triple");
        System.out.print("Elige tu numero: ");
        int num2 = scanner.nextInt();

        int resultado1 = (num2 * num2) - (num2 * num2 * num2);

        System.out.println("El resultado es: " + resultado1);

        System.out.println("");

        System.out.println("El promedio de tres numeros");
        System.out.print("Tu primer numero:");
        int num3 = scanner.nextInt();
        System.out.print("Tu segundo numero:");
        int num4 = scanner.nextInt();
        System.out.print("Tu tercer numero:");
        int num5 = scanner.nextInt();

        int resultado2 = (num3 + num4 + num5) / 3; 

        System.out.println("El resultado es: " + resultado2);

        System.out.println("");

        System.out.println("La suma del cuadrado de un numero y el doble de su siguiente numero");
        System.out.print("Dime el valor de x:");
        int num6 = scanner.nextInt();

        int resultado3 = (num6 *num6) + ((num6 + 1) *2);

        System.out.println("El resultado es: " + resultado3);
    }
    
}