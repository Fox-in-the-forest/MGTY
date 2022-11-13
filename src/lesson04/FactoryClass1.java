package lesson04;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder(builderClassName = "Builder", builderMethodName = "buildInstance")
public class FactoryClass1 
{
	private String mFiled1;
	private String mFiled2;
	
	
	private static FactoryClass1 createInstance(final String pStr1, final String pStr2) 
	{
		FactoryClass1 lInst = new FactoryClass1(pStr1, pStr2);
		lInst.setMFiled1(pStr1);
		lInst.setMFiled2(pStr1);
		return lInst;
		
	}
	
}
 