package lesson04;

public final class FactoryClass implements FactoryClassService {
	
	private  String mName;
	private  String mValue;
	private int mAge =0;

	 public FactoryClass() {
		super(); 
 
	}
	
	private FactoryClass (String pName, String pValue, int pAge) {
		super();
		setName(pName);
		setValue(pValue);
		setAge(pAge);
	}
	
	public static FactoryClassService createInstance() {
		return new FactoryClass();
	}
	
	public static FactoryClassService createInstanceWithParameters(String pName, String pValue, int pAge) {
		FactoryClassService lInstance = new FactoryClass();
		//lInstance.getClass().getConstructor();
		lInstance.setName(pName);
		lInstance.setValue(pValue);
		lInstance.setAge(pAge);
		
		return lInstance;
	}

	@Override
	public String getName() {
		return mName;
	}

	@Override
	public void setName(String mName) {
		this.mName = mName;
	}

	@Override
	public String getValue() {
		return mValue;
	}

	@Override
	public void setValue(String mValue) {
		this.mValue = mValue;
	}

	@Override
	public int getAge() {
		return mAge;
	}

	@Override
	public void setAge(int mAge) {
		this.mAge = mAge;
	}

	@Override
	public String Submit() {
		// TODO Auto-generated method stub
		return null;
	}
} 
 