package lesson03;

public class TestClass implements TestService2 {
	
// цепочка наследования интерфейсов.
	@Override
	public void test1(String pString) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test2() {
		try {
			Object lObject = new TestClass();
		}
		catch(Exception e){
			throw new IllegalStateException("", e);
		}
		
	}

	@Override
	public void test2_1() {
		// TODO Auto-generated method stub
		
	}

}
