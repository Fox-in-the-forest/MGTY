package lesson04;

import java.util.Optional;

public class Class2 {

	private String mString;

	public String getmString() {
		return Optional.ofNullable(mString).orElse("UNDEFINED");
	}

	public void setmString(String mString) {
		this.mString = mString;
	}

	@Override
	public String toString() {
		return "Class2 [mString=" + getmString()  + "]";
	}
	
	
	
}
