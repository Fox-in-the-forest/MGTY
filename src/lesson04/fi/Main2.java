package lesson04.fi;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Main2 {

	public static void main(String[] args) 
	{
	Map<Integer, String> lMap = new HashMap<>(); 
	lMap.put(1, "A");
	lMap.put(2, "B");
	lMap.put(3, "C");
	lMap.put(4, "D");
	lMap.put(5, "E");
	System.out.println(lMap.toString());
	lMap.putIfAbsent(1, "Y");
	BiFunction<? super Integer, ? super String, ? extends String> remappingFunction
	=(pI, PS1)-> 
	{
		System.out.println("Key exist");
		return PS1+"AAA";
	};
	lMap.computeIfPresent(1, remappingFunction );
	System.out.println(lMap.toString());
	
	//проход по ключам, неоптимальный метод
	for(Integer lKey: lMap.keySet())
	{
		String lValue = lMap.get(lKey);
		System.out.println(lKey + ":" + lValue);
	}
	
	// предпочтительнее
	for(Entry<Integer, String> lEntry:lMap.entrySet()) {
		System.out.println(lEntry.getKey()+":"+lEntry.getValue());
	}

	//java8
	BiConsumer<? super Integer, ? super String> BiConsumer = (pI, pS1)->
	{
		System.out.println(pI+":"+pS1);
	};
	lMap.forEach(BiConsumer); 
	
	//схлопывание!
	lMap.forEach((pI, pS1)->System.out.println(pI+":"+pS1));
	}
}
