package org.multi.reservation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MorningStar {
	private static final String name = "MorningStar";
	private static int count;
	private static Map<Integer, Seat> seatMap = new HashMap<Integer, Seat>();
	
	static {
		for (int i=1; i <= 20; i++) {
            Seat seat = new Seat(i, true);
            seatMap.put(i, seat);
        }
		count = 20;
	}
	
	 public Map<Integer, Seat> getSeatMap() {
	        return seatMap;
	    }
	 
	 public static void displaySeats(){
		 System.out.println(Thread.currentThread().getName()+" -->accesing "+name+" \n"+seatMap);
		 System.out.println("No Of seat available in "+name + "  "+count);
	 }
	
	 public static synchronized void bookSeat(int choice){
		 int seatNumber = -1;
		 Seat s = seatMap.get(choice);
		 if(s.getAvailable()){
			 s.setAvailable(false);
			 count--;
             seatNumber = s.getSeatNo();
             printBoardingPass(seatNumber);
		 } else {
			 System.out.println(Thread.currentThread().getName()+" --> Seat is already booked. Please try for another seat");
		 }
		 
	 }
	 
	 private static void printBoardingPass(int seatNumber) {
	        System.out.println("\nDate: " + new Date());
	        Seat s = seatMap.get(seatNumber);
	        String type = "";
	        switch (s.getSeatType()) {
	            case 1: {
	                type = "window";
	                break;
	            }
	            case 2: {
	                type = "aisle";
	                break;
	            }
	        }
	        System.out.println("Boarding pass booked for " + type + " seat number: "
	                + seatNumber + " by Thread "+Thread.currentThread().getName()+"\n");
	    }
	 
	

}
