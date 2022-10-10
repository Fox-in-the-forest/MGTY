package lesson03.Collections;

import java.util.function.Consumer;

public class CustomConsumer implements Consumer<String>  {

	@Override
	public void accept(String t) {
		System.out.println(t);
		System.out.println(t);
		System.out.println(t);
		System.out.println(t);
		System.out.println(t);
		
	}


}
