package Algorithm;

public class lc238 {
	public static void main(String args[]) {
		int[] array1 = {1,0,0,1};
		System.out.println(new lc605().canPlaceFlowers(array1, 0));
		int[] array2 = {1,0,0,0,1};
		System.out.println(new lc605().canPlaceFlowers(array2, 1));
		int[] array3 = {0,0,1};
		System.out.println(new lc605().canPlaceFlowers(array3, 1));
		int[] array4 = {0,0,0,1};
		System.out.println(new lc605().canPlaceFlowers(array4, 1));
		int[] array5 = {1,0,0};
		System.out.println(new lc605().canPlaceFlowers(array5, 1));
		int[] array6 = {1,0,0,0};
		System.out.println(new lc605().canPlaceFlowers(array6, 1));
		int[] array7 = {0,0};
		System.out.println(new lc605().canPlaceFlowers(array7, 1));
		int[] array8 = {0,0,0};
		System.out.println(new lc605().canPlaceFlowers(array8, 2));
	}
	
    public static int[] productExceptSelf(int[] nums) {
    	int total = 1;
    	int[] result = new int[nums.length];
        result[0] = 1;
        for(int i = 1; i < nums.length;i++) {
        	result[i] = result[i-1] * nums[i-1];
        }
        
        for(int i = nums.length - 1; i>=0;i--) {
        	result[i] *= total;
        	total *= nums[i];
        }
        
        return result;
        
    }
}
