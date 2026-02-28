package collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> customers = new LinkedHashMap<>();
	customers.put(601,"Balaji");
	customers.put(602,"Surya");
	customers.put(603,"Sunny");
	customers.put(604,"Prathi");
	
	System.out.println("Initial Map: " + customers);
	
	//Updating Customers
	customers.put(602, "Yoga");
	System.out.println("After Updating: " + customers);
	
	//Removing Customer
	customers.remove(604);
	System.out.println("After Removing: " + customers);
	
}
}
