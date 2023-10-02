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

// Class 3
// Helper class extending Thread Class
class Thread2 extends Thread {

	// Declaring variable of type Class1
	threadSynchro test;

	// Constructor for class2
	Thread2(threadSynchro p) { test = p; }

	// run() method of this class for
	// entry point for thread2
	public void run() { test.printThread(2); }
}

// Class 4
// Main class
public class synchroThread {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of class 1 inside main() method
		threadSynchro p = new threadSynchro();

		// Passing the same object of class PrintTest to
		// both threads
		Thread1 t1 = new Thread1(p);
		Thread2 t2 = new Thread2(p);

		// Start executing the threads
		// using start() method
		t1.start();
		t2.start();

		// This will print both the threads simultaneously
	}
}
