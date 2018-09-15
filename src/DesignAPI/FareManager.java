package DesignAPI;

import java.util.Date;

interface IFareManager {
	public void insert(Date date, int fare);
	public int getFare(Date start, Date end);
}
public class FareManager implements IFareManager {

	@Override
	public void insert(Date date, int fare) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFare(Date start, Date end) {
		// TODO Auto-generated method stub
		return 0;
	}

}
