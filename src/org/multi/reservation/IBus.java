package org.multi.reservation;

import java.util.Map;

public interface IBus {

	 public Map<Integer, Seat> getSeatMap();
	 public void displaySeats();
	 public void bookSeat(int choice);
	 
	 public String getName();
}
