package lesson03.Collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForCollections {
	
	public static void main(String[] args) 
	{
		final String[] pStringArray1 = initArray(20);
		printArray(pStringArray1);
	
	}
	
	public static String[] initArray(final int pSize) {
		
		String[] pStringArray1 = new String[pSize];
		for(int i = 0; i<pStringArray1.length; i++) {
			pStringArray1[i] = String.valueOf("AAFFF");
			
		}
		
		return pStringArray1; 
	}
 	
	public static void printArray(final String[] pStringArray1) 
	{
		for(String lString: pStringArray1) {
			System.out.println("OUR VALUE: "+ lString);
		}
	}
}

