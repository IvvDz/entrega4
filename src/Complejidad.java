import java.util.ArrayList;
import java.util.stream.IntStream;

public class Complejidad {
    // Ejercicio 34. ¿Qué es un algoritmo?
    // Un algoritmo es un conjunto finito de instrucciones o reglas bien definidas, que describe
    // un proceso o una serie de pasos para resolver un problema específico.

    // Ejercicio 35. Escribir algoritmos en Java y C para resolver el mismo problema.

    // Algoritmo en Java para sumar los primeros n números naturales de forma iterativa
    public static int sumaNPrimeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    // Algoritmo en C para sumar los primeros n números naturales de forma iterativa

    // Ejercicio 36. Definir O(n) en términos de un límite de cociente de funciones.
    // O(n) se define como el conjunto de funciones para las cuales existe un límite superior
    // f(n) que es una función lineal de n, es decir, f(n) = O(n) si y solo si existe una constante
    // c > 0 tal que f(n)/n <= c para todo n suficientemente grande.

    // Ejercicio 37. Calcular la complejidad temporal de la fórmula para calcular el espacio recorrido por un móvil.

    // La complejidad temporal de e = 1/2 * g * t^2 es O(1) ya que no depende del tamaño de los datos de entrada.

    // Ejercicio 38. Indicar la complejidad temporal asintótica de los siguientes métodos.

    // La complejidad temporal de primero() es O(1) ya que siempre devuelve el primer elemento de la lista en tiempo constante.
    // La complejidad temporal de nEsimo() es O(1) también, ya que acceder al elemento en la posición n es una operación de tiempo constante.

    // Ejercicio 39. Calcular la complejidad temporal de los algoritmos del ejercicio 35.

    // La complejidad temporal del algoritmo sumaNPrimeros() es O(n) ya que recorre todos los números desde 1 hasta n.

    // Ejercicio 40. Resolver un ejercicio y calcular su complejidad temporal.

    public static int listSum(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }
    //es de complejidad 0(n),donde n es el tamaño del array

    // Ejercicio 41. Calcular la complejidad temporal y espacial de algoritmos recursivos.

    public static int sumaRecursivaLista(int[] array, int i, int suma) {
        if (i < 0) return suma;
        suma += array[i];
        return sumaRecursivaLista(array, --i, suma);
    }

    public static int sumaRecursivaLista(int[] array) {
        return sumaRecursivaLista(array, array.length - 1, 0);
    }
    // La complejidad sigue siendo O(n), donde n es el tamaño del array.

    // Ejercicio 42. Calcular la complejidad temporal de un algoritmo en función de la cardinalidad de un conjunto.

    // La complejidad es O(f*c), donde f es el número de filas y c es el número de columnas.
    public static double sumaElementosMatriz(double matriz[][]) {
        double suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    // Ejercicio 43. Calcular la complejidad temporal del siguiente método.

    // En el mejor caso es O(1), en el peor caso O(n), y en promedio O(n/2), lo cual se reduce a O(n).
    public static boolean buscar(int e, int[] array) {
        for (int i : array) {
            if (i == e) return true;
        }
        return false;
    }

    // Ejercicio 44. Escribir un algoritmo para buscar un número en un array de enteros y calcular su complejidad temporal.

    // En el peor caso es O(log n). La búsqueda binaria reduce el espacio de búsqueda a la mitad en cada iteración.
    // El número de iteraciones necesarias para encontrar un elemento en el peor caso es logarítmico en función del tamaño del array original.
    public static boolean busquedaBinaria(int[] array, int e) {
        if (array.length == 1 && array[0] == e) return true;
        if (array.length == 1 && array[0] != e) return false;
        int puntoMedio = array.length / 2;
        if (array[puntoMedio] > e) {
            return busquedaBinaria(Arrays.copyOfRange(array, 0, puntoMedio), e);
        } else if (array[puntoMedio] < e) {
            return busquedaBinaria(Arrays.copyOfRange(array, puntoMedio, array.length), e);
        } else {
            return true;
        }
    }
}

    // Ejercicio 45. Escribir un algoritmo recursivo para buscar un número en un array ordenado de enteros.

    // La complejidad temporal en el peor caso del algoritmo recursivo de búsqueda sería O(log n) ya que realiza
    // búsquedas binarias en el array ordenado.

    // Ejercicio 46. Calcular las complejidades temporal y espacial del algoritmo recursivo de Fibonacci.

