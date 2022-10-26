package lesson04;

public final class FactoryClass implements FactoryClassService {
	
	private  String mName;
	private  String mValue;
	private int mAge =0;
	
	public static class Builder
	{
		private  String mValue= "DEFAULT" ;
		private int mAge =0;
		private  String mName = "DEFAULT";
		
		
		public Builder setmName(String mName) {
			this.mName = mName;
			return this;
		}
		public Builder setmValue(String mValue) {
			this.mValue = mValue;
			return this;
		}
		public Builder setmAge(int mAge) {
			this.mAge = mAge;
			return this;
		}
		
		
		private String getmName() {
			return mName;
		}
		private String getmValue() {
			return mValue;
		}
		private int getmAge() {
			return mAge;
		}

		public FactoryClassService build() 
		{
			return createInstanceWithParameters(this.mName, this.mValue, this.mAge);
		}
		
		Builder()
		{
			
		}
	

	}
	
	public static FactoryClass.Builder builder()
	{
		return new Builder();
	}
	
	 
	 public FactoryClass() {
		super(); 
 
	}
	 

	
	private FactoryClass (String pName, String pValue, int pAge) {
		super();
		setName(pName);
		setValue(pValue);
		setAge(pAge);
	}
	
	private static FactoryClassService createInstance() {
		return new FactoryClass();
	}
	
	private static FactoryClassService createInstanceWithParameters(String pName, String pValue, int pAge) {
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
 