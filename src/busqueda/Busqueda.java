package busqueda;

import java.util.Scanner;

public class Busqueda {

    public static void main(String[] args) {
        Scanner objetoConsola=new Scanner(System.in);
        int longArray = 0;
        System.out.println("Introduzca la longitud del array");
        longArray = objetoConsola.nextInt();
        int valor=0;
        System.out.println("Introduzca el numero del que adivinar el indice");
        valor =  objetoConsola.nextInt();
        int[] numeros = new int[longArray];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, valor, 0, numeros.length - 1);
        System.out.println("El indice del valor '"+valor+"' es: " + indice); 
    }

    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else {
            if (posMitad + 1 >= posFinal) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
            }
        }
    }
}
