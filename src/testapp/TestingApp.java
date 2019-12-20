/**
 * 
 */
package testapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author muthukumar.m
 *
 */
public class TestingApp {

	// instance variable
	int a = 10;
	int b = 20;
	
	// static variable
	static int c = 30;
	
	
	public int add(int a, int b) {
		// Local variable
		int c = a + b;
		return c;
	}
	
	public void display() {
		String s1 = "hello";
		String s2 = new String("hello");
		String s3 = s1;
		String s4 = s2;
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s1);
		System.out.println(s4 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
	}
	
	public void list() {
		List<String> list = new ArrayList<>();
		list.add("test");
		list.add("test1");
		list.add("list");
		list.add("list2");

		/*for (String string : list) {
			System.out.println(string);
		}*/
		
		//list.add("list3");
		//System.out.println(list.get(1));
		list.add(1, "list3");
		
		Collections.sort(list);
		
		Comparable<String> list2 = new Comparable<String>() {
			
			@Override
			public int compareTo(String o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Comparator<String> list3 = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		for (String string : list) {
			System.out.println(string);
		}
	}
	
	public void set() {
		Set<String> setList = new HashSet<>();
		setList.add("test");
		setList.add("test1");
		setList.add("test");
		setList.add("test2");
		setList.add("test3");
		
		for (String string : setList) {
			System.out.println(string);
		}
	}
	
	public void mapInt() {
		Map<Integer, String> maplist = new HashMap<>();
		maplist.put(1, "Test");
		maplist.put(2, "Test1");
		maplist.put(3, "Test2");
		maplist.put(4, "Test3");
		
		/*for(Map.Entry<Integer, String> entry : maplist.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue() );
		}
		*/
		
		maplist.forEach((k,v) -> System.out.println("Key :" + k + "Values : " + v));
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestingApp test = new TestingApp();
		
		/*System.out.println("HelloWorld");
		System.out.println(test.a);
		System.out.println(test.b);
		System.out.println(TestingApp.c);
		System.out.println(test.add(test.a, test.b));
		test.display();
		test.list();*/
		test.list();
		//test.set();
		//test.mapInt();
	}

}

