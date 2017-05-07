package p2_singleton_impl_lazy_ThreadSafe_Synchronized;

/**        
 * Title: ���̲߳���    
 * Description: 
 * @author rico       
 * @created 2017��5��7�� ����4:44:10    
 */      
public class MultiThreadTest {
	
	public static void main(String[] args) {
		
		MyThread[] threads = new MyThread[20];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new MyThread();
		}
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
	}
}

class MyThread extends Thread{
	
	@Override
	public void run() {
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
	}
}