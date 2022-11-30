package lesson04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main5 {
	public static void main(String[] args) {
		doSmth("AGJNKJLLKLK<L:", "SFPJODSJFjsccjsd", "DIJDIJsdcsdcsdc");
		
		Set<Integer> lSet = new LinkedHashSet<>(); 
		Set<ForSet> lSet1 = new LinkedHashSet<>(); 
		
		lSet.add(9);
		lSet.add(1);
		lSet.add(3);
		lSet.add(5);
		lSet.add(5);
		lSet.add(6);
		lSet.add(7);
		lSet.add(8);
		lSet.add(8);
		lSet.add(10);
	
		ForSet lFS1 = new ForSet();
		lFS1.mInt = 10;
		lFS1.mStr1 = "AA";
		lFS1.mStr2 = "BB";
		ForSet lFS2 = new ForSet();
		lFS2.mInt = 20;
		lFS2.mStr1 = "AA";
		lFS2.mStr2 = "BB";
		 
		//System.out.println("Set: " + lSet.toString());

		lSet1.add(lFS1);
		lSet1.add(lFS2);
		
		System.out.println("Set: "+ lSet.toString());
		System.out.println("Set: "+ lSet1.toString());
		

		
	}
	
	public static void doSmth(String...pStrings) {
		System.out.println(Stream.of(pStrings).filter(p -> p.length()>10)
				.collect(Collectors.toCollection(ArrayList::new)));
		
	}
}
 
class ForSet
{
	@Override
	public String toString() {
		return "ForSet [mStr1=" + mStr1 + ", mStr2=" + mStr2 + ", mInt=" + mInt + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mInt, mStr1);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ForSet other = (ForSet) obj;
		return Objects.equals(mInt, other.mInt) && Objects.equals(mStr1, other.mStr1);
	}
	String mStr1;
	String mStr2;
	Integer mInt;

	
	
}


