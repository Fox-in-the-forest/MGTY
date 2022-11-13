package lesson04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class Class1 {
	Collection<Class2> mClass2Collection;

	public Collection<Class2> getmClass2Collection() {
		return Optional.ofNullable(mClass2Collection).orElseGet(()-> mClass2Collection= new ArrayList());
	}
}
