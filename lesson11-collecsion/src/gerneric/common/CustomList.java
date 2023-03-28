package gerneric.common;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements JavaList<E> {
	private static final int DEFAULT_CAPACITY = 4;
	private E[] es;
	private int size = 0;

	public CustomList() {
		es = createGenerricArray(DEFAULT_CAPACITY);
	}

	@SuppressWarnings("unchecked")
	public CustomList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("capacity <0");
		}
		es = createGenerricArray(capacity);
	}

	@Override
	public boolean add(E e) {
		if (size == es.length) {
			es = grow(es.length + es.length / 2);
		}
		es[size++] = e;
		return false;
	}

	private E[] grow(int newSize) {
		E[] newEs = createGenerricArray(newSize);
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
		size ++;
		for(int i=size-1;i>index;i--) {
			es[i]=es[i-1];
		}
		es[index]=e;
		return true;
	}

	private void checkIndexRange(int index, int start, int end) {
		if (index < start || index > end) {
			throw new IndexOutOfBoundsException(index);
		}
	}

	@Override
	public boolean addIfAbsent(E e) {
		if(contain(es,e)) {
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
		es[index] = e;
	}

	@Override
	public int size() {
		return size;
	}

	@SuppressWarnings("unchecked")
	private E[] createGenerricArray(int length) {
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

	@Override
	public boolean contain(E[] es, E testE) {
		for(E e : es ) {
			if(testE.equals(e)) {
				return true;
			}
		}
		return false;
	}

}
