package gerneric.common;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface JavaList<E> {
	boolean add(E e);
	
	boolean add(int index , E e);
	
	boolean addIfAbsent(E e);
	
	E remove(int index);
	
	E remove(E e);
	
	E removeIf(Predicate<E> predicate);
	
	E get(int index);
	
	void set(int index , E e);
	
	int size();
	
	void forEach(Consumer<E> consumer);
	
	int capacity();
	
	boolean contain(E[] es, E testE);
}
