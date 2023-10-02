class threadSynchro extends Thread {
	public void printThread(int n)
	{
		for (int i = 1; i <= 10; i++) {
			System.out.println("Thread " + n
							+ " is working...");
			try {
				Thread.sleep(600);
			}
			catch (Exception ex) {
				System.out.println(ex.toString());
			}
		}
		System.out.println("--------------------------");

		try {
			Thread.sleep(1000);
		}

		catch (Exception ex) {
			System.out.println(ex.toString());
		}
	}
}
class Thread1 extends Thread {
	threadSynchro test;
	Thread1(threadSynchro p) { test = p; }
	public void run()
	{

		// Calling method 1 as in above class
		test.printThread(1);
	}
}
class Thread2 extends Thread {
	threadSynchro test;
	Thread2(threadSynchro p) { test = p; }
	public void run() { test.printThread(2); }
}
public class synchroThread {
	public static void main(String[] args)
	{
		threadSynchro p = new threadSynchro();
		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);
		t1.start();
		t2.start();
	}
}
