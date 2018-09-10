package Algorithm;

public class lc605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    	int total = 0;
    	int last = -1;
    	int c = 0;
    	for(;c<flowerbed.length;c++) {
    		if(flowerbed[c] == 1) {
    			if((c-last-1)>0) {
    				total += (c-last-2+(last==-1? 1:0))/2;
    			}
    			last = c;
    		}
    	}
    	total += (flowerbed.length-last-1+(last==-1?1:0))/2;
    	return n<=total;
    }
}
