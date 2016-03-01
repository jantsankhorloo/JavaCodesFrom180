package testcases;

public class Multiple extends Thread {
	private static final int END = 20;
	private static int counter;
	private int factor;
	private static Object obj = new Object();
	
	public Multiple(int factor) {
		this.factor = factor;		
	}
	
	public void run() {
		int num = 0;
		while (num <= END) {
			synchronized(obj) {
				counter++;
				System.out.print(num + " ");
				num = num + this.factor;
			}
		}
	}
	
	public static void main(String[] args) {
		Multiple d1 = new Multiple(7);
		Multiple d2 = new Multiple(5);
		d1.start();
		d2.start();
		System.out.println("\ncounter = " + counter);		
	}
}
