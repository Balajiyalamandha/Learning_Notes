package collection;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args)
	{
		HashMap<Integer,String> customerPhone =new HashMap<>();
		customerPhone.put(101, "8686855840");
		customerPhone.put(102, "9581261513");
		customerPhone.put(103, "9381347418");
		System.out.println("Customer Phone map: " +customerPhone);
		System.out.println("Phone of 101: " +customerPhone.get(102));
	}
}
