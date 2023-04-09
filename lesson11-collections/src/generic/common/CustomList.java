package generic.common;

import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CustomList<E> implements IList<E> {
    private E[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    // Không thể khởi tạo đối tượng KDL Generic
    // Chỉ được khai báo và nhận KDL và nhận giá trị từ bên ngoài vào
    // Generic không thể sử dụng trong static references

    public CustomList() {
        elements = createGenericArray(DEFAULT_CAPACITY);
    }

    public CustomList(int capacity) {
        if(capacity < 0){
            throw new IllegalArgumentException("Capacity must be positive");
        }
        elements = createGenericArray(capacity);
    }

    @Override
    public boolean add(E e) {
        if(size == elements.length){
            elements = grow();
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public boolean add(int index, E e) {
        if(size == elements.length){
            elements = grow();
        }
        for(int i = size; i > index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
        return false;
    }

    @Override
    public boolean addIfAbsent(E e) {
        for(int i = 0; i < size; i++){
            if(e.equals(elements[i])){
                return false;
            }
        }
        if(size == elements.length){
            elements = grow();
        }
        elements[size++] = e;
        return true;
    }

    @Override
    public E remove(int index) {
        for(int i = index; i < elements.length -1; i++){
            elements[i] = elements[i+1];
        }
        size--;
        return null;
    }

    @Override
    public boolean removeIf(Predicate<E> predicate) {
        for(int i = 0; i < size; i++){
            if(predicate.test(elements[i]) == true){
                remove(i);
                break;
            }
        }
        return true;
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public void set(int index, E e) {
        elements[index] = e;
    }

    @Override
    public void forEach(Consumer<E> consumer) {
        for(int i = 0; i < size; i++){
            consumer.accept(elements[i]);
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return elements.length;
    }

    @SuppressWarnings("unchecked")
    private static <E> E[] createGenericArray(int size){
        return (E[])Array.newInstance(Object.class, size);
    }


    private E[] grow(){
        E[] newElements = createGenericArray(size + size / 2);
        for(int i = 0; i < size; i++){
            newElements[i] = elements[i];
        }
        return newElements;
    }
}
