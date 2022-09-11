
package lesson02;

import java.util.Optional;

/**
 *
 * @author sugar
 */
public class Bus extends Cars{

    
    private final String mProperty; 

    public String getProperty() { 
        return Optional.ofNullable(mProperty).orElse(Constants.SFM_UNDEFINED);
    }
    
    
    public Bus(int pHorsePower, int pVolume, String pRegNum, String pProperty) {
        super(pHorsePower, pVolume, pRegNum);
        mProperty = pProperty;
    }
 
    @Override
    public String toString() {
        return super.toString()+ " Bus{" + "mProperty=" + mProperty + '}';
    }

    @Override
    public void printAdditionalProperty() {
        System.out.println("Additional property "+ this.getProperty());
    }


    
    


    
    
}
