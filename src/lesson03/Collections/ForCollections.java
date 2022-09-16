package lesson03.Collections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForCollections {
	
	public static void main(String[] args) 
	{
		String[] pStringArray1 = initArray(2);
	
	}
	
	public static String[] initArray(final int pSize) {
		
		String[] pStringArray1 = new String[pSize];
		for(int i = 0; i<pStringArray1.length; i++) {
			pStringArray1[i] = String.valueOf("AAFFF");
			System.out.println(pStringArray1[i]);
		}
		
		return pStringArray1; 
	}
 	
}

