package p2_singleton_impl_lazy_ThreadSafe_ThreadLocal;

  
/**        
 * Title: �̰߳�ȫ������ʽ����  
 * Description: ˫�ؼ������
 * @author rico       
 * @created 2017��5��7�� ����4:44:57    
 */      
public class SingleThreadTest {
	
	public static void main(String[] args) {

		Singleton instance1 = Singleton.getInstance();
		
		Singleton instance2 = Singleton.getInstance();
		
		//�ж��Ƿ���ͬһ������
		System.out.println(instance1 == instance2);
		
	}
}

