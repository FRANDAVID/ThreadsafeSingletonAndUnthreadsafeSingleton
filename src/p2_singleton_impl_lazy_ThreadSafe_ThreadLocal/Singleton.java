package p2_singleton_impl_lazy_ThreadSafe_ThreadLocal;

/**
 * Title: �̰߳�ȫ������ʽ����ģʽ 
 * Description: ThreadLocal
 * 
 * @author rico
 * @created 2017��5��7�� ����4:22:29
 */
public class Singleton {

	// ThreadLocal �ֲ߳̾�����
	private static ThreadLocal<Singleton> threadlocal = new ThreadLocal<Singleton>();
	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		// ��һ�μ�飺���̵߳�һ�η��ʣ������if���飻�������߳��Ѿ����ʹ�����ֱ�ӷ���ThreadLocal�е�ֵ
		if (threadlocal.get() == null) {
			synchronized (Singleton.class) {
				if (instance == null) {  // �ڶ��μ�飺�õ����Ƿ񱻴���
					instance = new Singleton();
				}
			}
			threadlocal.set(instance); // ����������ThreadLocal��
		}
		return threadlocal.get();
	}
}
