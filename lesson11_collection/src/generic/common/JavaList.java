package generic.common;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface JavaList<E> {
	//mặc định có public abstract
	boolean add(E e);
	
	boolean add(int index, E e);
	
	boolean addIfAbsent(E e);
	
	E remove(int index);
	
	E remove(E e);
	
	E removeIf(Predicate<E> predicate);   //Predicate là điều kiện 
	
	E get(int i);
	
	void set(int i, E e);
	
	void forEach(Consumer<E> consumer);
	
	int capacity();
	
	int size();

	E[] toArray();
	
}
