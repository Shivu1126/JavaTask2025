package collectionassignment;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListAssignment obj = new LinkedListAssignment();
		obj.addAndRetrieveFirstAndLast();
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("one");linkedList.add("two");linkedList.add("three");linkedList.add("four");linkedList.add("five");
		System.out.println("Before Chnaging - "+linkedList);
		obj.toUpperCaseSpecificWord("three", linkedList);
		System.out.println("After Changing - "+linkedList);

		System.out.println();
		System.out.println("LinkedList:");
		System.out.println("------");
		LinkedList<Integer> integerList = new LinkedList<>();
		integerList.add(1);integerList.add(2);integerList.add(3);integerList.add(4);integerList.add(5);
		integerList.add(6);integerList.add(7);integerList.add(8);integerList.add(9);integerList.add(10);
		System.out.println("Befor removing - "+integerList);
		obj.removeAtIndex(2, integerList);
		obj.removeAtIndex(integerList.size()-1, integerList);
		System.out.println("After removing - "+integerList);
		System.out.println();
		System.out.println("Queue:");
		System.out.println("------");
		Queue<String> queue = new LinkedList<>();
		queue.add("Alice");queue.add("Bob");queue.add("Charlie");queue.add("Diana");
		System.out.println("Before Removing - "+queue);
		obj.removeFirstInQueue(queue);
		obj.removeFirstInQueue(queue);
		System.out.println("After Removing - "+queue);
		System.out.println();
		LinkedList<Character> charList = new LinkedList<>();
		charList.add('A');charList.add('B');charList.add('C');charList.add('D');charList.add('E');
		System.out.println("Ascending Order - "+charList);
		obj.printReverseLinekedList(charList);
	
	}
	private void addAndRetrieveFirstAndLast() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(5);linkedList.add(10);linkedList.add(15);linkedList.add(20);linkedList.add(25);
		System.out.println("First Element - "+linkedList.getFirst());
		System.out.println("Last Element - "+linkedList.getLast());
	}
	private void toUpperCaseSpecificWord(String replaceWord, LinkedList<String> list) {
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			if(iterator.next().equals(replaceWord))
				iterator.set(replaceWord.toUpperCase());
		}
	}
	private void removeAtIndex(int index, LinkedList<Integer> list) {
		if(index>=0 && index < list.size())
			list.remove(index);
		else
			System.out.println("Not valid index");
	}
	private void removeFirstInQueue(Queue<String> queue) {
		queue.poll();
	}
	private void printReverseLinekedList(LinkedList<Character> list) {
		System.out.print("Reversed LinkedList:");
		ListIterator<Character> itr = list.listIterator(list.size());
		System.out.print("[");
		while (itr.hasPrevious()) {
            System.out.print(itr.previous()+" ");
        }
		System.out.println("]");
		System.out.println();
	}
}
