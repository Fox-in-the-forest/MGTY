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
