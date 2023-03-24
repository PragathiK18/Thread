package thread;

public class main {

	public static void main(String args[]) {
		
		table t1 = new table();
		
		
		
		Thread th1 =new Thread() {
			public void run() {
				t1.table(5);
			}
		};
		
		Thread th2 =new Thread() {
			public void run() {
				t1.table(10);
			}
		};
		
		th1.start();
		th2.start();
		
//	Anonymous class	
//		Runnable r = () ->{
//
//				// TODO Auto-generated method stub
//				for(int i=0; i<5 ;i++) {
//					
//					System.out.println("pragathi");
//				}
//
//		};
//		Thread th3= new Thread(r);
//		th3.start();
		
	
		
	}
}
