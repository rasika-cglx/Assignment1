package cog;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenNumbers {

	static ArrayList<Integer> A1 = new ArrayList<>();
	static ArrayList<Integer> A2 = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user Input for Even Numbers: ");
		int n = sc.nextInt();
		SaveEvenNumbers(n);
		PrintEvenNumbers();
		System.out.println("Enter Number which you want to search: ");
		int search = sc.nextInt();
		SearchEvenNumber(search);
				
	}
	
	private static Integer SearchEvenNumber(int search) {
		boolean s = A1.contains(search);
		if (s) {
			System.out.println("List contains "+search);
			return search;
			
		} else {
			System.out.println("List does not contains "+search);
			return 0;
		}		
	}

	private static void PrintEvenNumbers() {
		for (int i = 0; i < A1.size(); i++) {
			A2.add(A1.get(i)*2);
		}	
		System.out.println(A2);
	}

	private static void SaveEvenNumbers(int n) {
		for (int i = 2; i <= n; i++) {
			if (i%2 == 0) {
				A1.add(i);
			}
		}
//		System.out.println(A1);
	}
	
}
