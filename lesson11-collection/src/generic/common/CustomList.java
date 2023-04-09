package generic.common;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements JavaList<E> {

	private static final int  DEFAULT_CAPACITY = 4;
	
	private E[] es;
	private int size;// amount of available elements in es
	
	public CustomList() {
		es = createGenericArray(DEFAULT_CAPACITY);
	}
	
	// không thể khởi tạo đối tượng KDL generic
	// Generic chỉ là khai báo và nhận KDL, giá trị từ bên ngoài vào
	// Generic ko thể sử dụng trong static reference
	
	@SuppressWarnings("unchecked")
	public CustomList(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("capacity should be positive");
		}
		es = createGenericArray(capacity);
	}
	
	@Override
	public boolean add(E e) {
		
		return add(size, e);
	}
	
	private  E[] grow(int newSize) {
		E[] newEs = createGenericArray(newSize);
		for (int i = 0; i < size; i++) {
			newEs[i] = es[i];
		}
		return newEs;
	}

	@Override
	public boolean add(int index, E e) {
		checkIndexRange(index, 0, size);
		
		// add(1, 99)
		
		// null, null, null, null 		null --> length = 5
		//   3     5    6	 null(size) null	--> size = 3
		//   3     99   5    6	   null	--> size = 4
		
		if (size == es.length) {
			es = grow(es.length + es.length / 2);
		}
		
		size++;
		
		for (int i = size - 1; i > index; i--) {
			es[i] = es[i-1];
		}
		
		es[index] = e;
		
		return true;
	}

	@Override
	public boolean addIfAbsent(E e) {
		if (contains(es, e)) {
			return false;
		}
		return add(e);
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(E e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E removeIf(Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return es[index];
	}

	@Override
	public void set(int index, E e) {
		// TODO Auto-generated method stub
		es[index] = e;
	}

	@Override
	public void forEach(Consumer<E> consumer) {
		for(int i = 0; i<size; i++) {
			consumer.accept(es[i]);
		}
		
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return es.length;
	}
	
	private void checkIndexRange(int index,int start, int end) {
		if(index < start || index > end) {
			throw new IndexOutOfBoundsException(index);
		}
	}
	
	private boolean contains(E[] es,E testE) {
		for (E e: es) {
			if(testE.equals(e)) {
				return true;
			}
		}
		return false;
	}
	
	private E[] createGenericArray(int length) {
		return (E[])Array.newInstance(Object.class, length);
	}

	

}
