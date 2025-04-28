package implementationOfLists.singlyLinkedList;

class Node<T> {
    T data;
    Node<T> next;

    public Node(T value) {
        data = value;
        next = null;
    }
}

class LinkedListModel<T> {
    private Node<T> head;
    private Node<T> tail;
    private Node<T> temp;

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            tail = newNode;
        } else {
            newNode.next = head;
        }
        head = newNode;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public void addAtPosition(int index, T value) {
        if (index < 0 || index > size()) {
            System.err.println("IndexOutOfBoundsException");
            return;
        }
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size()) {
            addLast(value);
            return;
        }

        Node<T> newNode = new Node<>(value);
        int i = 0;
        Node<T> prev = null;
        temp = head;
        while (temp != null && i < index) {
            prev = temp;
            temp = temp.next;
            i++;
        }
        if (prev != null) {
            prev.next = newNode;
            newNode.next = temp;
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = tail = null;
            return;
        }
        temp = head;
        while (temp.next != null && temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }

    public void removeAtPosition(int index) {
        if (index < 0 || index >= size()) {
            System.err.println("IndexOutOfBoundsException");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size() - 1) {
            removeLast();
            return;
        }
        int i = 0;
        temp = head;
        Node<T> prev = null;
        while (temp != null && i < index) {
            prev = temp;
            temp = temp.next;
            i++;
        }
        if (prev != null && temp != null) {
            prev.next = temp.next;
        }
    }

    public T peekFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        return head.data;
    }

    public T peekLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return null;
        }
        return tail.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(T value) {
        temp = head;
        while (temp != null) {
            if (temp.data.equals(value)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(T value) {
        int index = 0;
        temp = head;
        while (temp != null) {
            if (temp.data.equals(value)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public int size() {
        int count = 0;
        temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void display() {
    	if(head==null) {
    		System.out.println("Empty list");
    	}
    	else {
    		temp = head;
    		System.out.print("[");
    		while(temp!=null) {
    			if(temp.next!=null)
    				System.out.print(temp.data+", ");
    			else
    				System.out.print(temp.data);
    			temp = temp.next;
    		}
    		System.out.print("]");
    		System.out.println();
    	}
    }
}


public class LinkedListImplementation {

	public static void main(String[] args) {
		LinkedListModel<String> list = new LinkedListModel<>();

        list.addFirst("Apple");
        list.addLast("Banana");
        list.addAtPosition(1, "Mango");
        list.display();  

        list.removeAtPosition(1);
        list.display();  

        System.out.println("First element: " + list.peekFirst());  
        System.out.println("Last element: " + list.peekLast());    
        System.out.println("Contains 'Banana'? " + list.contains("Banana"));  
        System.out.println("Index of 'Banana': " + list.indexOf("Banana"));   
        System.out.println("List size: " + list.size()); 
	}

}
