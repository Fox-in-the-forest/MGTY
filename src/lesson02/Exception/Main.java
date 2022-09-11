
package lesson02.Exception;

/**
 *
 * @author sugar
 */
public class Main {
    public static void main(String[] args) throws Exception {
//Throwable ->  CheckException<- Ecxeption ->RuntimeException -> Unchekexception
    make();
    try
    {
        make();
    }
    catch(MainException pE)
    {
        System.out.println(pE.getMessage());
        pE.printStackTrace();
    }
        System.out.println("Program finished");
    }
    
    public static void make() throws MainException
    {
         make1();
    }
        public static void make1() throws MainException
    {
         int i =1;
         //Так делать нельзя
         if(i<10)
         {
             throw new MainException("i>10");
         }
    }
        
}
 