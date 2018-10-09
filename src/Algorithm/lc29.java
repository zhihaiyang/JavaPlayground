package Algorithm;

public class lc29 {
	private int myDivide(long dividend, long divisor) {
		if(dividend == 0) {
			return 0;
		}
		boolean negative = (dividend<0) != (divisor<0);
		
		if(dividend<0) {
			dividend = 0-dividend;
		}
		if(divisor<0) {
			divisor = 0-divisor;
		}
		if(dividend<divisor) {
			return 0;
		}
		
		long sum = divisor;
		int count = 1;
		while((sum+sum)<=dividend) {
			sum += sum;
			count += count;
		}
		int res = count + myDivide((dividend-sum),divisor);
		return negative? 0-res : res;
	}
	
    public int divide(int dividend, int divisor) {
        if(dividend == 0)
        	return 0;
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
        	return Integer.MAX_VALUE;
        }
        
        return myDivide((long)dividend, (long)divisor);
    }
}
