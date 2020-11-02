package kata2;

import java.util.HashMap;
import java.util.Map;

public class histograma {
    
    private Map<Integer,Integer> mapa;

    public histograma() {
        mapa = new HashMap<>();
    }
    
    public boolean contiene(int key){
        return mapa.containsKey(key);
    }
    
    public void put (int key, int value){
        mapa.put(key, value);
    }
    
    public int get(int key){
        return mapa.get(key);
    }
    
    @Override
    public String toString(){
        String res = "";
        res = mapa.keySet().stream().map(e -> e + "==>" + get(e) + "\n").reduce(res, String::concat);
        return res;
    }

}
