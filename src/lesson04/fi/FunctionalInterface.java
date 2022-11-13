package lesson04.fi;

import java.util.Optional;
import java.util.function.Supplier;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

public class FunctionalInterface {
	public void method(String pParameter) 
	{
		if(pParameter == null)
		{
		Optional.of(pParameter.chars());
		
		Supplier<? extends String> lSupplier = ()-> String.valueOf(10);
		Optional.ofNullable(pParameter).orElseGet(lSupplier);
		
		Optional.empty();
		}
	}
}
