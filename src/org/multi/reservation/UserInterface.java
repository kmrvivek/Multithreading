package org.multi.reservation;

public class UserInterface {

	public static void main(String[] args) {
		MorningStar bus = new MorningStar();
		Thread t1 = new Thread(new BookReserve(bus, 1),"Thread 1");
		Thread t2 = new Thread(new BookReserve(bus, 1),"Thread 2");
		Thread t3 = new Thread(new BookReserve(bus, 2),"Thread 3");
		Thread t4 = new Thread(new BookReserve(bus, 2),"Thread 4");
		Thread t5 = new Thread(new BookReserve(bus, 3),"Thread 5");
		Thread t6 = new Thread(new BookReserve(bus, 3),"Thread 6");
		Thread t7 = new Thread(new BookReserve(bus, 4),"Thread 7");
		Thread t8 = new Thread(new BookReserve(bus, 5),"Thread 8");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
	}

}
