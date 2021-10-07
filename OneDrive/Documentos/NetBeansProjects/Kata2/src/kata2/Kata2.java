package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2{
    
    public static void main(String[] args){
        
        String[] data = {"Ana", "Juan", "Lucía", "Juan", "Juan", "Ana"};
        
        Histogram histo = new Histogram(data);
        Map<String, Integer> histogr = histo.getHistogram();
        
        for(String key : histogr.keySet()){
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
}
