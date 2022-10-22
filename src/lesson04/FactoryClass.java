package lesson04;

public class FactoryClass implements FactoryClassService {
	
	private final String mName;
	private final String mValue;
	
	private FactoryClass() {
		super();
		mName = "DEFAULT";
		mValue = "DEFAULT";
	}
	
	private FactoryClass (final String pName, final String pValue) {
		super();
		mName = "DEFAULT";
		mValue = "DEFAULT";
	}
	
	public static FactoryClassService createInstance() {
		return new FactoryClass();
	}
	
	public static FactoryClassService createInstanceWithParameters(String pName, String pValue) {
		FactoryClass lInstance = new FactoryClass(pName, pValue);
		//lInstance.getClass().getConstructor();
		return lInstance;
	}
} 
 