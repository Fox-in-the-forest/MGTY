
package lesson02;

/**
 *
 * @author sugar
 */
public class Main {
    public static void main(String[] args) {
        
        Cars lBus = new Bus (100, 100, "43678", "PROPERTY");
        Cars lTrucks = new Trucks(100, 100, "43678", 189);
        Bus lBus1 = new Bus(100, 100, "43678", "PROPERTY");
        Trucks lTrucks1 = new Trucks(100, 100, "43678", 189);
        Cars lNullType = null;
        
        
        //printCharacteristics(lBus1);
        printCharacteristicsCars(lBus);
        printCharacteristicsCars(lTrucks); 
        
        if(lTrucks instanceof Bus)
        {
            System.out.println("Trucks is Bus");
            Bus lBus2 = (Bus) lTrucks;
            printCharacteristics(lBus2);
        
        }
        else{System.out.println("Tracks is not Bus");}
        
        if(lBus instanceof Bus)
        {
            System.out.println("Bus is Bus");
            Bus lBus2 = (Bus) lBus;
            printCharacteristics(lBus2);
        
        }
        else{System.out.println("Tracks is not Bus");}
        
        if(lNullType instanceof Bus)
        {
            System.out.println("lNullType is bus");
        }
        else
        {
            System.out.println("lNullType is not bus");
        }

       
    }
    
    
    //1 вариант - "bad"
    public static void printCharacteristics(Bus pBus)
    {
        System.out.println("printCharacteristics " + pBus.toString());
    }
    public static void printCharacteristics(Trucks pBus)
    {
  
    }
        
    //2 вариант - "good"
    public static void printCharacteristicsCars(Cars pCars)
    {
        System.out.println(pCars.toString());
        pCars.printAdditionalProperty();
        System.out.println(pCars.getClass().getName());
      
             
    }
        
}
