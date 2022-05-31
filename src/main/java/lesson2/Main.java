/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson2;

/**
 *
 * @author sugar
 */
public class Main {
    public static void main(String[] args) {
        
        Cars lBus = new Bus(100, 100, "43678", "PROPERTY");
        Cars lTrucks = new Trucks(100, 100, "43678", 189);
        Bus lBus1 = new Bus(100, 100, "43678", "PROPERTY");
        Trucks lTrucks1 = new Trucks(100, 100, "43678", 189);
        printCharacteristics(lBus1);
        printCharacteristics((Bus) lBus); // приведение типов!
        System.out.println("");
    }
    
    
    //1 вариант
    public static void printCharacteristics(Bus pBus)
    {
        
    }
    public static void printCharacteristics(Trucks pBus)
    {
        
    }
        
    //2 вариант
    public static void printCharacteristicsCars(Cars pBus)
    {
        
    }
        
}
