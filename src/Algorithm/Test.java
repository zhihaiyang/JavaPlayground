package Algorithm;
import java.util.*;

import DesignAPI.FareManager;
public class Test {
	public static void main(String args[]) {
		int[] array1 = {11,2,3,2,1};
		int[] array3 = {3,2,1,4,7};
		int[] array4 = {0};
		int[] array2 = {1,2,3,4,5};
		int[] array5 = {10,10};
		int[] array6 = {5,0,3,8,6};

		int[] array7 = {4, 3, 2, 3, 5, 2, 1};
		int[] array8 = {2,3,1,2,4,3};
		int[] array9 = {90,47,69,10,43,92,31,73,61,97};
		int[] array10 = {3,1,1,4,4,2};
		int[] array11 = {2,2,2,2,3,4,5};
		int[] array12 = {1,5,11,5};
		
		String[] str1 =  {"hot","dog","dot"};
		String[] str2 = {"word","student"};
		String[] str3 = {"bar","foo","the"};
		String[] str4 = {"aa","aa","aa"};
		String[] str5 = {"aa","at","aa"};
		String[] str6 = {"hot","dot","dog","lot","log","cog"};
		String[] str7 = {"o","og","g"};
		
		String[] str8 = {"amazon","apple","facebook","google","leetcode"};
		String[] str9 = {"e","o"};

		String[] str10 = {"ec","oc","eco"};

		String[] str11 = {"eo","lo"};
		
		String[][] words = {{"",""}};
		
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
		
		
		
//		FareManager fm = new FareManager();
//		
//		fm.insert(2, 1);
//		System.out.println(fm.getFare(1, 3));
//		

//		System.out.println(new lc698().canPartitionKSubsets(array7, 4));
//		System.out.println(new lc698().canPartitionKSubsets(array11, 4));
//		System.out.println(new lc416().canPartition_dp(array12));
		System.out.println(new lc29().divide(Integer.MAX_VALUE, -2));

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
