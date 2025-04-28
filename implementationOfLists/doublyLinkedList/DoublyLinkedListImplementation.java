package implementationOfLists.doublyLinkedList;


class Node<G>{
	G data;
	Node<G> prev;
	Node<G> next;
	public Node(G data) {
		this.data = data;
	}
}

class DoublyLinkedList<G>{
	private Node<G> head;
    private Node<G> tail;
    private Node<G> temp;
    private int size;
    public void addFirst(G data) {
    	Node<G> newNode = new Node<G>(data);
    	if(head==null) {
    		tail = newNode;
    	}
    	else {
    		head.prev = newNode;
    		newNode.next = head;
    	}
    	head = newNode;
    	size++;
    }
    public void addLast(G data) {
    	Node<G> newNode = new Node<G>(data);
    	if(tail==null) {
    		head = newNode;
    	}
    	else {
    		tail.next = newNode;
    		newNode.prev = tail;
    	}
    	tail = newNode;
    	size++;
    }
    public void addAtIndex(int index, G data) {
    	if(index<0 || index>size())
    		System.err.println("IndexOutOfBoundsException");
    	else if(index == size())
    		addLast(data);
    	else if(index == 0)
    		addFirst(data);
    	else {
    		Node<G> newNode = new Node<G>(data);
    		Node<G> prev = null;
    		temp = head;
    		int i = 0;
    		while(temp!=null && i < index) {
    			prev = temp;
    			temp = temp.next;
    			i++;
    		}
    		Node<G> nextNode = prev.next;
    		prev.next = newNode;
    		nextNode.prev = newNode;
    		newNode.prev = prev;
    		newNode.next = nextNode;
    		size++;
    	}
    }
    public void removeFirst() {
    	if(head==null) {
    		System.out.println("List is empty");
    	}
    	else {
    		head = head.next;
    		if(head==null)
    			tail = null;
    		else
    			head.prev = null;
    		size--;
    	}		
    }
    public void removeLast() {
    	if(tail==null)
    		System.out.println("List is empty");
    	else if(head.next==null) {
    		head = tail = null;
    		size--;
    	}
    	else {
    		tail = tail.prev;
    		tail.next = null;
    		size--;
    	}
    }
    public void removeAtIndex(int index) {
    	if(head==null) {
    		System.out.println("List is empty");
    	}
    	else if(index < 0 && index>=size()) {
    		System.out.println("IndexOutOfBound");
    	}
    	else if(index==0){
    		removeFirst();
    	}
    	else if(index==size()-1) {
    		removeLast();
    	}
    	else{
    		temp = head;
    		int i=0;
    		while(temp.next!=null && i<index-1) {
    			temp = temp.next;
    			i++;
    		}
    		temp.next = temp.next.next;
    		temp.next.prev = temp;
    		size--;
    	}
    }
    public G peekFirst() {
    	if(head==null)
    	{
    		System.out.println("List is empty");
    		return null;
    	}
    	return head.data;
    }
    public G peekLast() {
    	if(tail==null)
    	{
    		System.out.println("List is empty");
    		return null;
    	}
    	return tail.data;
    }
    public boolean isEmpty() {
    	return head==null;
    }
    public boolean contains(G value) {
    	temp = head;
    	while(temp!=null) {
    		if(temp.data.equals(value))
    			return true;
    		temp = temp.next;
    	}
    	return false;
    }
    public int indexOf(G value) {
    	int i = 0;
    	temp = head;
    	while(temp!=null) {
    		if(temp.data.equals(value))
    			return i;
    		i++;
    		temp = temp.next;
    	}
    	return -1;
    }
    public int size() {
    	return size;
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
    public void displayReversly() {
    	if(tail==null) {
    		System.out.println("Empty list");
    	}
    	else {
    		temp = tail;
    		System.out.print("[");
    		while(temp!=null) {
    			if(temp.prev!=null)
    				System.out.print(temp.data+", ");
    			else
    				System.out.print(temp.data);
    			temp = temp.prev;
    		}
    		System.out.print("]");
    		System.out.println();
    	}
    }
}


public class DoublyLinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<String> doublyLl = new DoublyLinkedList<>();
		System.out.println(doublyLl.isEmpty());
		doublyLl.display();
		doublyLl.removeFirst();
		doublyLl.addLast("last");
//		doublyLl.removeFirst();
//		doublyLl.removeLast();
		doublyLl.display();
		doublyLl.addLast("hell yeah..");
		doublyLl.addFirst("Hellooo");
		doublyLl.display();
		doublyLl.addFirst("Hi Shiv");
		doublyLl.addFirst("Welcome home");
		doublyLl.addLast("Jarvis");
		doublyLl.display();
		doublyLl.displayReversly();
		doublyLl.addAtIndex(1, "Cric");
		System.out.println();
		doublyLl.display();
		doublyLl.removeFirst();
		doublyLl.display();
		doublyLl.removeFirst();
		doublyLl.display();
		doublyLl.removeLast();
		doublyLl.display();
		System.out.println(doublyLl.size());
		doublyLl.removeAtIndex(1);
		doublyLl.display();
		System.out.println(doublyLl.peekFirst());
		System.out.println(doublyLl.peekLast());
		System.out.println(doublyLl.isEmpty());
		System.out.println(doublyLl.contains("hell yeah.."));
		System.out.println("Index : "+doublyLl.indexOf("Shiv.."));
	}

}
