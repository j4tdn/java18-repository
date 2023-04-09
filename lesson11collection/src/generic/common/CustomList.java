package generic.common;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements JavaList<E> {
	private E[] es;
	private int size = 0; // amount of available
	private static final int DEFAULT_CAPACIY = 4;

	// không thể khởi tạo đối tượng KDL generic
	// Generic chỉ là khai báo và nhận KDL. giá trị từ bên ngoài vào
	// Generic ko thể sử dụng trong static reference
	public CustomList() {
		es = createGenericArray(DEFAULT_CAPACIY);
	}

	@SuppressWarnings("unchecked")
	public CustomList(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("Capacity should be positive");
		es = createGenericArray(capacity);
	}

	@Override
	public boolean add(E e) {
//		if (size == es.length) {
//			es = grow(es.length + es.length / 2);
//		}
//		es[size++] = e;
		add(size, e);
		return false;
	}

	// size = 4
	private E[] grow(int newSize) {
		E[] newEs = createGenericArray(newSize);
		for (int i = 0; i < size; i++) {
			newEs[i] = es[i];
		}
		return newEs;
	}

	@Override
	public boolean add(int index, E e) {
		checkIndexRange(index, 0, size);
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
		if(contains(es,e)) {
			return false;
		}
		else {
			add(e);
		}
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
	public void forEach(Consumer<E> consumer) {
		for (int i = 0; i < size; i++) {
			consumer.accept(es[i]);
		}

	}

	@Override
	public int size() {
		return size;
	}

	private E[] createGenericArray(int size) {
		return (E[]) Array.newInstance(Object.class, size);
	}

	@Override
	public int capacity() {
		return es.length;
	}

	private void checkIndexRange(int index, int start, int end) {
		if (index < start || index > end) {
			throw new IndexOutOfBoundsException(index);
		}
	}
	public boolean contains(E[] es, E e) {
		for(int i = 0 ; i < es.length;i++) {
			if (es[i].equals(e)) return true;
		}
		return false;
		
	}

}
