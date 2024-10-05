public class MetodoOrdenamiento {
    public int[] sortBubbleAva(int[] arreglo) {
        int n = arreglo.length;
        boolean intercambio = false;
        for (int i = 0; i < n; i++) {
            intercambio = false;
            System.out.println("Pasada " + i);  // Imprime la pasada actual
            for (int j = 0; j < n - 1 - i; j++) {
                // Corregir la impresión de j+1 y del valor arreglo[j+1]
                System.out.println("j=" + j + " [j]=" + arreglo[j] + " j+1=" + (j + 1) + " [j+1]=" + arreglo[j + 1]);
                
                if (arreglo[j] > arreglo[j + 1]) {
                    System.out.println("Si hay cambio");
                    // Intercambio
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    intercambio = true;
                }
            }
            //Si no hubo intercambio es porque ya esta ordenado y no deberia preguntar más
            if(!intercambio){
                break;
            }
        }
        return arreglo;
    }
    // Método para imprimir el arreglo
    public void printArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}