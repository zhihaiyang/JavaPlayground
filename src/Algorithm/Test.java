package Algorithm;
import java.util.*;
public class Test {
	public static void main(String args[]) {
		int[] array1 = {11,2,3,2,1};
		int[] array3 = {3,2,1,4,7};
		int[] array4 = {0};
		int[] array2 = {1,2,3,4,5};
		int[] array5 = {10,10};
		int[] array6 = {3,3,3,1,2,1,1,2,3,3,4};

		int[] array7 = {1,2,1};
		int[] array8 = {2,3,1,2,4,3};
		int[] array9 = {3,1,2,4};
		
		String[] str1 =  {"hot","dog","dot"};
		String[] str2 = {"word","student"};
		String[] str3 = {"bar","foo","the"};
		String[] str4 = {"aa","aa","aa"};
		String[] str5 = {"aa","at","aa"};
		String[] str6 = {"hot","dot","dog","lot","log","cog"};
		String[] str7 = {"hot","dot","dog","lot","log"};
		
		List<String> list1 = Arrays.asList(str6);
		List<String> list2 = Arrays.asList(str1);
		
		ListNode head = new ListNode(0);

		ListNode root = head;
		head.next = new ListNode(1);
		head = head.next;
		head.next = new ListNode(2);
		head = head.next;
		head.next = new ListNode(3);
		head = head.next;
		//head.next = root.next;//3->1
		System.out.println(new lc837().new21Game(10, 1, 10));
		System.out.println(new lc837().new21Game(6, 1, 10));
		System.out.println(new lc837().new21Game(21, 17, 10));
		

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
