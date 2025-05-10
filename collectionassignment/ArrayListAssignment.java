package collectionassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListAssignment obj = new ArrayListAssignment();
		obj.addAndRetrieve();
		
		obj.removeUsingiterator();
		
		List<Character> charList = new ArrayList<>();
		charList.add('G');
		charList.add('w');
		charList.add('e');
		charList.add('n');
		charList.add('l');
		charList.add('S');
		charList.add('h');
		charList.add('i');
		charList.add('v');
		charList.add('u');
		char c = 's';
		System.out.println("Index of '"+c+"' : "+obj.getIndex(c,charList));
		
		List<Integer> integerList = new ArrayList<>();
		integerList.add(24);
		integerList.add(52);
		integerList.add(25);
		integerList.add(1);
		integerList.add(11);
		integerList.add(53);
		integerList.add(13);
		integerList.add(36);
		integerList.add(99);
		integerList.add(75);
		System.out.println("Before Sorting - "+integerList);
		obj.sortTheList(integerList);
		System.out.println("After Sorting - "+integerList);
		
		List<String> strList = new ArrayList<>();
		strList.add("apple");strList.add("banana");strList.add("cherry");
		String strArr[] = obj.arrayListToArray(strList);
		System.out.println("List to Array - "+Arrays.toString(strArr));
		List<String> newStrList = obj.arrayToArrayList(strArr);
		System.out.println("Array to List - "+newStrList);
		
	}
	private void addAndRetrieve() {
		List<String> list = new ArrayList<>();
		list.add("Guava");
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		list.add("Pineapple");
		System.out.println("Fruit List - "+list);
		System.out.println("Third fruit - "+list.get(2));
	}
	private void removeUsingiterator() {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println("Before Removing - "+list);
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next()>30)
				iterator.remove();
		}
		System.out.println("After Removing - "+list);
	}
	private int getIndex(char c, List<Character> charList) {
		for(int i=0;i<charList.size();i++)
			if(charList.get(i)==c)
				return i;
		return -1;
	}
	private void sortTheList(List<Integer> list){
		Collections.sort(list);
	}
	private String[] arrayListToArray(List<String> list) {
		return list.toArray(new String[0]);
	}
	private List<String> arrayToArrayList(String[] strArr) {
		return new ArrayList<>(Arrays.asList(strArr));
	}
}
