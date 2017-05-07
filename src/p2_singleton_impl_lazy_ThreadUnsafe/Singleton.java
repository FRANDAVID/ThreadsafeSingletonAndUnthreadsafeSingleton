package p2_singleton_impl_lazy_ThreadUnsafe;

/**        
 * Title: �̲߳���ȫ������ʽ����ģʽ     
 * Description: 
 * @author rico       
 * @created 2017��5��7�� ����4:22:29    
 */      
public class Singleton {

	private static Singleton instance;
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
