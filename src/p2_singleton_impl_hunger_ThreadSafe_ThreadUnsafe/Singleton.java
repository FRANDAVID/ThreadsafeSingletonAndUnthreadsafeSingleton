package p2_singleton_impl_hunger_ThreadSafe_ThreadUnsafe;

/**        
 * Title: ����ʽ����ģʽ   
 * Description: ����ʽ����ģʽ��������̰߳�ȫ��
 * @author rico       
 * @created 2017��5��7�� ����4:22:29    
 */      
public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return instance;
	}
}
