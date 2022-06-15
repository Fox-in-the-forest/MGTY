/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson2.Exception;

import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sugar
 */
public class MainUncheked {
    public static void main(String[] args) 
    {
        //Class1 lClass1 = new Class1();
        //Optional.ofNullable(lClass1).map(Class1::getmClass2).map(Class2::getmClass3);// лямбда выражение разворачивается в eclipse       
        make(); 
        
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
}
