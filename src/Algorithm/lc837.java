package Algorithm;
/*
 * 要求的概率是P(<=N | >= K) = P(<= N && >= K) / P(>=K)

* 粗略地看，P(x) = 1/w * (P(x - 1) + P(x - 2) +... + P(x-w))
* 求和下限是lb = x-w，上限是ub = x-1
* 但还需要考虑限制条件:

* lb>=0 (P0 = 1)
* ub <= K - 1，因为>=K就不能再抽了。
* 上述求和直接求当然很慢，是O(NW)的，可以使用sum记录从头元素开始的累积和。
* 最终要求的结果P(<= N && >= K) / P(>=K)
* 前一项就是从P(K)加到P(N)，后一项是从P(K)加到P(+∞)，实际上，P不为0的上限是K+W-1，所以加到P(K+W-1)即可。(前面的P(N)也同样，是加到P(min(N, K+W-1)))
 * */
 
public class lc837 {
	
    public double new21Game(int N, int K, int W) {

     if(K == 0) {
    	 return 1;
     }
     if(N >= (K+W-1)) {
    	 return 1;
     }
     // sum[i] is the total p[0]~p[i]; 
     double[] sum = new double[K+W];
     
     sum[0] = 1.0;
     // Rolling calculation
     // p[i] = sum[i] - sum[i-1] -- naturally
     // p[i] = (p[i-1] +...+p [i-w]) / W -- this game
     //      = (sum[i-1] - sum[i-w-1]) / W
     // Combine above two, you can get a formula for sum[i] in O(n)
     for(int i = 1; i < K+W; i++) {
    	 int ub = Math.min(K, i);
    	 if(i <= W) {
    		 sum[i] = sum[i-1] + sum[ub-1]/ (double)W;
    	 }
    	 else {
    		 sum[i] = sum[i-1] + (sum[ub-1] - sum[i-W-1])/ (double)W;
    	 }
     }

     return (sum[N] - sum[K-1])/(sum[K+W-1]-sum[K-1]);
    }

}
