package Algorithm;

public class lc838 {
    public String pushDominoes(String dominoes) {
        int prev = 0;//-1 = L, 1 = R, 0 = no preset action
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<=dominoes.length();i++) {
        	System.out.println("index:" + i);
        	if(i<dominoes.length()&&dominoes.charAt(i)=='.') {
        		continue;
        	}
        	else {
        		if(prev == 0 || prev == -1) {
        			int l = sb.length()-1; 
	   	        	 if(i<dominoes.length()&&dominoes.charAt(i) == 'L'){

	   	        		System.out.println("prev: " + prev + " -- " + (i-l) +" L");
	        			for(int j=0;j<i-l;j++) {
	        				sb.append('L');
	        			}
	        			prev = -1;
	   	        	 }
	   	        	 else {//current = R or END
	   	        		System.out.println("prev: " + prev + " -- " + (i-l-1) +  ".");
	        			for(int j=0;j<i-l-1;j++) {
	        				sb.append('.');
	        			}
	        			prev = 1;
	        		}
        		}
        		else { //(prev = 1)
  	        		 int r = sb.length();
	   	        	 if(i<dominoes.length()&&dominoes.charAt(i) == 'L'){
	   	        		 System.out.println("prev: " + prev + " -- (RL)");
	        			int len = i-r+1;
	        			for(int j = 0;j<len/2;j++) {
	        				sb.append('R');
	        			}
	        			if(len%2!=0) {
	        				sb.append('.');
	        			}
	        			for(int j = 0;j<len/2;j++) {
	        				sb.append('L');
	        			}
	        			prev = -1;
	   	        	 }
	   	        	 else {
		   	        	System.out.println("prev: " + prev + " -- "+ (i-r)+ " R");
	        			for(int j=0;j<i-r;j++) {
	        				sb.append('R');
	        			}
	        			prev = 1;
	   	        	 }
        		}
        	}
        }
        return sb.toString();
    }
}
