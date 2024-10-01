package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

/**
 * La clase {@code Exercise24} proporciona métodos para crear, manipular y mostrar
 * una colección de tipo {@code Queue}.
 * <p>
 * Incluye métodos para:
 * <ul>
 *     <li>Crear y poblar una cola con elementos específicos.</li>
 *     <li>Recorrer y vaciar la cola mientras se muestran sus elementos.</li>
 * </ul>
 * </p>
 *
 * @version 1.0
 */
public class Exercise24 {

    /**
     * Crea y retorna una cola de tipo {@code LinkedList} poblada con los elementos especificados.
     * <p>
     * Los elementos añadidos son:
     * <ul>
     *     <li>"Smith"</li>
     *     <li>"Montessori"</li>
     *     <li>"Peralta"</li>
     *     <li>"House"</li>
     * </ul>
     * </p>
     *
     * @return Una cola {@code LinkedList<String>} poblada con los elementos especificados.
     */
    public static Queue<String> createQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("Smith");
        queue.add("Montessori");
        queue.add("Peralta");
        queue.add("House");
        return queue;
    }

    /**
     * Recorre la cola especificada, muestra cada elemento por pantalla y lo elimina de la cola.
     * <p>
     * Este método procesa cada elemento de la cola en orden FIFO (First-In-First-Out),
     * mostrando su valor y eliminándolo simultáneamente.
     * </p>
     *
     * @param queue La cola {@code Queue<String>} que se desea recorrer y vaciar.
     */
    public static void printAndEmptyQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            String element = queue.peek(); // Obtiene el elemento en la cabeza de la cola sin eliminarlo
            System.out.println(element);
            queue.poll(); // Elimina el elemento en la cabeza de la cola
        }
    }

    /**
     * Punto de entrada del programa que demuestra la creación, manipulación y visualización
     * de una cola de elementos de tipo {@code String}.
     * <p>
     * El flujo del programa es el siguiente:
     * <ol>
     *     <li>Crear y poblar una cola con los elementos especificados.</li>
     *     <li>Mostrar el elemento en la cabeza de la cola.</li>
     *     <li>Recorrer y vaciar la cola mostrando cada elemento.</li>
     * </ol>
     * </p>
     *
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Crear y poblar la cola
        Queue<String> queue = createQueue();
        System.out.println("Elemento en la cima de la cola: " + queue.peek());
        System.out.println("===================");

        // Recorrer y vaciar la cola mostrando cada elemento
        System.out.println("Recorriendo y vaciando la cola:");
        printAndEmptyQueue(queue);
    }
}
