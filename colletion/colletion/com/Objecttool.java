package colletion.com;

//public class Objecttool<T> {
//	private T obj;
//
//	public T getObj() {
//		return obj;
//	}
//
//	public void setObj(T obj) {
//		this.obj = obj;
//	}
//	 
//	public void print(T a) {
//		System.out.println(a);
//	}
//	
//}
public class Objecttool<E> implements inter<E>{

	@Override
	public void show(E a) {
		// TODO �Զ����ɵķ������
		System.out.println(a);
	}

}

