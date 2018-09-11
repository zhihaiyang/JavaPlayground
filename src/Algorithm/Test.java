package Algorithm;

public class Test {
	public static void main(String args[]) {
		int[] array1 = {1,1,1,2,2,3,3,4,4,5,5};
		int[] array2 = {1,1,2,2,3,3,4,4,4,5,5,5};
		int[] array3 = {1};
		int[] array4 = {1,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,10,11};
		int[] array5 = {4,5,6,6,7,8,9,10,10,11};
		
//		String[] str1 = {"i", "love", "leetcode", "i", "love", "coding"};
//		String[] str2 = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		

//		System.out.println(new lc692().topKFrequent(str1, 1));
//		System.out.println(new lc692().topKFrequent(str1, 2));
//		System.out.println(new lc692().topKFrequent(str1, 3));
//		System.out.println(new lc692().topKFrequent(str2, 4));
		System.out.println(new lc347().topKFrequent(array1, 2));
		System.out.println(new lc347().topKFrequent(array2, 2));
		System.out.println(new lc347().topKFrequent(array3, 1));
		System.out.println(new lc347().topKFrequent(array4, 2));
		System.out.println(new lc347().topKFrequent(array5, 2));
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
