package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {


    public static void main(String[] args) {
        
        int[] data = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5};
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }    
        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));
        }

    }
    
}
