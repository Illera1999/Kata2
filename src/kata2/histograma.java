package kata2;

import java.util.HashMap;
import java.util.Map;

public class histograma<T> {
    
    private final T[] data;

    public histograma(T[] data) {
        this.data=data;
    }

    public T[] getData() {
        return data;
    }
    
    public Map<T,Integer> getHistogram(){
        Map <T,Integer> histograma = new HashMap<>();
        for (T key : data) {
            histograma.put(key,histograma.containsKey(key)?histograma.get(key)+1:1);
        }
        return histograma;
    }
}
