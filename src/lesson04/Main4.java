package lesson04;

public class Main4 
{
	public Main4() 
	{
	FactoryClassService lfc = FactoryClass.createInstance();
	FactoryClassService lfc1 = new FactoryClass();
	
	String lStr1 = FactoryClass.createInstance().Submit(); // ��������� �����
	
	FactoryClassService lInstance = FactoryClass.builder().setmAge(0).setmName("Name").setmValue("Value").build();//����� ��������� 
	}
}
