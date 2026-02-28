package collection;

import java.util.HashSet;

public class Hashset {
public static void main(String[] args) {
	HashSet<String> mobiles = new HashSet<>();
	mobiles.add("Oneplus 9");
	mobiles.add("Iphone 17");
	mobiles.add("Oneplus 9");
	System.out.println("Available mobiles: " +mobiles);
}
}
