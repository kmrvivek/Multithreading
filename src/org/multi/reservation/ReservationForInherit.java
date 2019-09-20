package org.multi.reservation;

public class ReservationForInherit implements Runnable{
	
	private IBus bus;
	private int choice;
	
	public ReservationForInherit(IBus bus, int choice) {
		this.bus = bus;
		this.choice = choice;
	}

	@Override
	public void run() {
		
			System.out.println("Lock acquired by "+Thread.currentThread().getName()+" for bus "+this.bus.getName());
			this.bus.displaySeats();
			this.bus.bookSeat(this.choice);
			/*try {
				Thread.currentThread().wait(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
				
		
	}

}
