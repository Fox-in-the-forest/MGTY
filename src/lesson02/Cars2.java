
package lesson02;

import java.util.Optional;

/**
 *
 * @author sugar
 */
public abstract class Cars2 implements ICars, ICarsAdditionalProperty {
  
    private final int mHorsePower;
    private final int mVolume;
    private final String mRegNum;
    
    public Cars2(final int pHorsePower, final int pVolume, final String pRegNum)
    {
        super();
        this.mHorsePower = pHorsePower;
        this.mVolume = pVolume;
        this.mRegNum = pRegNum;
        
    }

    @Override
    public int getmHorsePower() {
        System.out.println("Cars2");
        return mHorsePower;
    }
    @Override
    public int getmVolume() {
        return mVolume;
    }
    @Override
    public String getmRegNum() {
        return Optional.ofNullable(mRegNum).orElse(Constants.SFM_UNDEFINED);
    }
    
    @Override
    public String toString() {
        return "Class: " + super.toString() + " Cars{" + "mHorsePower=" + getmHorsePower() + ", mVolume=" + mVolume + ", mRegNum=" + mRegNum + '}';
    }
    @Override
    public abstract void printAdditionalProperty();
    
    
    
}
