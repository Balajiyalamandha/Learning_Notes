package collection;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet<Integer> prices = new TreeSet<>();
	
	prices.add(500);
	prices.add(3500);
	prices.add(2500);
	
	System.out.println(" Sorted Prices: " + prices);
	System.out.println(" Highest Prices: " + prices.last());
	System.out.println(" Lowest Prices: " + prices.first());
	System.out.println(" Lowest Prices: " + prices.getFirst());
	System.out.println(" Lowest Prices: " + prices.hashCode());
	
	
	
}
}
