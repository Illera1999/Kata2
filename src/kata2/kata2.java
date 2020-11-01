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
           
        for (int i = 0; i < data.length; i++) {
           int j = data[i];
           if (res.contiene(data[i])){
               res.put(data[i], res.get(data[i]+1));
           }else {
               res.put(data[i],1);
           }
        }
        
        System.out.println(res);
    }
    
}
