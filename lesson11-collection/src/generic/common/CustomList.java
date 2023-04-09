package generic.common;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements JavaList<E>{
	
	private E[] es;
	private static final int DEFAULT_CAPACITY = 4;
	private int size; 
	
	//	Không thể khởi tạo 1 đối tượng KDL generic
	// 	Generic chỉ là khai báo và nhận KDL, giá trị từ bên ngoài vào
	// Generic không thể sử dụng trong static reference
	
	public CustomList() {
		es = createGenericArray(DEFAULT_CAPACITY);
	}
	
	public CustomList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("Capacity should be positive");
		}
		es = createGenericArray(capacity);
	}
	
	@Override
	public boolean add(E e) {
		add(size, e);
		return false;
	}
	
	public E[] grow(int newSize) {
		E[] newEs = createGenericArray(newSize);
		for (int i = 0; i < size; i++) {
			newEs[i] = es[i];
		}
		return newEs;
	}
	
	@Override
	public E remove(E e) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return es[index];
	}
	@Override
	public boolean addIfAbsent(E e) {
		
		if (contains(es, e)) {
			return false;
		}
		add(e);
		
		
		return false;
	}@Override
	public boolean add(int index, E e) {
		CheckIndexRange(index,0,size);
		size++;
		
		if (size == es.length) {
			es = grow(es.length + es.length/2);
		}
		
		int i;
		
		for (i = size - 1 ; i > index; i--) {
			es[i] = es[i-1];
		}
		es[i] = e;	
		
		return true;
	}@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}@Override
	public E removeIf(Predicate<E> predicate) {
		// TODO Auto-generated method stub
		return null;
	}@Override
	public void set(int index, E e) {
		// TODO Auto-generated method stub
		es[index] = e;
	}
	
	@Override
	public void forEach(Consumer<E> consumer) {
		for (int i = 0; i < size; i++) {
			consumer.accept(es[i]);
		}
	}
	public boolean contains(E[] es, E testE) {
		for (E e: es){
			 if (testE.equals(e)) {
				 return true;
			 }
		}
		return false;
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
	
	public void CheckIndexRange(int index, int start, int end) {
		if (index < start || index > end) {
			throw new IndexOutOfBoundsException(index);
		}
	}
	@Override
	public E[] toArray() {
		return Arrays.copyOfRange(es, 0, size);
	}
	
	@SuppressWarnings("unchecked")
	private E[] createGenericArray(int length) {
		return (E[])Array.newInstance(Object.class, length);
	}
	
}
