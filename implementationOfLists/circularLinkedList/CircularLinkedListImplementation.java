package implementationOfLists.circularLinkedList;

class Node<G> {
    G data;
    Node<G> prev;
    Node<G> next;

    public Node(G data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
class CircularLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
            tail.next = head; // link a tail next to head
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; // link a tail next to head
        }
        size++;
    }

    public void addLast(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // link a tail next to head
        }
        size++;
    }

    public void addAtPosition(int index, T value) {
        if (index < 0 || index > size) {
            System.err.println("IndexOutOfBoundsException");
            return;
        }
        if (index == 0) {
            addFirst(value);
            return;
        }
        if (index == size) {
            addLast(value);
            return;
        }

        Node<T> newNode = new Node<>(value);
        Node<T> temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            Node<T> temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = head;
            tail = temp;
        }
        size--;
    }

    public void removeAtPosition(int index) {
        if (index < 0 || index >= size) {
            System.err.println("IndexOutOfBoundsException");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        Node<T> temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
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
        if (head == null) 
        	return false;
        Node<T> temp = head;
        do {
            if (temp.data.equals(value)) {
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    public int indexOf(T value) {
        if (head == null) return -1;
        Node<T> temp = head;
        int index = 0;
        do {
            if (temp.data.equals(value)) {
                return index;
            }
            temp = temp.next;
            index++;
        } while (temp != head);
        return -1;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node<T> temp = head;
        System.out.print("[");
        do {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != head) {
                System.out.print(", ");
            }
        } while (temp != head);
        System.out.println("]");
    }
}

public class CircularLinkedListImplementation {

	public static void main(String[] args) {
		CircularLinkedList<Integer> circularLl = new CircularLinkedList<>();
		System.out.println(circularLl.isEmpty());
		circularLl.display();
		circularLl.addFirst(12);
		circularLl.addFirst(11);
		circularLl.addLast(10);
		circularLl.display();
		circularLl.removeAtPosition(2);
		circularLl.addAtPosition(0, 15);
		circularLl.display();
		circularLl.removeFirst();
		circularLl.display();
		System.out.println(circularLl.contains(12));
		System.out.println(circularLl.indexOf(11));
		System.out.println(circularLl.isEmpty());
		circularLl.addLast(18);
		circularLl.addLast(513);
		circularLl.display();
		System.out.println(circularLl.peekFirst());
		System.out.println(circularLl.peekLast());
		System.out.println(circularLl.size());
	}

}
