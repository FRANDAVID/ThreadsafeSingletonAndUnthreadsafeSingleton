package p2_singleton_impl_lazy_ThreadSafe_SynchronizedBlock;

/**
 * Title: �̰߳�ȫ������ʽ����ģʽ 
 * Description: ͬ����ʵ�֣����˫�ؼ��������Ч�ʽϵ�
 * 
 * @author rico
 * @created 2017��5��7�� ����4:22:29
 */
public class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		// ͬ����
		synchronized (Singleton.class) {
			if(instance == null){
				instance = new Singleton();
			}
		}
		return instance;
	}
}
