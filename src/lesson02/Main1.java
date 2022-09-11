
package lesson02;



/**
 *
 * @author sugar
 */
public class Main1 {
    public static void main(String[] args) {
        Cars lBus = new Bus(100, 100, "43678", "PROPERTY");
        Cars lNull = null;
        if(lBus!=null){
        if(Bus.class.isAssignableFrom(lBus.getClass()))
            {
                System.out.println("Is bus");
            }
        }
        if(lNull!=null && Bus.class.isAssignableFrom(lNull.getClass()))
        {
            
        }
        if(Bus.class.isInstance(lNull))
        {
            System.out.println("Is bus null: is instance");
        }
        if(Bus.class.isInstance(lBus))
        {
            System.out.println("Is bus not null: is instance");
        }
    }
}
