package implementationOfLists.arrayList;

import java.util.Arrays;

class ArrayListModel<T> {
    private int capacity = 10;
    private int size;
    private Object[] array;

    public ArrayListModel() {
        array = new Object[capacity];
        size = 0;
    }

    protected void add(T val) {
        if (size == capacity)
            expandArray();
        array[size++] = val;
    }

    protected void add(int index, T val) {
        if (index < 0 || index > size) {
        	System.err.println("IndexOutOfBoundsException: Index: "+index+", Size: "+size);
            return;
        }
        if (size == capacity)
            expandArray();
        for (int i = size - 1; i >= index; i--)
            array[i + 1] = array[i];
        array[index] = val;
        size++;
    }

    protected void addAtFirst(T val) {
        add(0, val);
    }

    protected void remove() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        size--;
    }

    protected void remove(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("ArrayIndexOutOfBoundsException");
            return;
        }
        for (int i = pos + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    protected boolean contains(T val) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(val))
                return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    protected T get(int index) {
        if (index < 0 || index >= size) {
        	System.err.println("IndexOutOfBoundsException: Index: "+index+", Size: "+size);
            return null;
        }
        return (T) array[index];
    }

    @SuppressWarnings("unchecked")
    protected T set(int index, T value) {
        if (index < 0 || index >= size) {
        	System.err.println("IndexOutOfBoundsException: Index: "+index+", Size: "+size);
            return null;
        }
        T temp = (T) array[index];
        array[index] = value;
        return temp;
    }

    protected int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value))
                return i;
        }
        return -1;
    }

    protected boolean isEmpty() {
        return size == 0;
    }

    private void expandArray() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    protected int size() {
        return size;
    }

    protected void display() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}

public class ArrayListImplementation{
	public static void main(String[] args) {
		ArrayListModel<String> list = new ArrayListModel<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.display();  

        // Adding at index
        list.add(1, "Mango");
        list.display();  

        // Add at first
        list.addAtFirst("Orange");
        list.display();  
        
        // Removing last element
        list.remove();
        list.display();   

        // Removing at index
        list.remove(1);
        list.display();  

        // Get element
        System.out.println("Element at index 1: " + list.get(1));  

        // Set element
        System.out.println("Replaced: " + list.set(1, "Grapes")); 
        list.display();   

        // Contains check
        System.out.println("Contains Banana? " + list.contains("Banana"));  
        System.out.println("Contains Apple? " + list.contains("Apple"));    

        // Index of element
        System.out.println("Index of Grapes: " + list.indexOf("Grapes"));  

        // Is empty
        System.out.println("Is list empty? " + list.isEmpty());  

        // Length
        System.out.println("Current size: " + list.size());  
    }
}