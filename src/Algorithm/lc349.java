package Algorithm;

import java.util.HashSet;
import java.util.Iterator;

public class lc349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] s = nums1.length < nums2.length ? nums1 : nums2;

        int[] l = nums1.length < nums2.length ? nums2 : nums1;
        
        HashSet<Integer> setS = new HashSet<>();
        HashSet<Integer> setl = new HashSet<>();
        
        for(int i : s) {
        	setS.add(i);
        }
        
        for(int i : l) {
        	if(setS.contains(i)) {
        		setl.add(i);
        	}
        }
        int[] res = new int[setl.size()];
        Iterator<Integer> itr = setl.iterator();
        for(int i = 0;i<setl.size();i++) {
        	res[i] = itr.next().intValue();
        }
        
        return res;
    }
}
