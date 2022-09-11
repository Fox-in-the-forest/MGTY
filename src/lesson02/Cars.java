
package lesson02;

import java.util.Optional;

/**
 *
 * @author sugar
 */
public abstract class Cars {
  
    private final int mHorsePower;
    private final int mVolume;
    private final String mRegNum;
    
    public Cars(final int pHorsePower, final int pVolume, final String pRegNum)
    {
        super();
        this.mHorsePower = pHorsePower;
        this.mVolume = pVolume;
        this.mRegNum = pRegNum;
        
    }

    public int getmHorsePower() {
        return mHorsePower;
    }
    public int getmVolume() {
        return mVolume;
    }
    public String getmRegNum() {
        return Optional.ofNullable(mRegNum).orElse(Constants.SFM_UNDEFINED);
    }
    
    public abstract void printAdditionalProperty();
    
    @Override
    public String toString() {
        return "Class: " + super.toString() + " Cars{" + "mHorsePower=" + mHorsePower + ", mVolume=" + mVolume + ", mRegNum=" + mRegNum + '}';
    }
    
    
    
    
    
}
