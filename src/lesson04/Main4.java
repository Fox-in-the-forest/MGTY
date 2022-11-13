package lesson04;

public class Main4 
{
	public Main4() 
	{
	FactoryClassService lfc = FactoryClass.createInstance();
	FactoryClassService lfc1 = new FactoryClass();
	String lStr1 = FactoryClass.createInstance().Submit(); // фабричный метод
	
	FactoryClass.Builder lBuilder = FactoryClass.builder(); 
	FactoryClassService lInstance = FactoryClass.builder().setmAge(0).setmName("Name").setmValue("Value").build();//метод строитель 
	
	FactoryClass1.builder().pStr1(lStr1).pStr2(lStr1);//метод строитель через lombok
	FactoryClass1.buildInstance().mFiled1("one").mFiled2("two").build();
	}
}
 