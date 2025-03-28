import java.util.Scanner;

public class exameen2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {5, 8, 12, 5, 9, 7, 12, 14, 8, 5, 9, 12, 7, 5, 8, 14, 8, 12, 7, 9};
        int opcion;
        
        do {
            System.out.println("Menu de opciones:");
            System.out.println("1. Calcular la moda");
            System.out.println("2. La mitad es");
            System.out.println("3. Di hola mundo");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {

                case 1:
                    int moda = 0;
                    int Contador = 0;
                    
                    for (int i = 0; i < numeros.length; i++) {
                        int contador = 0;
                        for (int j = 0; j < numeros.length; j++) {
                            if (numeros[j] == numeros[i]) {
                                contador++;
                            }
                        }
                        if (contador > Contador) {
                            Contador = contador;
                            moda = numeros[i];
                        }
                    }
                    
                    System.out.println("La moda es: " + moda);
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Dime el numero del que deseas la mitad: ");
                    int num = scanner.nextInt();
                    System.out.println("La mitad de tu numero es: " + (num / 2));
                    System.out.println("");

                    break;
                case 3:
                    System.out.println("Hola mundo");
                    System.out.println("");

                    break;
                case 4:
                    System.out.println("Saliendo del programa...");

                    break;
                default:
            
                    break;
            }
        } while (opcion != 4);
        
    }
}