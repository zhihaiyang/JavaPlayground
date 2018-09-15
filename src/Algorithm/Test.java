package Algorithm;

public class Test {
	public static void main(String args[]) {
		int[] array1 = {10,5,2,6};
		int[] array3 = {100};
		int[] array4 = {1};
		int[] array2 = {1,2,3};
		int[] array5 = {10,10};
		int[] array6 = {1};

		int[] array7 = {1,1,1};
		int[] array8 = {1,1,1,7};
		int[] array9 = {7,7,7,2,2};

		System.out.println(new lc713().numSubarrayProductLessThanK_v2(array1, 100));
		System.out.println(new lc713().numSubarrayProductLessThanK_v2(array3, 100));
		System.out.println(new lc713().numSubarrayProductLessThanK_v2(array4, 1));
		System.out.println(new lc713().numSubarrayProductLessThanK_v2(array2, 0));
		System.out.println(new lc713().numSubarrayProductLessThanK_v2(array5, 10));
		System.out.println(new lc713().numSubarrayProductLessThanK_v2(array6, 0));
		System.out.println(new lc713().numSubarrayProductLessThanK_v2(array7, 1));
		System.out.println(new lc713().numSubarrayProductLessThanK_v2(array8, 1));
		System.out.println(new lc713().numSubarrayProductLessThanK_v2(array9, 3));
		
		String[] str1 = {"abcw","baz","foo","bar","xtfn","abcdef"};
		String[] str2 = {"a","ab","abc","d","cd","bcd","abcd"};
		String[] str3 = {"a","aa","aaa","aaaa"};
		
		ListNode head = new ListNode(0);

		ListNode root = head;
		head.next = new ListNode(1);
		head = head.next;
		head.next = new ListNode(2);
		head = head.next;
		head.next = new ListNode(3);
		head = head.next;
		//head.next = root.next;//3->1
		
		System.out.println(new lc142().hasCycle(root));
//		printArray(new lc349().intersection(array1, array2));
//		Integer a = new Integer(3);
//		Integer b = new Integer(3);
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
