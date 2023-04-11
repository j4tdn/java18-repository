package generic.common;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements JavaList<E> {

	private static final int DEFAULT_CAPACITY = 10;
	/*
	 * Không thể khởi tạo một đối tượng KDL generic type Generic chỉ là khai báo và
	 * nhận giá trị từ bên ngoài vào
	 * 
	 * solve -> Tạo 1 mảng object và ép kiểu sang Generic
	 * 
	 * Warning: Generic k thể sử dụng trong static reference
	 */
	private E[] es;
	private int size = 0;

	public CustomList() {
		es = createGenericArray(DEFAULT_CAPACITY);
	}

	public CustomList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("capacity must bigger than 0");
		}
		es = createGenericArray(capacity);
	}

	@Override
	public boolean add(E e) {
		if (size == es.length) {
			es = grow(es.length);
		}
		es[size++] = e;
		return false;
	}

	private E[] grow(int oldSize) {
		int newSize = oldSize * 3 / 2;
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
			es = grow(es.length);
		}
		size++;
		for (int i = size - 1; i > index; i--) {
			es[i] = es[i-1];
		}
		es[index] = e;
		return false;
	}

	private void checkIndexRange(int index, int start, int end) {
		if (index < start || index > end) {
			throw new IndexOutOfBoundsException(index);
		}
	}

	@Override
	public boolean addIfAbsent(E e) {
		if(contains(es,e)) {
			return true;
		}
		add(e);
		return false;
	}

	private boolean contains(E[] es, E check) {
		for(E e:es) {
			if(check.equals(e)) {
				return true;
			}
		}
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
	public E get(int i) {
		return es[i];
	}

	@Override
	public void set(int i, E e) {
		es[i] = e;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void forEach(Consumer<E> consumer) { // Consumer để sử dụng lamda function bên trong
		for (int i = 0; i < size(); i++) {
			consumer.accept(es[i]);
		}
	}

	@SuppressWarnings("unchecked")
	private E[] createGenericArray(int lenght) {
		return (E[]) Array.newInstance(Object.class, lenght); // newInstance sẽ cần 1 tham số là class KDL và capacity
	}

	@Override
	public int capacity() {
		return es.length;
	}

	@Override
	public E[] toArray() {
		return Arrays.copyOfRange(es, 0, size);
	}
}
