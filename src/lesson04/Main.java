package lesson04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Collection<Class1> lClass1Collection = new ArrayList<Class1>();
		
		
		lClass1Collection.add(new Class1());
		lClass1Collection.add(new Class1());
		lClass1Collection.add(new Class1());
		lClass1Collection.add(new Class1());
		lClass1Collection.add(new Class1());
		lClass1Collection.add(new Class1());
		
		System.out.println(lClass1Collection.stream()
			.map(p->p.getmClass2Collection().size())
			.collect(Collectors.toCollection(ArrayList::new)));
		
		lClass1Collection.stream()
		.peek(p -> p.getmClass2Collection().add(new Class2()))
		.collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println(lClass1Collection.stream()
			.map(p->p.getmClass2Collection().size())
			.collect(Collectors.toCollection(ArrayList::new)));
		
		lClass1Collection.stream()
			.peek(p -> p.getmClass2Collection().add(new Class2()))
			.collect(Collectors.toCollection(ArrayList::new));

		System.out.println(lClass1Collection.stream()
			.map(p->p.getmClass2Collection().size())
			.collect(Collectors.toCollection(ArrayList::new)));
		
		System.out.println(lClass1Collection.stream()
				.map(p->p.toString())
				.collect(Collectors.toCollection(ArrayList::new)));
		
		System.out.println(lClass1Collection.stream()
				.flatMap(p->p.mClass2Collection.stream())
				.collect(Collectors.toCollection(ArrayList::new)));
		
		System.out.println(lClass1Collection.stream()
				.flatMap(p->p .mClass2Collection.stream())
				.collect(Collectors.toCollection(ArrayList::new)).size());
		
		Object[] lObject = new Object[10];
		//Arrays.asList(lObject).stream()...;
		//Stream.of(lObject)...
		
		
	}
}
