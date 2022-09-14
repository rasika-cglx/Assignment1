package cog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayOfStringOnly {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 5 different Strings in an array ");
		System.out.println("String 1:");
		arrayList.add(sc.next());
		System.out.println("String 2:");
		arrayList.add(sc.next());
		System.out.println("String 3:");
		arrayList.add(sc.next());
		System.out.println("String 4:");
		arrayList.add(sc.next());
		System.out.println("String 5:");
		arrayList.add(sc.next());
		
		printAll(arrayList);
	}
	
	public static void printAll(ArrayList<String> arraylist) {
		Iterator<String> iterable = arraylist.iterator();
		while(iterable.hasNext()) {
			Object obj = iterable.next();
			System.out.println(obj);
		}
	}
}
