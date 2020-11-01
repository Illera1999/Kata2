package kata2;

import java.util.HashMap;
import java.util.Map;

public class histograma {
    
    private Map<Integer,Integer> mapa;

    public histograma() {
        mapa = new HashMap<>();
    }
    
    public boolean contiene(int num){
        return mapa.containsKey(num);
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
        for (int e : mapa.keySet()){
            res += e + "==>" + get(e) + "\n";
        }
        return res;
    }

}
