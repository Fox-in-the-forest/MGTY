package lesson03.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class WorkWithCollection {

	public WorkWithCollection() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) 
	{
		Collection<String> lStr = new ArrayList<>();
		lStr.add("a");
		lStr.add("b");
		lStr.add("d");
		lStr.add("s");
		lStr.add("g");
		lStr.add("h");
		lStr.add("j");
		lStr.add("t");
		Collection<String> lStrRemove = new ArrayList<>();
		System.out.println("Coll before : " + lStr);
		for(String lString: lStr) 
		{
			
			if(Objects.equals(lString, "a")) 
			{
				lStrRemove.add(lString); 
			}
			if(Objects.equals(lString, "b")) 
			{
				lStrRemove.add(lString);
			}
		}
		lStr.removeAll(lStrRemove);
		//выбрасывается исключение java.util.ConcurrentModificationException 
		//попытка параллельного изменения 
		System.out.println("Coll after : " + lStr);
		
		// для работы с элементами stream
		
		
	}

}
