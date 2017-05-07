package p2_singleton_impl_lazy_ThreadSafe_InnerClass;

/**        
 * Title: �̰߳�ȫ������ʽ����ģʽ   
 * Description: �ڲ���ʵ��
 * @author rico       
 * @created 2017��5��7�� ����4:22:29    
 */      
public class Singleton {

	//��̬˽���ڲ���
	private static class InnerClass {
		private final static Singleton instance = new Singleton();
	}
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return InnerClass.instance;
	}
}
