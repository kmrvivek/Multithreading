package org.multi.reservation;

public class MultiUserInterface {

	public static void main(String[] args) throws InterruptedException {
		IBus bus1 = new NightSky();
		IBus bus2 = new SeaBird();
		Thread t1 = new Thread(new ReservationForInherit(new NightSky(), 1),"Thread 1");
		Thread t2 = new Thread(new ReservationForInherit(new NightSky(), 1),"Thread 2");
		Thread t3 = new Thread(new ReservationForInherit(new NightSky(), 2),"Thread 3");
		Thread t4 = new Thread(new ReservationForInherit(new NightSky(), 2),"Thread 4");
		Thread t5 = new Thread(new ReservationForInherit(new NightSky(), 3),"Thread 5");
		Thread t6 = new Thread(new ReservationForInherit(new NightSky(), 3),"Thread 6");
		Thread t7 = new Thread(new ReservationForInherit(new NightSky(), 4),"Thread 7");
		Thread t8 = new Thread(new ReservationForInherit(new NightSky(), 5),"Thread 8");
		
		
		
		Thread t9 = new Thread(new ReservationForInherit(new SeaBird(), 1),"Thread 9");
		Thread t10 = new Thread(new ReservationForInherit(new SeaBird(), 1),"Thread 10");
		Thread t11 = new Thread(new ReservationForInherit(new SeaBird(), 2),"Thread 11");
		Thread t12 = new Thread(new ReservationForInherit(new SeaBird(), 2),"Thread 12");
		Thread t13 = new Thread(new ReservationForInherit(new SeaBird(), 3),"Thread 13");
		Thread t14 = new Thread(new ReservationForInherit(new SeaBird(), 3),"Thread 14");
		Thread t15 = new Thread(new ReservationForInherit(new SeaBird(), 4),"Thread 15");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		
		t9.start();
		t10.start();
		t11.start();
		t12.start();
		t13.start();
		t14.start();
		t15.start();
		
		/*t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();
		t8.join();
		t9.join();
		t10.join();
		t11.join();
		t12.join();
		t13.join();
		t14.join();
		t15.join();*/

	}

}
