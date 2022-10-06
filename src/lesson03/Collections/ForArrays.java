package lesson03.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;



public class ForArrays {

	public static void main(String[] args) {
		System.out.println(String.class.getName());
		System.out.println("args: "+ args.getClass().getName());
		Iterable<String> lStringIterable = new ArrayList(200);
		
		//java 1.8+
		//через создание потребителя (consumer)
		Consumer<? super String> lConsumer = pString -> {
			System.out.println(pString);
		};
		lStringIterable.forEach(lConsumer);
		 
		//без создания переменной, лямбда
		lStringIterable.forEach(pString -> System.out.println(pString));
		
		//со ссылкой на метод
		lStringIterable.forEach(ForArrays::printString);
		 

		//java1.8-
		Iterator<String> lIterator = lStringIterable.iterator();
		while(lIterator.hasNext()) 
		{
			String lString = lIterator.next();
			System.out.println(lString);
		}
	
	}
	
	
	public static void printString(String pString) 
	{
		System.out.println(pString);
	}
	
	
	
	
	
}
