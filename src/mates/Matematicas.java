package mates;

import java.util.Random;

public class Matematicas {
    /**
     * Genera una aproximación al número pi mediante el método de Montecarlo de forma recursiva.
     * El parámetro `pasos` indica el número de puntos generado.
     */
    public static double generarNumeroPiRecursivo(long pasos) {
        return generarNumeroPiRecursivo(pasos, 0, 0);
    }

    private static double generarNumeroPiRecursivo(long pasos, long puntosDentroCirculo, long puntosTotales) {

        if (pasos == 0)
            return 4.0 * puntosDentroCirculo / puntosTotales;

        Random random = new Random();
        double x = random.nextDouble();
        double y = random.nextDouble();

        if (x * x + y * y <= 1)
            puntosDentroCirculo++;

        puntosTotales++;

        return generarNumeroPiRecursivo(pasos - 1, puntosDentroCirculo, puntosTotales);
    }
}
