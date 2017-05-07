package p2_singleton_impl_lazy_ThreadSafe_DoubleCheckLock;

/**
 * Title: �̰߳�ȫ������ʽ����ģʽ 
 * Description: ˫�ؼ��������Ч�ʽϸ�
 * 
 * @author rico
 * @created 2017��5��7�� ����4:22:29
 */
public class Singleton {

	// volatile�� ��ָֹ��������
	private volatile static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		// ��һ�μ��
		if(instance == null){
			// ֻ��������λ�����ͬ���飬���Ч��
			synchronized(Singleton.class){
				// �ڶ��μ��
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
