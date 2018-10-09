package DesignAPI;

import java.util.*;

interface IFareManager {
	
	public void insert(long date, int fare);
	public int getFare(long start, long end);
}

class Node{
	long date;
	int fare;
	
	Node(long date, int fare){
		this.date = date;
		this.fare = fare;
	}
}

public class FareManager implements IFareManager {

	List<Node> array;
	public FareManager(){
		array = new ArrayList<>();
	}
	
	@Override
	public void insert(long date, int fare) {
		int left = 0;
		int right = array.size()-1;
		int can;
		
		while(left <= right) {
			can = left + (right - left) / 2;
			if(array.get(can).date < date) {
				left = can + 1;
			}
			else if(array.get(can).date == date) {
				break;
			}
			else {
				right = can - 1;
			}
		}
		
		if(left <= right) {
			int index = left + (right-left)/2;
			array.set(index, new Node(date, fare));
		}
		else {
			array.add(left, new Node(date, fare));
		}
	}
	

	@Override
	public int getFare(long start, long end) {
		int left = 0;
		int right = array.size() - 1;
		int can;
		
		while(left <= right) {
			can = left + (right - left) / 2;
			if(array.get(can).date < start) {
				left = can + 1;
			}
			else if(array.get(can).date == start) {
				break;
			}
			else {
				right = can - 1;
			}
		}
		
		int index = 0;
		// Find the start date in the array
		if(left <= right) {
			index = left + (right-left)/2; 
		}
		else {
			if((left - 1) < 0) {
				// not found the effective date that includes start date
			}
			else {
				// Find the effective date that includes start date
				index = left - 1;
			}
		}
		
		int cost = 0;
		long endDate = array.get(index).date;
		
		int total = 0;
		long startDate = start;
		
		while(endDate <= end && index < array.size()) {
			if(endDate <= startDate) {
				index++;
				if(index == array.size()) {
					endDate = -1;
				}
				else{
					endDate = array.get(index).date;
				}
			}
			long effectiveEnd = endDate == -1 ? end : Math.min(end, endDate-1);
			total += (effectiveEnd - startDate + 1) * cost;
			if(index < array.size()) {
				cost = array.get(index).fare;
				startDate = array.get(index).date;
			}
			else {
				break;
			}
		}
		
		return total;
	}

}
