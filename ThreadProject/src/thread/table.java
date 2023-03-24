package thread;

public class table {

	synchronized public static void table(int n) {
		
		for(int i=1; i<5;i++) {
			System.out.println(i*n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}
}
