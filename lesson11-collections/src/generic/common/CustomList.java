package generic.common;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements JavaList<E> {
	
	private static final int DEFAULT_CAPACITY = 4;
	
	private E[] es;
	
	private int size; // the number of available elements in es
	
	// không thể khởi tạo đối tượng KDL Generic
	// Generic chỉ là khai báo và nhận KDL, giá trị từ bên ngoài truyền vào 
	// Generic không thể sử dụng trong static reference
	
	public CustomList() {
		es = createGenericArray(DEFAULT_CAPACITY);
	}
		
	public CustomList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("Capacity should be zero or positive");
		}	
		es = createGenericArray(capacity);
	}

	@Override
	public boolean add(E e) {
		if (size == es.length) {
			es = grow(es.length + es.length/2);
		}
		es[size++] = e;
		return false;
	}

	@Override
	public boolean add(int index, E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addIfAbsent(E e) {
		// TODO Auto-generated method stub
		return false;
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
		return es[index];
	}

	@Override
	public void set(int index, E e) {
		es[index] = e;
	}

	@Override
	public int size() {
		return size;
	}
	
	@Override
	public void forEach(Consumer<E> consumer) {
		for (int i = 0; i < size; i++) {
			consumer.accept(es[i]);
		}		
	}
	
	@Override
	public int capacity() {
		return es.length;
	}
	
	@SuppressWarnings("unchecked")
	private E[] createGenericArray(int length) {
		return (E[])Array.newInstance(Object.class, length);
	}

	private E[] grow(int newSize) {
		E[] newEs = createGenericArray(newSize);
		for (int i = 0; i < size; i++) {
			newEs[i] = es[i];
		}
		return newEs;
	}

	
}