package Algorithm;

public class Test {
	public static void main(String args[]) {
		int[] array1 = {2,1,5,6,2,3};
		int[] array2 = {8, 8};
		int[] array3 = {1};
		int[] array4 = {4,2,0,3,2,4,3,4};
		
		System.out.println(new lc84().largestRectangleArea(array1));
		System.out.println(new lc84().largestRectangleArea(array2));
		System.out.println(new lc84().largestRectangleArea(array3));
		System.out.println(new lc84().largestRectangleArea(array4));
	}
	
	static void printArray(int[] res) {

		System.out.print("[ ");
		for(int num : res) {
			System.out.print(num);
			System.out.print(' ');
		}
		System.out.println("]");
	}
}
