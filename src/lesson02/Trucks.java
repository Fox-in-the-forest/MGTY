
package lesson02;

/**
 *
 * @author sugar
 */
public class Trucks extends Cars {
    
    private final int mProperty;
    
    public int getProperty() {
        return mProperty;
    }
    

    public Trucks(final int pHorsePower,final int pVolume,final String pRegNum,final int pProperty) {
        super(pHorsePower, pVolume, pRegNum);
        this.mProperty = pProperty;
        
    }

    @Override
    public String toString() {
        return super.toString()+ " Trucks{" + "mProperty=" + mProperty + '}';
    }

    @Override
    public int getmVolume() {
        return super.getmVolume()-10;
    }

    @Override
    public void printAdditionalProperty() {
        System.out.println("Additional property "+ this.getProperty());
    }
    



    
}
