
package lesson02.Exception;

import java.util.Objects;
import java.util.Optional;


/**
 *
 * @author sugar
 */
public class MainUncheked {
    public static void main(String[] args) 
    {
        Class1 lClass1 = new Class1();
//        Optional.ofNullable(lClass1).map(Class1::getmClass2).map(t -> {
//			try {
//				return t.getmClass3();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		})
        make(); 
        make10(null); 
        
        
    }
    
    
    private static void make()
    {
        make2();
    }
    private static void make2()
    {
        make4();
    }
    private static void make4()
    {
        try {
            make1();
        } catch (MainException ex) {
            throw new IllegalStateException("Translate to Unchecked: ", ex);
        }
    }
    
    private static void make1() throws MainException
    {
        throw new MainException("Main Ecxeption");
    }

    private static void make10(String pValue) 
    {
        if(pValue == null)
        {
            //throw new IllegalArgumentException("Val: null");
            String lValue = Objects.requireNonNull(pValue); 
        }
    }
}
