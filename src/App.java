import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MetodoOrdenamiento mO = new MetodoOrdenamiento();
        Scanner scanner = new Scanner(System.in);
        
        // Leer tamaño del arreglo
        int tamanio = leerEnteroValido(scanner, "Ingrese el tamaño del arreglo (debe ser un entero positivo): ", false);
        int[] arreglo = new int[tamanio];
        
        // Leer valores del arreglo
        for (int i = 0; i < tamanio; i++) {
            arreglo[i] = leerEnteroValido(scanner, "Ingrese el valor para la posición " + i + ": ", true);
        }
        
        // Ordenar arreglo
        mO.sortBubbleAva(arreglo);
        
        // Mostrar arreglo ordenado
        System.out.println("Arreglo ordenado:");
        mO.printArreglo(arreglo);
        
        scanner.close();
    }

    // Método para leer y validar un número entero
    public static int leerEnteroValido(Scanner scanner, String mensaje, boolean permitirNegativos) {
        int numero;
        do {
            System.out.println(mensaje);
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next();  // Descartar la entrada no válida
            }
            numero = scanner.nextInt();
            if (!permitirNegativos && numero <= 0) {
                System.out.println("El número debe ser mayor que cero.");
            }
        } while (!permitirNegativos && numero <= 0);  // Si no se permiten negativos, repetir hasta que sea positivo
        return numero;
    }
}
