package lesson03.Collections;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class WorkWithCollection2 {

	public WorkWithCollection2() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) 
	{
		Collection<String> lStr = new ArrayList<>();
		lStr.add("a");
		lStr.add("b");
		lStr.add("d");
		lStr.add("s");
		lStr.add(null);
		lStr.add("g");
		lStr.add("h"); 
		lStr.add("j");
		lStr.add("t");
		lStr.add(null);
		Collection<String> lStrRemove = new ArrayList<>();
		// для работы с элементами в Stream
		
		lStr = filterCollection(lStr);
		System.out.println(lStr);
		
		ValueHolder lValueHolder = new ValueHolder();
		lValueHolder.addElement("aa");
		//lValueHolder.getUnmodifiableCollection().add("aaaaa");//изм енение немодиф. объекта
		System.out.println(Arrays.toString(lValueHolder.getStringArray(lStrRemove)));
		lValueHolder.getStringArray(lStrRemove);

	}

	public static Collection<String> filterCollection(final Collection<String> pValue) 
	{	
		//Collection<String> lStr1 = lStrRemove.stream().filter(pS -> pS.equals("a")).collect(Collectors.toCollection(ArrayList::new));
		//System.out.println(lStr.stream().filter(pS -> pS.equals("a")).collect(Collectors.toCollection(ArrayList::new)));
		//System.out.println(pValue.stream().filter(Objects::nonNull).filter(pS -> pS.equals("a")).collect(Collectors.toCollection(ArrayList::new)));
			return pValue.stream().filter(Objects::nonNull).filter(pS -> !pS.equals("a")).collect(Collectors.toCollection(ArrayList::new));
			
	}
}
