package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2{
    
    public static void main(String[] args){
        
        Integer[] data = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5};
        
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        
        for(Integer key : histogr.keySet()){
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
}