    // La complejidad temporal del algoritmo recursivo de Fibonacci es O(2^n) y su complejidad espacial es O(n)
    // debido a la recursividad.

    // Ejercicio 47. Explicar los resultados de los tiempos de ejecución de sumaNPrimeros().

    // Los resultados muestran que el tiempo de ejecución aumenta significativamente con el tamaño de la entrada,
    // lo cual es consistente con una complejidad temporal de O(n) para este algoritmo.

    // Ejercicio 48. Explicar los resultados de los tiempos de ejecución de sumaNMPrimeros().

    // Los resultados muestran un aumento exponencial en el tiempo de ejecución con el tamaño de la entrada,
    // lo cual es consistente con una complejidad temporal de O(n^2) para este algoritmo.

    // Ejercicio 49. Explicar la definición de O(n) mostrada.

    // La definición indica que T(n) está en el orden de f(n) si para valores suficientemente grandes de n,
    // T(n) está acotado superiormente por una constante multiplicada por f(n).

    // Ejercicio 50. Encontrar k y n0 para T(n) = 3 * log2(n) + 2, y responder a otras preguntas relacionadas con O(n).

    // 1. Para mostrar que T(n) es O(log2(n)), podemos elegir k = 5 y n0 = 1.
    //    Para todo n > 1, 3 * log2(n) + 2 <= 5 * log2(n), ya que log2(n) >= 1 para n > 1.
    // 2. Si T(n) ∈ O(log2(n)), entonces T(n) ∈ O(n) también.
    //    Esto es cierto ya que log2(n) crece más lentamente que n, por lo que cualquier función
    //    que sea O(log2(n)) también será O(n).
    // 3. Si T(n) ∈ O(log3(n)), entonces T(n) ∈ O(log2(n)) también.
    //    Esto es cierto porque log3(n) crece más rápido que log2(n), por lo que cualquier función
    //    que sea O(log3(n)) también será O(log2(n)).

    // Ejercicio 51. Estudiar comparativamente el crecimiento de funciones reales de variable real.

    // Las funciones crecen en el siguiente orden: f0(x) < f1(x) < f2(x) < f3(x) < f4(x).

    // Ejercicio 52. Calcular la complejidad temporal asintótica del método f().

    public static int f(int n) {
        if (n == 0) return 1;
        else if (n < 0) return -1;
        else{
            int m = 1/f(n/2) + f(n/2);
            return sum(m);
        }
    }
    //La complejidad temporal asintótica sería 0(2log(n),ya que se divide a la mitad el input de manera recursiva pero se va llamando de 2 en 2) 

    // Ejercicio 53. ¿Es cierto que la complejidad en el caso peor de la inserción en un ArrayList es diferente si el ArrayList está ordenado o no?

    // Sí, es cierto. La inserción en un ArrayList ordenado requiere desplazar elementos para hacer espacio para el nuevo elemento,
    // lo cual tiene una complejidad temporal de O(n). En un ArrayList no ordenado, la inserción al final del ArrayList
    // tiene una complejidad temporal de O(1) amortizado.

    // Ejercicio 54. Calcular el tiempo requerido para diferentes números de ejecuciones.

    // Los cálculos se realizarán considerando el tiempo de instrucción de 10 ns y el tamaño de la entrada n.

    // Para n = 100:
    // log(100) = 2 * 10 ns = 20 ns
    // n = 100 * 10 ns = 1000 ns = 1 µs
    // n * log(n) = 100 * 2 * 10 ns = 2000 ns = 2 µs
    // n^2 = 100^2 * 10 ns = 100000 ns = 0.1 ms
    // n^8 = 100^8 * 10 ns = 10^16 ns = 10^7 ms = 10000 s
    // 10^n = 10^100 * 10 ns = 10^101 ns

    // Para n = 100,000 y tiempo de instrucción de 1 ms:
    // log(100000) = 5 * 1 ms = 5 ms
    // n = 100000 * 1 ms = 100000 ms = 100 s
    // n * log(n) = 100000 * 5 * 1 ms = 500000 ms = 500 s
    // n^2 = 100000^2 * 1 ms = 10^10 ms = 10000 s
    // n^8 = 100000^8 * 1 ms = 10^32 ms
    // 10^n = 10^100000 * 1 ms = 10^100000 ms

    // Ejercicio 55. Explicar por qué el problema del ajedrez todavía no está resuelto.

    // El problema del ajedrez implica una gran cantidad de posibles configuraciones y movimientos, lo que hace
    // que el espacio de búsqueda sea enormemente grande.
}

