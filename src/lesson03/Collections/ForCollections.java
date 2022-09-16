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
			pStringArray1[i] = String.valueOf("AAFFF") + i;
			
		}
		//while
		int index1 = 0;
		while(index1<pStringArray1.length) 
		{
			pStringArray1[index1]= pStringArray1[index1]+" add";
			index1++;
		}
		//do while
		int index2 = 0;
		do
		{
			pStringArray1[index2]= pStringArray1[index2]+" addNew";
			index2++;
		} 
		while(index2<pStringArray1.length);
		
		return pStringArray1; 
	}
 	
	public static void printArray(final String[] pStringArray1) 
	{
		int index = 0;
		//forEach
		for(String lString: pStringArray1) {
			System.out.println("VALUE: "+ lString);
			if(index ==4) {
				System.out.println("5:::VALUE: "+ lString);
			}
			index++;
		}
	}
}

