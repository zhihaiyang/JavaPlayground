package Algorithm;
import java.util.*;

public class lc914 {
    public boolean hasGroupsSizeX(int[] deck) {
      HashMap<Integer, Integer> counts = new HashMap<>();
      int min = 1;
      for(int val: deck) {
    	  if(counts.containsKey(val)) {
    		  int c = counts.get(val);
    		  counts.put(val, c+1);
    		  if(min < (c+1)) {
    			  min = c+1;
    		  }
    	  }
    	  else {
    		  counts.put(val, 1);
    	  }
      }
      if(min<2) {
    	  return false;
      }
      //check if visited
      boolean[] factors = new boolean[min+1];
      for(int f = 2; f <= min; f++) {
    	  if(factors[f] == false) {
    		  boolean found = true;
    		  for(int key : counts.keySet()) {
    			  if(counts.get(key)%f != 0) {
    				  found = false;
    				  break;
    			  }
    		  }
    		  if(found == true) {
    			  return true;
    		  }
    		  factors[f] = true;
    		  for(int i = 1; i<=min/f; i++ ) {
    			  factors[f*i] = true;
    		  }
    	  }
      }
      return false;
    }
}
