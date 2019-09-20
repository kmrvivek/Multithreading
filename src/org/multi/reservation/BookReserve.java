package org.multi.reservation;

public class BookReserve implements Runnable{
	
	private MorningStar bus;
	private int choice;
	
	public BookReserve(MorningStar bus, int choice) {
		this.bus = bus;
		this.choice = choice;
	}

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("Lock acquired by "+Thread.currentThread().getName());
			bus.displaySeats();
			bus.bookSeat(this.choice);
			
		}		
		
	}

}
