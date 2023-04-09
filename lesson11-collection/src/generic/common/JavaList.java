package generic.common;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface JavaList<E> {
	// Mặc định: public abstract
	boolean add(E e);
	
	boolean add(int index, E e);
	
	boolean addIfAbsent(E e);
	
	E remove(int index);
	
	E remove(E e);
	
	E removeIf(Predicate<E> predicate);
	
	E get(int index);
	
	void set(int index, E e);
	
	int size();
	int capacity();
	
	void forEach(Consumer<E> consumer);
	
	boolean contains(E[] es, E e);
	
	E[] toArray();
}
