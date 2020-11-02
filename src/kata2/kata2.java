/*
Dado un array que se rellenará de valores enteros
realizar una aplicación de consola para el cálculo
del histograma, es decir la frecuencia de cada valor
en ese array.
*/

package kata2;

import java.util.Map;

public class kata2 {
    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        histograma histo = new histograma (data);
        
        Map <String,Integer> histogr = histo.getHistogram();
        
        for (String key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
}
