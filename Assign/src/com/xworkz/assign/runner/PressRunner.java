package com.xworkz.assign.runner;

import com.xworkz.assign.things.DigitalPrintingPress;
import com.xworkz.assign.things.PrintingPress;

public class PressRunner {

	public static void main(String[] args) {
		System.out.println("Main method");
       
		PrintingPress press = new DigitalPrintingPress("Aashta Press", "Delhi", 5000, 1, true);

        // static method call
		System.out.println("\n-----Static method-----\n");
        PrintingPress.printSetup();
        PrintingPress.maintainance();;
        PrintingPress.cleanPress();
        PrintingPress.restartPress();
        
        int maxCapacity = PrintingPress.getMaxProductionCapacity();
        System.out.println("Max production capacity: " + maxCapacity);

        // instance method call
        System.out.println("\n-----Instance method-----\n");
        press.startPrinting();
        press.changePrintPrice(2);
        press.displayPressDetails();
        press.stopPrinting();
        
      
        int totalCost = press.calculateTotalPrintCost(1000);
        System.out.println("Total print cost for 1000 prints:" + totalCost);

        
        // abstract method
        System.out.println("\n-----Abstract method-----\n");
        press.printColor();
        press.setInkType();;
        press.calculatePrintCost();
        press.performPrintTest();
        
       
    }
}
