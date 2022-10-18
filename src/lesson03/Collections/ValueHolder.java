package lesson03.Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.ArrayList;

public class ValueHolder {

 //НЕ отдавать коллекцию за пределы класса, модифицровать только внутри!(Collections.unmodifiableCollection)
	
	private Collection<String> mValueCollection;
 
	private Collection<String> getmValueCollection() {
		return Optional.ofNullable(mValueCollection).orElseGet(()-> mValueCollection = new ArrayList<>());
	}
	
	public void addElement(String pString) 
	{
		getmValueCollection().add(pString);
	}
	
	public void addAllElements(Collection<String> pVal) 
	{
		getmValueCollection().addAll(pVal); 
	}
	
	public Collection<String> getUnmodifiableCollection() 
	{
		return Collections.unmodifiableCollection(this.getmValueCollection());
	}

	public String[] getStringArray(Collection<String> pValue) {
		return this.getmValueCollection().toArray(new String[0]);
		
		  
	}
}
