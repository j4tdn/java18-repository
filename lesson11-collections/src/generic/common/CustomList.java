package generic.common;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements JavaList<E> {

	private static final int DEFAULT_CAPACITY = 4;
	private E[] es;
	private int size; // amount of available elements in es

	public CustomList() {
		es = createGenericArray(DEFAULT_CAPACITY);
	}
	// Không thể khởi tạo đối tượng KDL generic
	// Generic chỉ là khai báo và nhận KDL, giá trị từ bên ngoài vào
	// Generic không thể sử dụng trong static reference

	public CustomList(int capacity) {
//		es = {}; ERROR
		if (capacity < 0) {
			throw new IllegalArgumentException("capacity should be positive");
		}
		es = createGenericArray(capacity);

	}

	@Override
	public boolean add(E e) {
//		if (size == es.length) {
//			es = grow(es.length + es.length / 2);
//		}
//		es[size++] = e;
//		return false;
		return add(size, e);
	}

	@Override
	public boolean add(int index, E e) {
		checkIndexRange(index, 0, size);
		if (size == es.length) {
			es = grow(es.length + es.length / 2);
		}
		size++;
		for (int i = size - 1; i > index; i--) {
			es[i] = es[i - 1];
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
		return es[index];
	}

	@Override
	public void set(int index, E e) {
		// TODO Auto-generated method stub
		es[index] = e;
	}

	@Override
	public int size() {
		return size;
	}

	// size = 4;
	// es --> a, b, c, d
	// newEs --> a, b, c, d, n, n --> es

	private E[] grow(int newSize) {
		E[] newEs = createGenericArray(newSize);
		for (int i = 0; i < size; i++) {
			newEs[i] = es[i];
		}
		return newEs;
	}

	@SuppressWarnings("unchecked")
	private E[] createGenericArray(int length) {
		return (E[]) Array.newInstance(Object.class, length);
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

	// size = 5 --> add(0,5) size = 6
	private void checkIndexRange(int index, int start, int end) {
		if (index < start || index > end) {
			throw new IndexOutOfBoundsException(index);
		}
	}

	@Override
	public boolean contains(E[] es, E testE) {
		for (E e : es) {
			if (testE.equals(e)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public E[] toArray() {
		return Arrays.copyOfRange(es, 0, size);
	}

}
