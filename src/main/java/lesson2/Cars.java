/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson2;

import java.util.Optional;

/**
 *
 * @author sugar
 */
public class Cars {
    
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

    
    
    
    
}
