package lesson03.Collections;

import java.util.ArrayList;
import java.util.*;

public class CollectionExp {
	
	public static void main(String[] args) {
		
		Iterable<String> lIt1 = new ArrayList<>();
		printScreen(lIt1);
		
		Collection<String> lIt2 = new ArrayList<>();
		printScreen(lIt2);
		
		List<String> lIt3 = new ArrayList<>();
		printScreen(lIt3);
		
		ArrayList<String> lIt4 = new ArrayList<>();
		printScreen(lIt4);
	}

	
	//ослабили тип с ArrayList до Iterable в printScreen методе
	public static void printScreen(Iterable<String> pValue) 
	{
		pValue.forEach(pS -> System.out.println(pS));
	}
	
	public static void workCollection(Collection <String> pValue) {
		
		pValue.add("");
	} 
}
  