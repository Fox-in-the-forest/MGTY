package lesson03;
@Deprecated
public interface TestService {
	void test1(String pString);
	
	@Deprecated(forRemoval = true, since = "Release 2")
	
	void test2();
	
	void test2_1();
}
