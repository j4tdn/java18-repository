package generic.common;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface JavaList<E> {
	// default: public abstract
	boolean add(E e);
	
	boolean add(int index, E e);
	
	boolean addIfAbsent(E e); // if not exist --> add
	
	E remove(int index);
	
	E remove(E e);
	
	E removeIf(Predicate<E> predicate);
	
	E get(int index);
	
	void set(int index, E e);
	
	void forEach(Consumer<E> consumer);
	
	int size();
	
	int capacity();
}
