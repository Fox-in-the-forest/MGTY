package lesson3;

import java.io.Serializable;

@Deprecated
public interface TestService extends Serializable, Cloneable{
	void test1(String pString);
	
	@Deprecated (forRemoval = true, since = "Release 2")
	void test2();
	
	void test2_1(String pString);
}
