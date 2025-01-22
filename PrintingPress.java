package com.xworkz.assign.things;

public abstract class PrintingPress {
    
    // Instance variables
    private String pressName;
    private String location;
    private int productionCapacity;
    private int pricePerPrint;
    private boolean isDigitalPress;
    
    // Constructor
    
    public PrintingPress() {
    	
    }
    
    public PrintingPress(String pressName, String location, int productionCapacity, int pricePerPrint, boolean isDigitalPress) {
        this.pressName = pressName;
        this.location = location;
        this.productionCapacity = productionCapacity;
        this.pricePerPrint = pricePerPrint;
        this.isDigitalPress = isDigitalPress;
    }
    
    
    // Static methods
    public static void printSetup() {
        System.out.println("Setting up the printing press");
    }

    public static void maintainance() {
        System.out.println("Performing maintainance on the printing press");
    }

    public static void cleanPress() {
        System.out.println("Cleaning the printing press");
    }

    public static void restartPress() {
        System.out.println("Restarting the printing press");
    }

    public static int getMaxProductionCapacity() {
        return 10000;
    }
    
    
    // Instance methods
    public void startPrinting() {
        System.out.println("Starting -> " + pressName+" on location -> "+location);
    }

    public void stopPrinting() {
        System.out.println("Stopping the " + pressName);
    }
    
    public void changePrintPrice(int newPrice) {
        pricePerPrint = newPrice;
        System.out.println("New price per print set to:" + pricePerPrint);
    }
    
    public void displayPressDetails() {
        System.out.println("Press Name: " + pressName);
        System.out.println("Location: " + location);
        System.out.println("Production Capacity: " + productionCapacity);
        System.out.println("Price Per Print: " + pricePerPrint);
        System.out.println("Is Digital Press: " + isDigitalPress);
    }

    public int calculateTotalPrintCost(int numberOfPrints) {
      
        int totalCost = numberOfPrints * pricePerPrint;
        return totalCost;
    }

    
    // Abstract methods
    public abstract void printColor();
    
    public abstract void setInkType();
    
    public abstract void calculatePrintCost();
    
    public abstract void performPrintTest();
}
