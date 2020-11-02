/*
Dado un array que se rellenará de valores enteros
realizar una aplicación de consola para el cálculo
del histograma, es decir la frecuencia de cada valor
en ese array.
*/

package kata2;
public class kata2 {
    public static void main(String[] args) {
        int [] data = {1,2,3,1,2,1,2,3,1,2,3,2,2,1,2};
        histograma res = new histograma ();
           
        for (int key : data) {
            res.put(key,res.contiene(key)?res.get(key)+1:1);
        }
        
        System.out.println(res);
    }
    
}
