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
        int [] data = {1,2,3,1,2,1,2,3,1,2,3,2,2,1,2};
        histograma histo = new histograma (data);
        
        Map <Integer,Integer> histogr = histo.getHistogram();
        
        for (int key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));
        }
    }
}
