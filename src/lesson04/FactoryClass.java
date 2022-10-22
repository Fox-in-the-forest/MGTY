package lesson04;

public class FactoryClass implements FactoryClassService {
	
	private  String mName;
	private  String mValue;
	private int mAge =0;

	private FactoryClass() {
		super();

	}
	
	private FactoryClass ( String pName,  String pValue,  int pAge) {
		super();
		mName = pName;
		mValue = pValue;
		mAge = pAge;
	}
	
	public static FactoryClassService createInstance() {
		return new FactoryClass();
	}
	
	public static FactoryClassService createInstanceWithParameters(String pName, String pValue, int pAge) {
		FactoryClass lInstance = new FactoryClass();
		//lInstance.getClass().getConstructor();
		lInstance.mName = pName;
		lInstance.mValue = pValue;
		lInstance.mAge = pAge;
		
		
		return lInstance;
	}
} 
 