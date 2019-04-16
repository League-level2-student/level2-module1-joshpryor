package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("marc");
		names.add("josh");
		names.add("asher");
		names.add("sam");
		names.add("max");
		names.add("jackie");
		
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for ( String name : names) {
			System.out.println(name);
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("");
	System.out.println(names.get(2));	
	System.out.println(names.get(4));	
	//System.out.println(names.get(5));	
		//6. Print all the Strings in reverse order.
	System.out.println("");
	System.out.println(names.get(5));	
	System.out.println(names.get(4));	
	System.out.println(names.get(3));
	System.out.println(names.get(2));	
	System.out.println(names.get(1));	
	System.out.println(names.get(0));	
	System.out.println("");
		//7. Print only the Strings that have the letter 'e' in them.
	System.out.println(names.get(2));	
	System.out.println(names.get(5));	
	}
}
